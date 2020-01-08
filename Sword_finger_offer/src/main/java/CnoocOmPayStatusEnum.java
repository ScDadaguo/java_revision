import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Objects;

public enum  CnoocOmPayStatusEnum {
    /**
     * 待支付
     */
    PAY_STATUS_UN_PAID(100, "un_paid", "待支付"),

    /**
     * 部分阶段支付
     */
    PAY_STATUS_PARTIAL_PAID(201, "partial_paid", "部分支付"),

    PAYING(299,"paying","支付中"),

    /**
     * 已支付
     */
    PAY_STATUS_PAID(200, "paid", "已支付"),

    /**
     * 支付中
     */
    @Deprecated
    PAY_STATUS_PENDING(202, "paid_pending", "支付中"),

    REQUIREMENT_APPROVING(300, "approving", "审批中"),

    REQUIREMENT_EFFECT(400, "effect", "需求单生效/已下单"),

    REQUIREMENT_CLOSED(500, "closed", "需求单关闭"),;

    /**
     * code
     */
    private int code;

    /**
     * 描述
     */
    private String desc;

    private String zhDesc;

    CnoocOmPayStatusEnum(int code, String desc, String zhDesc) {
        this.code = code;
        this.desc = desc;
        this.zhDesc = zhDesc;
    }

    public static CnoocOmPayStatusEnum from(int code){
        for (CnoocOmPayStatusEnum statusEnum : CnoocOmPayStatusEnum.values()){
            if (Objects.equals(statusEnum.code,code)){
                return statusEnum;
            }
        }
        throw new IllegalArgumentException("未找到指定编码的支付状态枚举(CnoocOmPayStatusEnum)，code="+code);
    }
}
