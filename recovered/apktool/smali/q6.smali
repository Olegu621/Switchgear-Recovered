.class public final Lq6;
.super Lsq0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final DEFAULT_INSTANCE:Lq6;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lmr1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmr1;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lvl;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq6;

    .line 2
    .line 3
    invoke-direct {v0}, Lq6;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq6;->DEFAULT_INSTANCE:Lq6;

    .line 7
    .line 8
    const-class v1, Lq6;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lsq0;->t(Ljava/lang/Class;Lsq0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lsq0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvl;->b:Ltl;

    .line 5
    .line 6
    iput-object v0, p0, Lq6;->keyValue_:Lvl;

    .line 7
    .line 8
    return-void
.end method

.method public static A()Lp6;
    .locals 1

    .line 1
    sget-object v0, Lq6;->DEFAULT_INSTANCE:Lq6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsq0;->h()Loq0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp6;

    .line 8
    .line 9
    return-object v0
.end method

.method public static B(Lvl;Ldg0;)Lq6;
    .locals 1

    .line 1
    sget-object v0, Lq6;->DEFAULT_INSTANCE:Lq6;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lsq0;->r(Lsq0;Lvl;Ldg0;)Lsq0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lq6;

    .line 8
    .line 9
    return-object p0
.end method

.method public static w(Lq6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lq6;->version_:I

    .line 3
    .line 4
    return-void
.end method

.method public static x(Lq6;Ltl;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq6;->keyValue_:Lvl;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final i(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Len;->y(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lf42;->p()V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_0
    sget-object p0, Lq6;->PARSER:Lmr1;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-class p1, Lq6;

    .line 18
    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    sget-object p0, Lq6;->PARSER:Lmr1;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    new-instance p0, Lqq0;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object p0, Lq6;->PARSER:Lmr1;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p1

    .line 35
    return-object p0

    .line 36
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0

    .line 38
    :cond_1
    return-object p0

    .line 39
    :pswitch_1
    sget-object p0, Lq6;->DEFAULT_INSTANCE:Lq6;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, Lp6;

    .line 43
    .line 44
    sget-object p1, Lq6;->DEFAULT_INSTANCE:Lq6;

    .line 45
    .line 46
    invoke-direct {p0, p1}, Loq0;-><init>(Lsq0;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    new-instance p0, Lq6;

    .line 51
    .line 52
    invoke-direct {p0}, Lq6;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_4
    const-string p0, "version_"

    .line 57
    .line 58
    const-string p1, "keyValue_"

    .line 59
    .line 60
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n"

    .line 65
    .line 66
    sget-object v0, Lq6;->DEFAULT_INSTANCE:Lq6;

    .line 67
    .line 68
    new-instance v1, Ls02;

    .line 69
    .line 70
    invoke-direct {v1, v0, p1, p0}, Ls02;-><init>(Lw;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    :pswitch_5
    return-object p1

    .line 75
    :pswitch_6
    const/4 p0, 0x1

    .line 76
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y()Lvl;
    .locals 0

    .line 1
    iget-object p0, p0, Lq6;->keyValue_:Lvl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z()I
    .locals 0

    .line 1
    iget p0, p0, Lq6;->version_:I

    .line 2
    .line 3
    return p0
.end method
