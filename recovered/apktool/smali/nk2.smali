.class public final Lnk2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final U:Lnk2;

.field public static final V:Lnk2;

.field public static final b:Lnk2;

.field public static final c:Lnk2;

.field public static final d:Lnk2;

.field public static final e:Lnk2;

.field public static final f:Lnk2;

.field public static final i:Lnk2;

.field public static final v:Lnk2;

.field public static final w:Lnk2;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnk2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnk2;->b:Lnk2;

    .line 9
    .line 10
    new-instance v0, Lnk2;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnk2;->c:Lnk2;

    .line 17
    .line 18
    new-instance v0, Lnk2;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lnk2;->d:Lnk2;

    .line 25
    .line 26
    new-instance v0, Lnk2;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lnk2;->e:Lnk2;

    .line 33
    .line 34
    new-instance v0, Lnk2;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lnk2;->f:Lnk2;

    .line 41
    .line 42
    new-instance v0, Lnk2;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lnk2;->i:Lnk2;

    .line 49
    .line 50
    new-instance v0, Lnk2;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lnk2;->v:Lnk2;

    .line 57
    .line 58
    new-instance v0, Lnk2;

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lnk2;->w:Lnk2;

    .line 65
    .line 66
    new-instance v0, Lnk2;

    .line 67
    .line 68
    const/16 v2, 0x8

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lnk2;->U:Lnk2;

    .line 74
    .line 75
    new-instance v0, Lnk2;

    .line 76
    .line 77
    const/16 v2, 0x9

    .line 78
    .line 79
    invoke-direct {v0, v1, v2}, Lnk2;-><init>(II)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lnk2;->V:Lnk2;

    .line 83
    .line 84
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 10
    iput p2, p0, Lnk2;->a:I

    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lqk2;)V
    .locals 0

    .line 1
    const/16 p1, 0xc

    .line 2
    .line 3
    iput p1, p0, Lnk2;->a:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Lnk2;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0, v0, p1}, Lqk2;->m(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p1, Lzu0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object p0, Le03;->a:Le03;

    .line 56
    .line 57
    invoke-static {p1}, Le03;->b(Ljava/lang/Throwable;)Lvz2;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {}, Le03;->e()Lfb1;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-nez p1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p1}, Lfb1;->e()Li03;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "Usercentrics SDK was not able to initialize online, let\'s try to initialize offline"

    .line 73
    .line 74
    invoke-interface {v0, v1, p0}, Li03;->c(Ljava/lang/String;Lvz2;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lfb1;->b()Lx80;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Ltm;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    const/16 v3, 0xc

    .line 85
    .line 86
    invoke-direct {v1, p1, p0, v2, v3}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 90
    .line 91
    .line 92
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_7
    check-cast p1, Ltz2;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_9
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_a
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_b
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->c:Ljava/lang/String;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
