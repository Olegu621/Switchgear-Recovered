.class public final Lnw1;
.super Ltq0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final DEFAULT_INSTANCE:Lnw1;

.field private static volatile PARSER:Lnr1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnr1;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Lgc1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnw1;

    .line 2
    .line 3
    invoke-direct {v0}, Lnw1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnw1;->DEFAULT_INSTANCE:Lnw1;

    .line 7
    .line 8
    const-class v1, Lnw1;

    .line 9
    .line 10
    invoke-static {v1, v0}, Ltq0;->j(Ljava/lang/Class;Ltq0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ltq0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgc1;->b:Lgc1;

    .line 5
    .line 6
    iput-object v0, p0, Lnw1;->preferences_:Lgc1;

    .line 7
    .line 8
    return-void
.end method

.method public static l(Lnw1;)Lgc1;
    .locals 2

    .line 1
    iget-object v0, p0, Lnw1;->preferences_:Lgc1;

    .line 2
    .line 3
    iget-boolean v1, v0, Lgc1;->a:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lgc1;->b()Lgc1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lnw1;->preferences_:Lgc1;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lnw1;->preferences_:Lgc1;

    .line 14
    .line 15
    return-object p0
.end method

.method public static n()Llw1;
    .locals 2

    .line 1
    sget-object v0, Lnw1;->DEFAULT_INSTANCE:Lnw1;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-virtual {v0, v1}, Lnw1;->c(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lpq0;

    .line 9
    .line 10
    check-cast v0, Llw1;

    .line 11
    .line 12
    return-object v0
.end method

.method public static o(Ljava/io/InputStream;)Lnw1;
    .locals 5

    .line 1
    sget-object v0, Lnw1;->DEFAULT_INSTANCE:Lnw1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lfz0;->b:[B

    .line 7
    .line 8
    array-length v2, p0

    .line 9
    new-instance v3, Lew;

    .line 10
    .line 11
    invoke-direct {v3, p0, v1, v2, v1}, Lew;-><init>([BIIZ)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v3, v2}, Lew;->l(I)I
    :try_end_0
    .catch Lqz0; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    invoke-static {p0}, Ln4;->n(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance v3, Lgw;

    .line 25
    .line 26
    invoke-direct {v3, p0}, Lgw;-><init>(Ljava/io/InputStream;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {}, Leg0;->a()Leg0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0}, Ltq0;->i()Ltq0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_1
    sget-object v2, Lcz1;->c:Lcz1;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v2, v4}, Lcz1;->a(Ljava/lang/Class;)Li72;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v4, v3, Lhw;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Liw;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance v4, Liw;

    .line 58
    .line 59
    invoke-direct {v4, v3, v1}, Liw;-><init>(Lhw;B)V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-interface {v2, v0, v4, p0}, Li72;->d(Ljava/lang/Object;Liw;Leg0;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2, v0}, Li72;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lqz0; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lnx2; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    invoke-static {v0, p0}, Ltq0;->f(Ltq0;Z)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    check-cast v0, Lnw1;

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_2
    new-instance p0, Lnx2;

    .line 79
    .line 80
    invoke-direct {p0}, Lnx2;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lqz0;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :catch_1
    move-exception p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    instance-of v0, v0, Lqz0;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Lqz0;

    .line 107
    .line 108
    throw p0

    .line 109
    :cond_3
    throw p0

    .line 110
    :catch_2
    move-exception p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    instance-of v0, v0, Lqz0;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Lqz0;

    .line 124
    .line 125
    throw p0

    .line 126
    :cond_4
    new-instance v0, Lqz0;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :catch_3
    move-exception p0

    .line 137
    new-instance v0, Lqz0;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :catch_4
    move-exception p0

    .line 148
    iget-boolean v0, p0, Lqz0;->a:Z

    .line 149
    .line 150
    if-eqz v0, :cond_5

    .line 151
    .line 152
    new-instance v0, Lqz0;

    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    move-object p0, v0

    .line 162
    :cond_5
    throw p0
.end method


# virtual methods
.method public final c(I)Ljava/lang/Object;
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
    sget-object p0, Lnw1;->PARSER:Lnr1;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-class p1, Lnw1;

    .line 18
    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    sget-object p0, Lnw1;->PARSER:Lnr1;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    new-instance p0, Lrq0;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object p0, Lnw1;->PARSER:Lnr1;

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
    sget-object p0, Lnw1;->DEFAULT_INSTANCE:Lnw1;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, Llw1;

    .line 43
    .line 44
    sget-object p1, Lnw1;->DEFAULT_INSTANCE:Lnw1;

    .line 45
    .line 46
    invoke-direct {p0, p1}, Lpq0;-><init>(Ltq0;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    new-instance p0, Lnw1;

    .line 51
    .line 52
    invoke-direct {p0}, Lnw1;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_4
    const-string p0, "preferences_"

    .line 57
    .line 58
    sget-object p1, Lmw1;->a:Lbc1;

    .line 59
    .line 60
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    .line 65
    .line 66
    sget-object v0, Lnw1;->DEFAULT_INSTANCE:Lnw1;

    .line 67
    .line 68
    new-instance v1, Lt02;

    .line 69
    .line 70
    invoke-direct {v1, v0, p1, p0}, Lt02;-><init>(Ltq0;Ljava/lang/String;[Ljava/lang/Object;)V

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

.method public final m()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lnw1;->preferences_:Lgc1;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
