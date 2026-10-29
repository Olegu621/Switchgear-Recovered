.class public final Lqj1;
.super Landroid/os/Handler;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lqj1;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .line 8
    const/4 v0, 0x0

    iput v0, p0, Lqj1;->a:I

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget p0, p0, Lqj1;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lcom/supercell/titan/NativeHTTPConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    sget-object p1, Lcom/supercell/titan/NativeHTTPClientManager;->c:Ljava/util/Vector;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    const-string p1, "NativeHTTPClientManager"

    .line 18
    .line 19
    const-string v0, "NativeHTTPClientManager.HTTPClientHandler"

    .line 20
    .line 21
    invoke-static {p1, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :pswitch_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lpj1;

    .line 31
    .line 32
    iget p1, p1, Landroid/os/Message;->what:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    if-eq p1, v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    if-eq p1, v0, :cond_0

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_0
    iget-object p0, p0, Lpj1;->a:Lvd;

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    iget-object p1, p0, Lpj1;->a:Lvd;

    .line 45
    .line 46
    iget-object p0, p0, Lpj1;->b:[Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    aget-object p0, p0, v0

    .line 50
    .line 51
    iget-object v0, p1, Lvd;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v1, 0x0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object p0, p1, Lvd;->f:Ljava/util/concurrent/CountDownLatch;

    .line 61
    .line 62
    :try_start_1
    iget-object v0, p1, Lvd;->i:Llc3;

    .line 63
    .line 64
    iget-object v2, v0, Llc3;->h:Lvd;

    .line 65
    .line 66
    if-ne v2, p1, :cond_2

    .line 67
    .line 68
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 69
    .line 70
    .line 71
    iput-object v1, v0, Llc3;->h:Lvd;

    .line 72
    .line 73
    invoke-virtual {v0}, Llc3;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_3
    :try_start_2
    iget-object v0, p1, Lvd;->i:Llc3;

    .line 86
    .line 87
    iget-object v2, v0, Llc3;->g:Lvd;

    .line 88
    .line 89
    if-eq v2, p1, :cond_4

    .line 90
    .line 91
    iget-object p0, v0, Llc3;->h:Lvd;

    .line 92
    .line 93
    if-ne p0, p1, :cond_7

    .line 94
    .line 95
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 96
    .line 97
    .line 98
    iput-object v1, v0, Llc3;->h:Lvd;

    .line 99
    .line 100
    invoke-virtual {v0}, Llc3;->b()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    iget-boolean v2, v0, Llc3;->c:Z

    .line 105
    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 110
    .line 111
    .line 112
    iput-object v1, v0, Llc3;->g:Lvd;

    .line 113
    .line 114
    iget-object v0, v0, Llc3;->a:Lc91;

    .line 115
    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-ne v1, v2, :cond_6

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Lrk1;->j(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_6
    invoke-virtual {v0, p0}, Lrk1;->k(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_1
    iget-object p0, p1, Lvd;->f:Ljava/util/concurrent/CountDownLatch;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 138
    .line 139
    .line 140
    :goto_2
    const/4 p0, 0x3

    .line 141
    iput p0, p1, Lvd;->c:I

    .line 142
    .line 143
    :goto_3
    return-void

    .line 144
    :catchall_1
    move-exception p0

    .line 145
    iget-object p1, p1, Lvd;->f:Ljava/util/concurrent/CountDownLatch;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 148
    .line 149
    .line 150
    throw p0

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
