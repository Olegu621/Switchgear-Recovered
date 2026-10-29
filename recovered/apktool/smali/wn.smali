.class public final Lwn;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ly92;

.field public final b:Lnt0;

.field public c:Lvn;

.field public d:Ljava/util/concurrent/ScheduledFuture;

.field public final e:Lun;

.field public final synthetic f:Lxn;


# direct methods
.method public constructor <init>(Lxn;Ly92;Lnt0;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwn;->f:Lxn;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lwn;->a:Ly92;

    .line 7
    .line 8
    iput-object p3, p0, Lwn;->b:Lnt0;

    .line 9
    .line 10
    new-instance p1, Lun;

    .line 11
    .line 12
    invoke-direct {p1, p0, p4, p5}, Lun;-><init>(Lwn;J)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lwn;->e:Lun;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lwn;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Cancelling scheduled re-open: "

    .line 9
    .line 10
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lwn;->c:Lvn;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, Lwn;->f:Lxn;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lwn;->c:Lvn;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    iput-boolean v2, v0, Lvn;->b:Z

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lwn;->c:Lvn;

    .line 34
    .line 35
    iget-object v3, p0, Lwn;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 36
    .line 37
    invoke-interface {v3, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lwn;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    return v1
.end method

.method public final b()V
    .locals 10

    .line 1
    iget-object v0, p0, Lwn;->c:Lvn;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    invoke-static {v3, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lwn;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v1, v2

    .line 20
    :goto_1
    invoke-static {v3, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lwn;->e:Lun;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    iget-wide v6, v0, Lun;->b:J

    .line 33
    .line 34
    const-wide/16 v8, -0x1

    .line 35
    .line 36
    cmp-long v1, v6, v8

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    iput-wide v4, v0, Lun;->b:J

    .line 41
    .line 42
    :cond_2
    iget-wide v6, v0, Lun;->b:J

    .line 43
    .line 44
    sub-long/2addr v4, v6

    .line 45
    invoke-virtual {v0}, Lun;->b()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-long v6, v1

    .line 50
    cmp-long v1, v4, v6

    .line 51
    .line 52
    iget-object v4, p0, Lwn;->f:Lxn;

    .line 53
    .line 54
    if-ltz v1, :cond_3

    .line 55
    .line 56
    iput-wide v8, v0, Lun;->b:J

    .line 57
    .line 58
    new-instance p0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "Camera reopening attempted for "

    .line 61
    .line 62
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lun;->b()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "ms without success."

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v0, "Camera2CameraImpl"

    .line 82
    .line 83
    invoke-static {v0, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x4

    .line 87
    invoke-virtual {v4, p0, v3, v2}, Lxn;->D(ILff;Z)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    new-instance v1, Lvn;

    .line 92
    .line 93
    iget-object v2, p0, Lwn;->a:Ly92;

    .line 94
    .line 95
    invoke-direct {v1, p0, v2}, Lvn;-><init>(Lwn;Ly92;)V

    .line 96
    .line 97
    .line 98
    iput-object v1, p0, Lwn;->c:Lvn;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, "Attempting camera re-open in "

    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lun;->a()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v2, "ms: "

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v2, p0, Lwn;->c:Lvn;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v2, " activeResuming = "

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-boolean v2, v4, Lxn;->n0:Z

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v4, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lwn;->c:Lvn;

    .line 142
    .line 143
    invoke-virtual {v0}, Lun;->a()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    int-to-long v2, v0

    .line 148
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 149
    .line 150
    iget-object v4, p0, Lwn;->b:Lnt0;

    .line 151
    .line 152
    invoke-virtual {v4, v1, v2, v3, v0}, Lnt0;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p0, Lwn;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 157
    .line 158
    return-void
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 2
    .line 3
    iget-boolean v0, p0, Lxn;->n0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget p0, p0, Lxn;->V:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne p0, v1, :cond_1

    .line 14
    .line 15
    :cond_0
    return v0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 2
    .line 3
    const-string v1, "CameraDevice.onClosed()"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 9
    .line 10
    iget-object v0, v0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v4, "Unexpected onClose callback on camera device: "

    .line 22
    .line 23
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lwn;->f:Lxn;

    .line 37
    .line 38
    iget p1, p1, Lxn;->s0:I

    .line 39
    .line 40
    invoke-static {p1}, Len;->y(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eq p1, v2, :cond_4

    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    if-eq p1, v0, :cond_4

    .line 48
    .line 49
    const/4 v0, 0x5

    .line 50
    if-eq p1, v0, :cond_2

    .line 51
    .line 52
    const/4 v0, 0x6

    .line 53
    if-ne p1, v0, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 57
    .line 58
    iget p0, p0, Lxn;->s0:I

    .line 59
    .line 60
    invoke-static {p0}, Len;->A(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "Camera closed while in state: "

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    :goto_1
    iget-object p1, p0, Lwn;->f:Lxn;

    .line 75
    .line 76
    iget v0, p1, Lxn;->V:I

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-static {v0}, Lxn;->u(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v1, "Camera closed due to error: "

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p1, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lwn;->b()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    invoke-virtual {p1, v1}, Lxn;->I(Z)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    iget-object p1, p0, Lwn;->f:Lxn;

    .line 102
    .line 103
    iget-object p1, p1, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-static {v0, p1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 114
    .line 115
    invoke-virtual {p0}, Lxn;->q()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 2
    .line 3
    const-string v1, "CameraDevice.onDisconnected()"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, p1, v0}, Lwn;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 2
    .line 3
    iput-object p1, v0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 4
    .line 5
    iput p2, v0, Lxn;->V:I

    .line 6
    .line 7
    iget-object v0, v0, Lxn;->r0:Lcb;

    .line 8
    .line 9
    iget-object v1, v0, Lcb;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lxn;

    .line 12
    .line 13
    const-string v2, "Camera receive onErrorCallback"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lxn;->s(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcb;->l()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 22
    .line 23
    iget v0, v0, Lxn;->s0:I

    .line 24
    .line 25
    invoke-static {v0}, Len;->y(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v1, "Camera2CameraImpl"

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eq v0, v2, :cond_7

    .line 33
    .line 34
    packed-switch v0, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 38
    .line 39
    iget p0, p0, Lxn;->s0:I

    .line 40
    .line 41
    invoke-static {p0}, Len;->A(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string p1, "onError() should not be possible from state: "

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 59
    .line 60
    iget v0, v0, Lxn;->s0:I

    .line 61
    .line 62
    invoke-static {v0}, Len;->v(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 69
    .line 70
    iget v0, v0, Lxn;->s0:I

    .line 71
    .line 72
    const/16 v3, 0x8

    .line 73
    .line 74
    const/4 v4, 0x6

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x7

    .line 77
    if-eq v0, v3, :cond_1

    .line 78
    .line 79
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 80
    .line 81
    iget v0, v0, Lxn;->s0:I

    .line 82
    .line 83
    const/16 v3, 0x9

    .line 84
    .line 85
    if-eq v0, v3, :cond_1

    .line 86
    .line 87
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 88
    .line 89
    iget v0, v0, Lxn;->s0:I

    .line 90
    .line 91
    const/16 v3, 0xa

    .line 92
    .line 93
    if-eq v0, v3, :cond_1

    .line 94
    .line 95
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 96
    .line 97
    iget v0, v0, Lxn;->s0:I

    .line 98
    .line 99
    if-eq v0, v6, :cond_1

    .line 100
    .line 101
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 102
    .line 103
    iget v0, v0, Lxn;->s0:I

    .line 104
    .line 105
    if-ne v0, v4, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    move v0, v5

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    :goto_0
    move v0, v2

    .line 111
    :goto_1
    iget-object v3, p0, Lwn;->f:Lxn;

    .line 112
    .line 113
    iget v3, v3, Lxn;->s0:I

    .line 114
    .line 115
    invoke-static {v3}, Len;->A(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-string v7, "Attempt to handle open error from non open state: "

    .line 120
    .line 121
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-static {v3, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    const/4 v3, 0x3

    .line 130
    const/4 v7, 0x2

    .line 131
    if-eq p2, v2, :cond_3

    .line 132
    .line 133
    if-eq p2, v7, :cond_3

    .line 134
    .line 135
    const/4 v8, 0x4

    .line 136
    if-eq p2, v8, :cond_3

    .line 137
    .line 138
    new-instance v5, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v6, "Error observed on open (or opening) camera device "

    .line 141
    .line 142
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p1, ": "

    .line 153
    .line 154
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-static {p2}, Lxn;->u(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string p1, " closing camera."

    .line 165
    .line 166
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-static {v1, p1}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const/4 p1, 0x5

    .line 177
    if-ne p2, v3, :cond_2

    .line 178
    .line 179
    move v4, p1

    .line 180
    :cond_2
    iget-object p2, p0, Lwn;->f:Lxn;

    .line 181
    .line 182
    new-instance v1, Lff;

    .line 183
    .line 184
    invoke-direct {v1, v4, v0}, Lff;-><init>(ILjava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p1, v1, v2}, Lxn;->D(ILff;Z)V

    .line 188
    .line 189
    .line 190
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 191
    .line 192
    invoke-virtual {p0}, Lxn;->p()V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_3
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 203
    .line 204
    iget p1, p0, Lxn;->V:I

    .line 205
    .line 206
    if-eqz p1, :cond_4

    .line 207
    .line 208
    move v5, v2

    .line 209
    :cond_4
    const-string p1, "Can only reopen camera device after error if the camera device is actually in an error state."

    .line 210
    .line 211
    invoke-static {p1, v5}, Lde3;->j(Ljava/lang/String;Z)V

    .line 212
    .line 213
    .line 214
    if-eq p2, v2, :cond_6

    .line 215
    .line 216
    if-eq p2, v7, :cond_5

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    move v3, v2

    .line 220
    goto :goto_2

    .line 221
    :cond_6
    move v3, v7

    .line 222
    :goto_2
    new-instance p1, Lff;

    .line 223
    .line 224
    invoke-direct {p1, v3, v0}, Lff;-><init>(ILjava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v6, p1, v2}, Lxn;->D(ILff;Z)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lxn;->p()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_7
    :pswitch_1
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-static {p2}, Lxn;->u(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 243
    .line 244
    iget v0, v0, Lxn;->s0:I

    .line 245
    .line 246
    invoke-static {v0}, Len;->v(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const-string v2, "CameraDevice.onError(): "

    .line 251
    .line 252
    const-string v3, " failed with "

    .line 253
    .line 254
    const-string v4, " while in "

    .line 255
    .line 256
    invoke-static {v2, p1, v3, p2, v4}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string p2, " state. Will finish closing camera."

    .line 264
    .line 265
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-static {v1, p1}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 276
    .line 277
    invoke-virtual {p0}, Lxn;->p()V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 2
    .line 3
    const-string v1, "CameraDevice.onOpened()"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 9
    .line 10
    iput-object p1, v0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, v0, Lxn;->V:I

    .line 14
    .line 15
    iget-object v1, p0, Lwn;->e:Lun;

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    iput-wide v2, v1, Lun;->b:J

    .line 20
    .line 21
    iget v0, v0, Lxn;->s0:I

    .line 22
    .line 23
    invoke-static {v0}, Len;->y(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-eq v0, v1, :cond_3

    .line 32
    .line 33
    const/4 v1, 0x5

    .line 34
    if-eq v0, v1, :cond_1

    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    if-ne v0, v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 44
    .line 45
    iget p0, p0, Lxn;->s0:I

    .line 46
    .line 47
    invoke-static {p0}, Len;->A(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "onOpened() should not be possible from state: "

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    :goto_0
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 62
    .line 63
    const/16 v1, 0x9

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lxn;->E(I)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lwn;->f:Lxn;

    .line 69
    .line 70
    iget-object v0, v0, Lxn;->b0:Llq;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v1, p0, Lwn;->f:Lxn;

    .line 77
    .line 78
    iget-object v2, v1, Lxn;->a0:Lkn;

    .line 79
    .line 80
    iget-object v1, v1, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v2, v1}, Lkn;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, p1, v1}, Llq;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_2

    .line 95
    .line 96
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 97
    .line 98
    invoke-virtual {p0}, Lxn;->A()V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :cond_3
    iget-object p1, p0, Lwn;->f:Lxn;

    .line 103
    .line 104
    iget-object p1, p1, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-static {v0, p1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lwn;->f:Lxn;

    .line 115
    .line 116
    iget-object p1, p1, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, Lwn;->f:Lxn;

    .line 122
    .line 123
    iput-object v0, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 124
    .line 125
    return-void
.end method
