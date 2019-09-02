package ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestFutureTask {

    /**
     * @param args
     * @create_time 2011-6-24 下午03:41:57
     */
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,3,2,TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),new ThreadPoolExecutor.AbortPolicy());
        List<FutureTask<String>> tasks=new ArrayList<FutureTask<String>>();
        for(int i=0;i<10;i++){
            FutureTask<String> futureTask=new FutureTask<String>(new ThreadPoolTask(i));
            pool.submit(futureTask);
            tasks.add(futureTask);
        }
        System.out.println("任务提交结束");
        for (FutureTask<String> futureTask : tasks) {
            try {
                //阻塞一直等待执行完成拿到结果
//                System.out.println("future result:"+futureTask.get());
                //阻塞一直等待执行完成拿到结果，如果在超时时间内，没有拿到则抛出异常
                System.out.println("future result:"+futureTask.get(1,TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } //捕获超时异常
            catch (TimeoutException e) {
                System.out.println("null");;
            }
//            catch (TimeoutException e) {
//                e.printStackTrace();
//            }
        }
    }
    /**
     * 执行业务计算
     *
     * @date 2011-6-24
     * Copyright (C) 2010-2012 www.2caipiao.com Inc. All rights reserved.
     */
    public static class ThreadPoolTask implements Callable<String> {

        private int value;

        public ThreadPoolTask(int value){
            this.value=value;
        }
        @Override
        public String call() throws Exception {
            //计算
            System.out.println("value-----"+value++);
            Thread.sleep(2000);
            return String.valueOf(value);
        }

    }

}