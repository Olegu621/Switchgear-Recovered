.class public final Ljs0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 30
    const/4 v0, 0x4

    iput v0, p0, Ljs0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 25
    iput p1, p0, Ljs0;->a:I

    iput-object p2, p0, Ljs0;->d:Ljava/lang/Object;

    iput-object p3, p0, Ljs0;->b:Ljava/lang/Object;

    iput-object p4, p0, Ljs0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbx0;Lx61;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Ljs0;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljs0;->c:Ljava/lang/Object;

    iput-object p3, p0, Ljs0;->b:Ljava/lang/Object;

    iput-object p1, p0, Ljs0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Ljs0;->a:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljs0;->c:Ljava/lang/Object;

    iput-object p3, p0, Ljs0;->b:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ljs0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 26
    iput p4, p0, Ljs0;->a:I

    iput-object p1, p0, Ljs0;->b:Ljava/lang/Object;

    iput-object p2, p0, Ljs0;->c:Ljava/lang/Object;

    iput-object p3, p0, Ljs0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljs0;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ljs0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ljs0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ljs0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p1, p0, Ljs0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lpn3;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Ljs0;->a:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljs0;->b:Ljava/lang/Object;

    iput-object p3, p0, Ljs0;->c:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ljs0;->d:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Ljs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ljs0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lpn3;

    .line 9
    .line 10
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lij3;

    .line 13
    .line 14
    iget-object v3, v2, Lij3;->e:Lki3;

    .line 15
    .line 16
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Lki3;->G()Lok3;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Lnk3;->c:Lnk3;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Lok3;->i(Lnk3;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    iget-object v3, v2, Lij3;->f:Luh3;

    .line 32
    .line 33
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v3, Luh3;->V:Lsh3;

    .line 37
    .line 38
    const-string v4, "Analytics storage consent denied; will not get app instance id"

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Lsh3;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lij3;

    .line 46
    .line 47
    iget-object v1, v1, Lij3;->X:Lsl3;

    .line 48
    .line 49
    invoke-static {v1}, Lij3;->k(Lwg3;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v2, Lij3;->e:Lki3;

    .line 59
    .line 60
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Lki3;->i:Ltj;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ltj;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    .line 70
    .line 71
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 72
    .line 73
    .line 74
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    goto :goto_4

    .line 78
    :catchall_1
    move-exception v1

    .line 79
    goto :goto_3

    .line 80
    :catch_0
    move-exception v1

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    :try_start_2
    iget-object v3, v1, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 83
    .line 84
    if-nez v3, :cond_1

    .line 85
    .line 86
    iget-object v1, v2, Lij3;->f:Luh3;

    .line 87
    .line 88
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 92
    .line 93
    const-string v2, "Failed to get app instance id"

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    iget-object v4, p0, Ljs0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzr;

    .line 102
    .line 103
    invoke-interface {v3, v4}, Lcom/google/android/gms/measurement/internal/zzga;->k0(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    iget-object v4, v1, Lsq3;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Lij3;

    .line 121
    .line 122
    iget-object v4, v4, Lij3;->X:Lsl3;

    .line 123
    .line 124
    invoke-static {v4}, Lij3;->k(Lwg3;)V

    .line 125
    .line 126
    .line 127
    iget-object v4, v4, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 128
    .line 129
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v2, Lij3;->e:Lki3;

    .line 133
    .line 134
    invoke-static {v2}, Lij3;->j(Lsq3;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, v2, Lki3;->i:Ltj;

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ltj;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_2
    invoke-virtual {v1}, Lpn3;->M()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 143
    .line 144
    .line 145
    :try_start_3
    iget-object p0, p0, Ljs0;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :goto_1
    :try_start_4
    iget-object v2, p0, Ljs0;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v2, Lpn3;

    .line 153
    .line 154
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, Lij3;

    .line 157
    .line 158
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 159
    .line 160
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 161
    .line 162
    .line 163
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 164
    .line 165
    const-string v3, "Failed to get app instance id"

    .line 166
    .line 167
    invoke-virtual {v2, v1, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 168
    .line 169
    .line 170
    :try_start_5
    iget-object p0, p0, Ljs0;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 173
    .line 174
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 175
    .line 176
    .line 177
    monitor-exit v0

    .line 178
    return-void

    .line 179
    :goto_3
    iget-object p0, p0, Ljs0;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 184
    .line 185
    .line 186
    throw v1

    .line 187
    :goto_4
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 188
    throw p0
.end method

.method private final b()V
    .locals 9

    .line 1
    const-string v0, "Failed to get app instance id"

    .line 2
    .line 3
    iget-object v1, p0, Ljs0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 6
    .line 7
    iget-object v2, p0, Ljs0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lpn3;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_0
    iget-object v4, v2, Lsq3;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v4, Lij3;

    .line 15
    .line 16
    iget-object v5, v4, Lij3;->e:Lki3;

    .line 17
    .line 18
    iget-object v6, v4, Lij3;->f:Luh3;

    .line 19
    .line 20
    invoke-static {v5}, Lij3;->j(Lsq3;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Lki3;->G()Lok3;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    sget-object v8, Lnk3;->c:Lnk3;

    .line 28
    .line 29
    invoke-virtual {v7, v8}, Lok3;->i(Lnk3;)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_0

    .line 34
    .line 35
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v6, Luh3;->V:Lsh3;

    .line 39
    .line 40
    const-string v6, "Analytics storage consent denied; will not get app instance id"

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Lsh3;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, v4, Lij3;->X:Lsl3;

    .line 46
    .line 47
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5}, Lij3;->j(Lsq3;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, v5, Lki3;->i:Ltj;

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Ltj;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_4

    .line 66
    :catch_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    iget-object v7, v2, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 69
    .line 70
    if-nez v7, :cond_1

    .line 71
    .line 72
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, v6, Luh3;->f:Lsh3;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :goto_0
    iget-object p0, v4, Lij3;->w:Lup3;

    .line 81
    .line 82
    :goto_1
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v3, v1}, Lup3;->h0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    :try_start_1
    iget-object p0, p0, Ljs0;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 92
    .line 93
    invoke-interface {v7, p0}, Lcom/google/android/gms/measurement/internal/zzga;->k0(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    iget-object p0, v4, Lij3;->X:Lsl3;

    .line 100
    .line 101
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 105
    .line 106
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v5}, Lij3;->j(Lsq3;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v5, Lki3;->i:Ltj;

    .line 113
    .line 114
    invoke-virtual {p0, v3}, Ltj;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {v2}, Lpn3;->M()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_2
    :try_start_2
    iget-object v4, v2, Lsq3;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v4, Lij3;

    .line 124
    .line 125
    iget-object v4, v4, Lij3;->f:Luh3;

    .line 126
    .line 127
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 128
    .line 129
    .line 130
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 131
    .line 132
    invoke-virtual {v4, p0, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    :goto_3
    iget-object p0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Lij3;

    .line 138
    .line 139
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_4
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Lij3;

    .line 145
    .line 146
    iget-object v0, v0, Lij3;->w:Lup3;

    .line 147
    .line 148
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3, v1}, Lup3;->h0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 152
    .line 153
    .line 154
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ljs0;->a:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v5, 0x3

    .line 7
    const/4 v6, 0x4

    .line 8
    const/4 v7, 0x2

    .line 9
    const/4 v9, 0x1

    .line 10
    const/4 v10, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lac3;

    .line 17
    .line 18
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Luh3;

    .line 21
    .line 22
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/app/job/JobParameters;

    .line 25
    .line 26
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 27
    .line 28
    const-string v3, "AppMeasurementJobService processed last upload request."

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lac3;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroid/app/Service;

    .line 36
    .line 37
    check-cast v0, Lvn3;

    .line 38
    .line 39
    invoke-interface {v0, v1}, Lvn3;->b(Landroid/app/job/JobParameters;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lpn3;

    .line 46
    .line 47
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 50
    .line 51
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 54
    .line 55
    iget-object v3, v0, Lsq3;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lij3;

    .line 58
    .line 59
    iget-object v4, v0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 60
    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 64
    .line 65
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 69
    .line 70
    const-string v1, "[sgtm] Discarding data. Failed to update batch upload status."

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    :try_start_0
    invoke-interface {v4, v2, v1}, Lcom/google/android/gms/measurement/internal/zzga;->M(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lpn3;->M()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catch_0
    move-exception v0

    .line 84
    iget-object v2, v3, Lij3;->f:Luh3;

    .line 85
    .line 86
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 90
    .line 91
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->a:J

    .line 92
    .line 93
    const-string v1, "[sgtm] Failed to update batch upload status, rowId, exception"

    .line 94
    .line 95
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v2, v3, v1, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    return-void

    .line 103
    :pswitch_1
    invoke-direct {v1}, Ljs0;->b()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_2
    invoke-direct {v1}, Ljs0;->a()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_3
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 114
    .line 115
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 118
    .line 119
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 122
    .line 123
    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 124
    .line 125
    invoke-virtual {v10}, Lmp3;->A()V

    .line 126
    .line 127
    .line 128
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v11, v10, Lmp3;->p0:Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v10}, Lmp3;->b()Lbj3;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lbj3;->y()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10}, Lmp3;->k0()V

    .line 143
    .line 144
    .line 145
    iget-object v12, v10, Lmp3;->c:Lae3;

    .line 146
    .line 147
    invoke-static {v12}, Lmp3;->S(Lwo3;)V

    .line 148
    .line 149
    .line 150
    iget-wide v14, v1, Lcom/google/android/gms/measurement/internal/zzaf;->a:J

    .line 151
    .line 152
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->c:J

    .line 153
    .line 154
    invoke-virtual {v12}, Lsq3;->y()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Lwo3;->A()V

    .line 158
    .line 159
    .line 160
    :try_start_1
    invoke-virtual {v12}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 161
    .line 162
    .line 163
    move-result-object v16

    .line 164
    const-string v17, "upload_queue"

    .line 165
    .line 166
    const-string v18, "rowId"

    .line 167
    .line 168
    const-string v19, "app_id"

    .line 169
    .line 170
    const-string v20, "measurement_batch"

    .line 171
    .line 172
    const-string v21, "upload_uri"

    .line 173
    .line 174
    const-string v22, "upload_headers"

    .line 175
    .line 176
    const-string v23, "upload_type"

    .line 177
    .line 178
    const-string v24, "retry_count"

    .line 179
    .line 180
    const-string v25, "creation_timestamp"

    .line 181
    .line 182
    const-string v26, "associated_row_id"

    .line 183
    .line 184
    const-string v27, "last_upload_timestamp"

    .line 185
    .line 186
    filled-new-array/range {v18 .. v27}, [Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v18

    .line 190
    const-string v19, "rowId=?"

    .line 191
    .line 192
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v20

    .line 196
    filled-new-array/range {v20 .. v20}, [Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v20

    .line 200
    const-string v24, "1"
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    const/16 v22, 0x0

    .line 205
    .line 206
    const/16 v23, 0x0

    .line 207
    .line 208
    const/16 v27, 0x0

    .line 209
    .line 210
    :try_start_2
    invoke-virtual/range {v16 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 211
    .line 212
    .line 213
    move-result-object v8
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 214
    :try_start_3
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 215
    .line 216
    .line 217
    move-result v16

    .line 218
    if-nez v16, :cond_1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_1
    const/16 v16, 0x8

    .line 222
    .line 223
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    invoke-static {v13}, Lkb1;->n(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    move/from16 v17, v16

    .line 231
    .line 232
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 233
    .line 234
    .line 235
    move-result-object v16

    .line 236
    move/from16 v7, v17

    .line 237
    .line 238
    invoke-interface {v8, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v17

    .line 242
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v18

    .line 246
    const/4 v0, 0x5

    .line 247
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v19

    .line 251
    const/4 v0, 0x6

    .line 252
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 253
    .line 254
    .line 255
    move-result v20

    .line 256
    const/4 v0, 0x7

    .line 257
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 258
    .line 259
    .line 260
    move-result-wide v21

    .line 261
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 262
    .line 263
    .line 264
    move-result-wide v23

    .line 265
    const/16 v0, 0x9

    .line 266
    .line 267
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v25

    .line 271
    invoke-virtual/range {v12 .. v26}, Lae3;->c0(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJJ)Lpp3;

    .line 272
    .line 273
    .line 274
    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 275
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 276
    .line 277
    .line 278
    move-object v8, v0

    .line 279
    goto :goto_5

    .line 280
    :catchall_0
    move-exception v0

    .line 281
    goto/16 :goto_a

    .line 282
    .line 283
    :catch_1
    move-exception v0

    .line 284
    goto :goto_3

    .line 285
    :catchall_1
    move-exception v0

    .line 286
    goto :goto_1

    .line 287
    :catch_2
    move-exception v0

    .line 288
    goto :goto_2

    .line 289
    :catchall_2
    move-exception v0

    .line 290
    const/16 v27, 0x0

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :catch_3
    move-exception v0

    .line 294
    const/16 v27, 0x0

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :goto_1
    move-object/from16 v8, v27

    .line 298
    .line 299
    goto/16 :goto_a

    .line 300
    .line 301
    :goto_2
    move-object/from16 v8, v27

    .line 302
    .line 303
    :goto_3
    :try_start_4
    iget-object v7, v12, Lsq3;->a:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v7, Lij3;

    .line 306
    .line 307
    iget-object v7, v7, Lij3;->f:Luh3;

    .line 308
    .line 309
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 310
    .line 311
    .line 312
    iget-object v7, v7, Luh3;->f:Lsh3;

    .line 313
    .line 314
    const-string v12, "Error to querying MeasurementBatch from upload_queue. rowId"

    .line 315
    .line 316
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 317
    .line 318
    .line 319
    move-result-object v13

    .line 320
    invoke-virtual {v7, v13, v12, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 321
    .line 322
    .line 323
    :goto_4
    if-eqz v8, :cond_2

    .line 324
    .line 325
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 326
    .line 327
    .line 328
    :cond_2
    move-object/from16 v8, v27

    .line 329
    .line 330
    :goto_5
    if-nez v8, :cond_3

    .line 331
    .line 332
    invoke-virtual {v10}, Lmp3;->a()Luh3;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    iget-object v0, v0, Luh3;->w:Lsh3;

    .line 337
    .line 338
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    const-string v3, "[sgtm] Queued batch doesn\'t exist. appId, rowId"

    .line 343
    .line 344
    invoke-virtual {v0, v2, v3, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_9

    .line 348
    .line 349
    :cond_3
    iget-object v0, v8, Lpp3;->c:Ljava/lang/String;

    .line 350
    .line 351
    iget v7, v1, Lcom/google/android/gms/measurement/internal/zzaf;->b:I

    .line 352
    .line 353
    if-ne v7, v9, :cond_6

    .line 354
    .line 355
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_4

    .line 360
    .line 361
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    :cond_4
    iget-object v0, v10, Lmp3;->c:Lae3;

    .line 365
    .line 366
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 367
    .line 368
    .line 369
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-virtual {v0, v1}, Lae3;->G(Ljava/lang/Long;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v10}, Lmp3;->a()Luh3;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 381
    .line 382
    const-string v5, "[sgtm] queued batch deleted after successful client upload. appId, rowId"

    .line 383
    .line 384
    invoke-virtual {v0, v2, v5, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    const-wide/16 v0, 0x0

    .line 388
    .line 389
    cmp-long v0, v3, v0

    .line 390
    .line 391
    if-lez v0, :cond_9

    .line 392
    .line 393
    iget-object v0, v10, Lmp3;->c:Lae3;

    .line 394
    .line 395
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 396
    .line 397
    .line 398
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v1, Lij3;

    .line 401
    .line 402
    invoke-virtual {v0}, Lsq3;->y()V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Lwo3;->A()V

    .line 406
    .line 407
    .line 408
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    new-instance v7, Landroid/content/ContentValues;

    .line 413
    .line 414
    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    const-string v9, "upload_type"

    .line 422
    .line 423
    invoke-virtual {v7, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 424
    .line 425
    .line 426
    iget-object v8, v1, Lij3;->V:Lxt0;

    .line 427
    .line 428
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 429
    .line 430
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 434
    .line 435
    .line 436
    move-result-wide v8

    .line 437
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    const-string v9, "creation_timestamp"

    .line 442
    .line 443
    invoke-virtual {v7, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 444
    .line 445
    .line 446
    :try_start_5
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-string v8, "upload_queue"

    .line 451
    .line 452
    const-string v9, "rowid=? AND app_id=? AND upload_type=?"

    .line 453
    .line 454
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v11

    .line 458
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    filled-new-array {v11, v2, v6}, [Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    invoke-virtual {v0, v8, v7, v9, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    int-to-long v6, v0

    .line 471
    const-wide/16 v8, 0x1

    .line 472
    .line 473
    cmp-long v0, v6, v8

    .line 474
    .line 475
    if-eqz v0, :cond_5

    .line 476
    .line 477
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 478
    .line 479
    .line 480
    iget-object v0, v1, Luh3;->w:Lsh3;

    .line 481
    .line 482
    const-string v6, "Google Signal pending batch not updated. appId, rowId"

    .line 483
    .line 484
    invoke-virtual {v0, v2, v6, v5}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_4

    .line 485
    .line 486
    .line 487
    goto :goto_6

    .line 488
    :catch_4
    move-exception v0

    .line 489
    goto :goto_7

    .line 490
    :cond_5
    :goto_6
    invoke-virtual {v10}, Lmp3;->a()Luh3;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 495
    .line 496
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    const-string v3, "[sgtm] queued Google Signal batch updated. appId, signalRowId"

    .line 501
    .line 502
    invoke-virtual {v0, v2, v3, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v10, v2}, Lmp3;->t(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    goto :goto_9

    .line 509
    :goto_7
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 510
    .line 511
    .line 512
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 513
    .line 514
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    const-string v4, "Failed to update google Signal pending batch. appid, rowId"

    .line 519
    .line 520
    invoke-virtual {v1, v4, v2, v3, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    throw v0

    .line 524
    :cond_6
    if-ne v7, v5, :cond_8

    .line 525
    .line 526
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    check-cast v3, Lkp3;

    .line 531
    .line 532
    if-nez v3, :cond_7

    .line 533
    .line 534
    new-instance v3, Lkp3;

    .line 535
    .line 536
    invoke-direct {v3, v10}, Lkp3;-><init>(Lmp3;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v11, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_7
    iget v4, v3, Lkp3;->b:I

    .line 544
    .line 545
    add-int/2addr v4, v9

    .line 546
    iput v4, v3, Lkp3;->b:I

    .line 547
    .line 548
    invoke-virtual {v3}, Lkp3;->a()J

    .line 549
    .line 550
    .line 551
    move-result-wide v4

    .line 552
    iput-wide v4, v3, Lkp3;->c:J

    .line 553
    .line 554
    :goto_8
    invoke-virtual {v10}, Lmp3;->f()Lxv;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    check-cast v4, Lxt0;

    .line 559
    .line 560
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 564
    .line 565
    .line 566
    move-result-wide v4

    .line 567
    iget-wide v6, v3, Lkp3;->c:J

    .line 568
    .line 569
    sub-long/2addr v6, v4

    .line 570
    invoke-virtual {v10}, Lmp3;->a()Luh3;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    iget-object v3, v3, Luh3;->Y:Lsh3;

    .line 575
    .line 576
    const-wide/16 v4, 0x3e8

    .line 577
    .line 578
    div-long/2addr v6, v4

    .line 579
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    const-string v5, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"

    .line 584
    .line 585
    invoke-virtual {v3, v5, v2, v0, v4}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    :cond_8
    iget-object v0, v10, Lmp3;->c:Lae3;

    .line 589
    .line 590
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 591
    .line 592
    .line 593
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->a:J

    .line 594
    .line 595
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-virtual {v0, v1}, Lae3;->L(Ljava/lang/Long;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v10}, Lmp3;->a()Luh3;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 607
    .line 608
    const-string v3, "[sgtm] increased batch retry count after failed client upload. appId, rowId"

    .line 609
    .line 610
    invoke-virtual {v0, v2, v3, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    :cond_9
    :goto_9
    return-void

    .line 614
    :goto_a
    if-eqz v8, :cond_a

    .line 615
    .line 616
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 617
    .line 618
    .line 619
    :cond_a
    throw v0

    .line 620
    :pswitch_4
    iget-object v0, v1, Ljs0;->d:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 623
    .line 624
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 625
    .line 626
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 627
    .line 628
    invoke-virtual {v2}, Lmp3;->A()V

    .line 629
    .line 630
    .line 631
    iget-object v2, v1, Ljs0;->b:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 634
    .line 635
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    iget-object v1, v1, Ljs0;->c:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzr;

    .line 642
    .line 643
    if-nez v3, :cond_b

    .line 644
    .line 645
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v0, v2, v1}, Lmp3;->V(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 648
    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_b
    invoke-virtual {v0, v2, v1}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 652
    .line 653
    .line 654
    :goto_b
    return-void

    .line 655
    :pswitch_5
    iget-object v0, v1, Ljs0;->d:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 658
    .line 659
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 660
    .line 661
    invoke-virtual {v2}, Lmp3;->A()V

    .line 662
    .line 663
    .line 664
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 665
    .line 666
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 669
    .line 670
    iget-object v1, v1, Ljs0;->b:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v1, Ljava/lang/String;

    .line 673
    .line 674
    invoke-virtual {v0, v2, v1}, Lmp3;->h(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    return-void

    .line 678
    :pswitch_6
    const/16 v27, 0x0

    .line 679
    .line 680
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 683
    .line 684
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 687
    .line 688
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 696
    .line 697
    const-string v3, "_cmp"

    .line 698
    .line 699
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 700
    .line 701
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-eqz v3, :cond_e

    .line 706
    .line 707
    iget-object v12, v0, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 708
    .line 709
    if-eqz v12, :cond_e

    .line 710
    .line 711
    iget-object v3, v12, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 712
    .line 713
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    if-nez v4, :cond_c

    .line 718
    .line 719
    goto :goto_c

    .line 720
    :cond_c
    const-string v4, "_cis"

    .line 721
    .line 722
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    const-string v4, "referrer broadcast"

    .line 727
    .line 728
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v4

    .line 732
    if-nez v4, :cond_d

    .line 733
    .line 734
    const-string v4, "referrer API"

    .line 735
    .line 736
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    if-eqz v3, :cond_e

    .line 741
    .line 742
    :cond_d
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    iget-object v3, v3, Luh3;->W:Lsh3;

    .line 747
    .line 748
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbg;->toString()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    const-string v5, "Event has been filtered "

    .line 753
    .line 754
    invoke-virtual {v3, v4, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    new-instance v10, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 758
    .line 759
    iget-object v13, v0, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 760
    .line 761
    iget-wide v14, v0, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 762
    .line 763
    const-string v11, "_cmpx"

    .line 764
    .line 765
    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 766
    .line 767
    .line 768
    move-object v0, v10

    .line 769
    :cond_e
    :goto_c
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 770
    .line 771
    iget-object v4, v1, Lmp3;->a:Lvi3;

    .line 772
    .line 773
    iget-object v5, v1, Lmp3;->i:Lci3;

    .line 774
    .line 775
    invoke-static {v4}, Lmp3;->S(Lwo3;)V

    .line 776
    .line 777
    .line 778
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 779
    .line 780
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 781
    .line 782
    .line 783
    move-result v7

    .line 784
    if-eqz v7, :cond_f

    .line 785
    .line 786
    move-object/from16 v8, v27

    .line 787
    .line 788
    goto :goto_d

    .line 789
    :cond_f
    iget-object v4, v4, Lvi3;->U:Lri3;

    .line 790
    .line 791
    invoke-virtual {v4, v6}, Lua1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    move-object v8, v4

    .line 796
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzc;

    .line 797
    .line 798
    :goto_d
    if-eqz v8, :cond_13

    .line 799
    .line 800
    :try_start_6
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 801
    .line 802
    .line 803
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 804
    .line 805
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzbe;->G1()Landroid/os/Bundle;

    .line 806
    .line 807
    .line 808
    move-result-object v4

    .line 809
    invoke-static {v4, v9}, Lci3;->p0(Landroid/os/Bundle;Z)Ljava/util/HashMap;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    sget-object v6, Li13;->h:[Ljava/lang/String;

    .line 814
    .line 815
    sget-object v7, Li13;->f:[Ljava/lang/String;

    .line 816
    .line 817
    invoke-static {v3, v6, v7}, Lqj3;->V(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    if-eqz v6, :cond_10

    .line 822
    .line 823
    goto :goto_e

    .line 824
    :cond_10
    move-object v6, v3

    .line 825
    :goto_e
    new-instance v7, Lcom/google/android/gms/internal/measurement/zzaa;

    .line 826
    .line 827
    iget-wide v9, v0, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 828
    .line 829
    invoke-direct {v7, v6, v9, v10, v4}, Lcom/google/android/gms/internal/measurement/zzaa;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/measurement/zzc;->zzb(Lcom/google/android/gms/internal/measurement/zzaa;)Z

    .line 833
    .line 834
    .line 835
    move-result v4
    :try_end_6
    .catch Lcom/google/android/gms/internal/measurement/zzd; {:try_start_6 .. :try_end_6} :catch_5

    .line 836
    if-nez v4, :cond_11

    .line 837
    .line 838
    goto :goto_11

    .line 839
    :cond_11
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzc;->zzc()Z

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    if-eqz v4, :cond_12

    .line 844
    .line 845
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 850
    .line 851
    const-string v4, "EES edited event"

    .line 852
    .line 853
    invoke-virtual {v0, v3, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzc;->zze()Lcom/google/android/gms/internal/measurement/zzab;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzab;->zzc()Lcom/google/android/gms/internal/measurement/zzaa;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    invoke-static {v0}, Lci3;->D(Lcom/google/android/gms/internal/measurement/zzaa;)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-virtual {v1}, Lmp3;->A()V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1, v0, v2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 875
    .line 876
    .line 877
    goto :goto_f

    .line 878
    :cond_12
    invoke-virtual {v1}, Lmp3;->A()V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v1, v0, v2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 882
    .line 883
    .line 884
    :goto_f
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzc;->zzd()Z

    .line 885
    .line 886
    .line 887
    move-result v0

    .line 888
    if-eqz v0, :cond_14

    .line 889
    .line 890
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzc;->zze()Lcom/google/android/gms/internal/measurement/zzab;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzab;->zzf()Ljava/util/List;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 903
    .line 904
    .line 905
    move-result v3

    .line 906
    if-eqz v3, :cond_14

    .line 907
    .line 908
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaa;

    .line 913
    .line 914
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 915
    .line 916
    .line 917
    move-result-object v4

    .line 918
    iget-object v4, v4, Luh3;->Y:Lsh3;

    .line 919
    .line 920
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzaa;->zzb()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v6

    .line 924
    const-string v7, "EES logging created event"

    .line 925
    .line 926
    invoke-virtual {v4, v6, v7}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 930
    .line 931
    .line 932
    invoke-static {v3}, Lci3;->D(Lcom/google/android/gms/internal/measurement/zzaa;)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    invoke-virtual {v1}, Lmp3;->A()V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v1, v3, v2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 940
    .line 941
    .line 942
    goto :goto_10

    .line 943
    :catch_5
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 944
    .line 945
    .line 946
    move-result-object v4

    .line 947
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 948
    .line 949
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 950
    .line 951
    const-string v6, "EES error. appId, eventName"

    .line 952
    .line 953
    invoke-virtual {v4, v5, v6, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    :goto_11
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    iget-object v4, v4, Luh3;->Y:Lsh3;

    .line 961
    .line 962
    const-string v5, "EES was not applied to event"

    .line 963
    .line 964
    invoke-virtual {v4, v3, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v1}, Lmp3;->A()V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v1, v0, v2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 971
    .line 972
    .line 973
    goto :goto_12

    .line 974
    :cond_13
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    iget-object v3, v3, Luh3;->Y:Lsh3;

    .line 979
    .line 980
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 981
    .line 982
    const-string v5, "EES not loaded for"

    .line 983
    .line 984
    invoke-virtual {v3, v4, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v1}, Lmp3;->A()V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v1, v0, v2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 991
    .line 992
    .line 993
    :cond_14
    :goto_12
    return-void

    .line 994
    :pswitch_7
    iget-object v0, v1, Ljs0;->d:Ljava/lang/Object;

    .line 995
    .line 996
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 997
    .line 998
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 999
    .line 1000
    invoke-virtual {v0}, Lmp3;->A()V

    .line 1001
    .line 1002
    .line 1003
    iget-object v2, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzah;

    .line 1006
    .line 1007
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 1008
    .line 1009
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v3

    .line 1013
    iget-object v1, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzr;

    .line 1016
    .line 1017
    if-nez v3, :cond_15

    .line 1018
    .line 1019
    invoke-virtual {v0, v2, v1}, Lmp3;->Y(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_13

    .line 1023
    :cond_15
    invoke-virtual {v0, v2, v1}, Lmp3;->X(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1024
    .line 1025
    .line 1026
    :goto_13
    return-void

    .line 1027
    :pswitch_8
    const/16 v27, 0x0

    .line 1028
    .line 1029
    iget-object v0, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 1032
    .line 1033
    iget-object v2, v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;->a:Landroid/content/Intent;

    .line 1034
    .line 1035
    const-string v3, "google.message_id"

    .line 1036
    .line 1037
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v3

    .line 1041
    if-nez v3, :cond_16

    .line 1042
    .line 1043
    const-string v3, "message_id"

    .line 1044
    .line 1045
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    :cond_16
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v2

    .line 1053
    if-eqz v2, :cond_17

    .line 1054
    .line 1055
    invoke-static/range {v27 .. v27}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    goto :goto_15

    .line 1060
    :cond_17
    new-instance v2, Landroid/os/Bundle;

    .line 1061
    .line 1062
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1063
    .line 1064
    .line 1065
    iget-object v3, v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;->a:Landroid/content/Intent;

    .line 1066
    .line 1067
    const-string v4, "google.message_id"

    .line 1068
    .line 1069
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v4

    .line 1073
    if-nez v4, :cond_18

    .line 1074
    .line 1075
    const-string v4, "message_id"

    .line 1076
    .line 1077
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    :cond_18
    const-string v3, "google.message_id"

    .line 1082
    .line 1083
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    iget-object v0, v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;->a:Landroid/content/Intent;

    .line 1087
    .line 1088
    const-string v3, "google.product_id"

    .line 1089
    .line 1090
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v4

    .line 1094
    if-eqz v4, :cond_19

    .line 1095
    .line 1096
    invoke-virtual {v0, v3, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1097
    .line 1098
    .line 1099
    move-result v0

    .line 1100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v8

    .line 1104
    goto :goto_14

    .line 1105
    :cond_19
    move-object/from16 v8, v27

    .line 1106
    .line 1107
    :goto_14
    if-eqz v8, :cond_1a

    .line 1108
    .line 1109
    const-string v0, "google.product_id"

    .line 1110
    .line 1111
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1112
    .line 1113
    .line 1114
    move-result v3

    .line 1115
    invoke-virtual {v2, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1116
    .line 1117
    .line 1118
    :cond_1a
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, Landroid/content/Context;

    .line 1121
    .line 1122
    const-string v3, "supports_message_handled"

    .line 1123
    .line 1124
    invoke-virtual {v2, v3, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1125
    .line 1126
    .line 1127
    invoke-static {v0}, Lur3;->c(Landroid/content/Context;)Lur3;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v3

    .line 1131
    new-instance v0, Lvq3;

    .line 1132
    .line 1133
    monitor-enter v3

    .line 1134
    :try_start_7
    iget v4, v3, Lur3;->a:I

    .line 1135
    .line 1136
    add-int/lit8 v5, v4, 0x1

    .line 1137
    .line 1138
    iput v5, v3, Lur3;->a:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1139
    .line 1140
    monitor-exit v3

    .line 1141
    invoke-direct {v0, v4, v7, v2, v10}, Lvq3;-><init>(IILandroid/os/Bundle;I)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v3, v0}, Lur3;->d(Lvq3;)Lcom/google/android/gms/tasks/Task;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v0

    .line 1148
    :goto_15
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 1151
    .line 1152
    sget-object v2, Lo80;->c:Lo80;

    .line 1153
    .line 1154
    new-instance v3, Lac3;

    .line 1155
    .line 1156
    invoke-direct {v3, v1, v6}, Lac3;-><init>(Ljava/lang/Object;I)V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1160
    .line 1161
    .line 1162
    return-void

    .line 1163
    :catchall_3
    move-exception v0

    .line 1164
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1165
    throw v0

    .line 1166
    :pswitch_9
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v0, Lgf3;

    .line 1169
    .line 1170
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1171
    .line 1172
    check-cast v2, Lwe2;

    .line 1173
    .line 1174
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v1, Lcom/supercell/titan/h;

    .line 1177
    .line 1178
    invoke-virtual {v0, v2, v1}, Lgf3;->D(Lwe2;Lcom/supercell/titan/h;)V

    .line 1179
    .line 1180
    .line 1181
    return-void

    .line 1182
    :pswitch_a
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1183
    .line 1184
    check-cast v0, Lgf3;

    .line 1185
    .line 1186
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1187
    .line 1188
    check-cast v2, Ld5;

    .line 1189
    .line 1190
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1191
    .line 1192
    check-cast v1, Lds0;

    .line 1193
    .line 1194
    invoke-virtual {v0, v2, v1}, Lgf3;->B(Ld5;Lds0;)V

    .line 1195
    .line 1196
    .line 1197
    return-void

    .line 1198
    :pswitch_b
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1199
    .line 1200
    check-cast v0, Lgf3;

    .line 1201
    .line 1202
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v2, Lfs0;

    .line 1205
    .line 1206
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1207
    .line 1208
    check-cast v1, Lcom/supercell/titan/g;

    .line 1209
    .line 1210
    invoke-virtual {v0, v2, v1}, Lgf3;->C(Lfs0;Lcom/supercell/titan/g;)V

    .line 1211
    .line 1212
    .line 1213
    return-void

    .line 1214
    :pswitch_c
    const/16 v27, 0x0

    .line 1215
    .line 1216
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1217
    .line 1218
    check-cast v2, Lx61;

    .line 1219
    .line 1220
    iget-object v3, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v3, Lbx0;

    .line 1223
    .line 1224
    iget v4, v3, Lbx0;->c:I

    .line 1225
    .line 1226
    if-lez v4, :cond_1c

    .line 1227
    .line 1228
    iget-object v4, v3, Lbx0;->d:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v4, Landroid/os/Bundle;

    .line 1231
    .line 1232
    if-eqz v4, :cond_1b

    .line 1233
    .line 1234
    iget-object v1, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v1, Ljava/lang/String;

    .line 1237
    .line 1238
    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v8

    .line 1242
    goto :goto_16

    .line 1243
    :cond_1b
    move-object/from16 v8, v27

    .line 1244
    .line 1245
    :goto_16
    invoke-virtual {v2, v8}, Lx61;->onCreate(Landroid/os/Bundle;)V

    .line 1246
    .line 1247
    .line 1248
    :cond_1c
    iget v1, v3, Lbx0;->c:I

    .line 1249
    .line 1250
    if-lt v1, v7, :cond_1d

    .line 1251
    .line 1252
    invoke-virtual {v2}, Lx61;->onStart()V

    .line 1253
    .line 1254
    .line 1255
    :cond_1d
    iget v1, v3, Lbx0;->c:I

    .line 1256
    .line 1257
    if-lt v1, v5, :cond_1e

    .line 1258
    .line 1259
    invoke-virtual {v2}, Lx61;->onResume()V

    .line 1260
    .line 1261
    .line 1262
    :cond_1e
    iget v1, v3, Lbx0;->c:I

    .line 1263
    .line 1264
    if-lt v1, v6, :cond_1f

    .line 1265
    .line 1266
    invoke-virtual {v2}, Lx61;->onStop()V

    .line 1267
    .line 1268
    .line 1269
    :cond_1f
    iget v1, v3, Lbx0;->c:I

    .line 1270
    .line 1271
    const/4 v0, 0x5

    .line 1272
    if-lt v1, v0, :cond_20

    .line 1273
    .line 1274
    invoke-virtual {v2}, Lx61;->onDestroy()V

    .line 1275
    .line 1276
    .line 1277
    :cond_20
    return-void

    .line 1278
    :pswitch_d
    const/16 v27, 0x0

    .line 1279
    .line 1280
    :try_start_9
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1281
    .line 1282
    check-cast v0, Lnl0;

    .line 1283
    .line 1284
    invoke-virtual {v0}, Lnl0;->call()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v8
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 1288
    goto :goto_17

    .line 1289
    :catch_6
    move-object/from16 v8, v27

    .line 1290
    .line 1291
    :goto_17
    iget-object v0, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1292
    .line 1293
    check-cast v0, Lac0;

    .line 1294
    .line 1295
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1296
    .line 1297
    check-cast v1, Landroid/os/Handler;

    .line 1298
    .line 1299
    new-instance v2, Lcp0;

    .line 1300
    .line 1301
    const/16 v3, 0x12

    .line 1302
    .line 1303
    invoke-direct {v2, v3, v0, v8}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1307
    .line 1308
    .line 1309
    return-void

    .line 1310
    :pswitch_e
    iget-object v3, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1311
    .line 1312
    monitor-enter v3

    .line 1313
    :try_start_a
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1314
    .line 1315
    check-cast v0, Ljs0;

    .line 1316
    .line 1317
    invoke-virtual {v0}, Ljs0;->run()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1318
    .line 1319
    .line 1320
    :try_start_b
    iget-object v0, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1323
    .line 1324
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1325
    .line 1326
    .line 1327
    iget-object v0, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1328
    .line 1329
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 1330
    .line 1331
    .line 1332
    monitor-exit v3

    .line 1333
    return-void

    .line 1334
    :catchall_4
    move-exception v0

    .line 1335
    goto :goto_18

    .line 1336
    :catchall_5
    move-exception v0

    .line 1337
    iget-object v2, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1338
    .line 1339
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1340
    .line 1341
    invoke-virtual {v2, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1342
    .line 1343
    .line 1344
    iget-object v1, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1345
    .line 1346
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 1347
    .line 1348
    .line 1349
    throw v0

    .line 1350
    :goto_18
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1351
    throw v0

    .line 1352
    :pswitch_f
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1353
    .line 1354
    check-cast v0, Lrs0;

    .line 1355
    .line 1356
    iget-object v3, v0, Lrs0;->w:Lll1;

    .line 1357
    .line 1358
    monitor-enter v3

    .line 1359
    const/16 v18, 0x1

    .line 1360
    .line 1361
    :try_start_c
    iget-object v0, v3, Lll1;->a:Landroid/content/SharedPreferences;

    .line 1362
    .line 1363
    const-string v4, "migration_state"

    .line 1364
    .line 1365
    invoke-interface {v0, v4, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1366
    .line 1367
    .line 1368
    move-result v0

    .line 1369
    const-string v4, "__hs__db_support_key_values"

    .line 1370
    .line 1371
    invoke-virtual {v3, v4}, Lll1;->b(Ljava/lang/String;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v4

    .line 1375
    if-eqz v4, :cond_25

    .line 1376
    .line 1377
    if-nez v0, :cond_25

    .line 1378
    .line 1379
    new-instance v14, Lat0;

    .line 1380
    .line 1381
    iget-object v15, v3, Lll1;->d:Landroid/content/Context;

    .line 1382
    .line 1383
    const-string v16, "__hs__db_support_key_values"

    .line 1384
    .line 1385
    const/16 v19, 0x0

    .line 1386
    .line 1387
    const/16 v17, 0x0

    .line 1388
    .line 1389
    invoke-direct/range {v14 .. v19}, Lat0;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1390
    .line 1391
    .line 1392
    move/from16 v4, v18

    .line 1393
    .line 1394
    :try_start_d
    iput-object v14, v3, Lll1;->b:Lat0;

    .line 1395
    .line 1396
    new-instance v20, Lat0;

    .line 1397
    .line 1398
    iget-object v0, v3, Lll1;->d:Landroid/content/Context;

    .line 1399
    .line 1400
    const-string v22, "__hs_db_helpshift_users"

    .line 1401
    .line 1402
    const/16 v24, 0x2

    .line 1403
    .line 1404
    const/16 v25, 0x1

    .line 1405
    .line 1406
    move-object/from16 v21, v0

    .line 1407
    .line 1408
    move-object/from16 v23, v17

    .line 1409
    .line 1410
    invoke-direct/range {v20 .. v25}, Lat0;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V

    .line 1411
    .line 1412
    .line 1413
    move-object/from16 v0, v20

    .line 1414
    .line 1415
    move-object/from16 v6, v23

    .line 1416
    .line 1417
    iput-object v0, v3, Lll1;->e:Lat0;

    .line 1418
    .line 1419
    move v0, v10

    .line 1420
    move v8, v0

    .line 1421
    move v9, v8

    .line 1422
    move v11, v9

    .line 1423
    :goto_19
    if-ge v0, v5, :cond_22

    .line 1424
    .line 1425
    iget v8, v3, Lll1;->i:I

    .line 1426
    .line 1427
    add-int/2addr v8, v4

    .line 1428
    iput v8, v3, Lll1;->i:I

    .line 1429
    .line 1430
    invoke-virtual {v3}, Lll1;->d()Z

    .line 1431
    .line 1432
    .line 1433
    move-result v8

    .line 1434
    invoke-virtual {v3}, Lll1;->f()Z

    .line 1435
    .line 1436
    .line 1437
    move-result v9

    .line 1438
    const-string v11, "User data migration"

    .line 1439
    .line 1440
    invoke-virtual {v3, v11, v9}, Lll1;->c(Ljava/lang/String;Z)V

    .line 1441
    .line 1442
    .line 1443
    const-string v11, "User Data : "

    .line 1444
    .line 1445
    invoke-virtual {v3, v11, v9}, Lll1;->j(Ljava/lang/String;Z)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v3}, Lll1;->e()Z

    .line 1449
    .line 1450
    .line 1451
    move-result v11

    .line 1452
    const-string v12, "Legacy analytics event ID data migration"

    .line 1453
    .line 1454
    invoke-virtual {v3, v12, v11}, Lll1;->c(Ljava/lang/String;Z)V

    .line 1455
    .line 1456
    .line 1457
    const-string v12, "Legacy Analytics Id : "

    .line 1458
    .line 1459
    invoke-virtual {v3, v12, v11}, Lll1;->j(Ljava/lang/String;Z)V

    .line 1460
    .line 1461
    .line 1462
    if-eqz v8, :cond_21

    .line 1463
    .line 1464
    if-eqz v9, :cond_21

    .line 1465
    .line 1466
    if-nez v11, :cond_22

    .line 1467
    .line 1468
    :cond_21
    iget-object v12, v3, Lll1;->f:Lxi1;

    .line 1469
    .line 1470
    new-instance v14, Ljava/lang/StringBuilder;

    .line 1471
    .line 1472
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 1473
    .line 1474
    .line 1475
    const-string v15, "Native SDK to SDK X migration failed! Attempt : "

    .line 1476
    .line 1477
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1478
    .line 1479
    .line 1480
    add-int/lit8 v0, v0, 0x1

    .line 1481
    .line 1482
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v14

    .line 1489
    invoke-virtual {v12, v14, v6}, Lxi1;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1490
    .line 1491
    .line 1492
    goto :goto_19

    .line 1493
    :catchall_6
    move-exception v0

    .line 1494
    move-object v1, v0

    .line 1495
    goto/16 :goto_28

    .line 1496
    .line 1497
    :catch_7
    move-exception v0

    .line 1498
    goto :goto_20

    .line 1499
    :cond_22
    if-eqz v8, :cond_23

    .line 1500
    .line 1501
    if-eqz v9, :cond_23

    .line 1502
    .line 1503
    if-eqz v11, :cond_23

    .line 1504
    .line 1505
    move v2, v4

    .line 1506
    :cond_23
    invoke-virtual {v3, v2}, Lll1;->a(I)V

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v3, v2}, Lll1;->h(I)V

    .line 1510
    .line 1511
    .line 1512
    iget-object v0, v3, Lll1;->a:Landroid/content/SharedPreferences;

    .line 1513
    .line 1514
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    const-string v5, "migration_state"

    .line 1519
    .line 1520
    invoke-interface {v0, v5, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v0

    .line 1524
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1525
    .line 1526
    .line 1527
    :try_start_e
    iget-object v0, v3, Lll1;->b:Lat0;

    .line 1528
    .line 1529
    if-eqz v0, :cond_24

    .line 1530
    .line 1531
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 1532
    .line 1533
    .line 1534
    goto :goto_1a

    .line 1535
    :catchall_7
    move-exception v0

    .line 1536
    goto/16 :goto_2c

    .line 1537
    .line 1538
    :catch_8
    move-exception v0

    .line 1539
    goto :goto_1b

    .line 1540
    :cond_24
    :goto_1a
    iget-object v0, v3, Lll1;->e:Lat0;

    .line 1541
    .line 1542
    if-eqz v0, :cond_29

    .line 1543
    .line 1544
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_8
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 1545
    .line 1546
    .line 1547
    goto :goto_24

    .line 1548
    :goto_1b
    :try_start_f
    const-string v2, "Helpshift_Migrator"

    .line 1549
    .line 1550
    :goto_1c
    const-string v5, "Error closing DB instance"
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1551
    .line 1552
    goto :goto_23

    .line 1553
    :catch_9
    move-exception v0

    .line 1554
    move/from16 v4, v18

    .line 1555
    .line 1556
    goto :goto_20

    .line 1557
    :cond_25
    move/from16 v4, v18

    .line 1558
    .line 1559
    :try_start_10
    iget-object v0, v3, Lll1;->f:Lxi1;

    .line 1560
    .line 1561
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 1562
    .line 1563
    .line 1564
    :try_start_11
    iget-object v0, v3, Lll1;->b:Lat0;

    .line 1565
    .line 1566
    if-eqz v0, :cond_26

    .line 1567
    .line 1568
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 1569
    .line 1570
    .line 1571
    goto :goto_1d

    .line 1572
    :catch_a
    move-exception v0

    .line 1573
    goto :goto_1e

    .line 1574
    :cond_26
    :goto_1d
    iget-object v0, v3, Lll1;->e:Lat0;

    .line 1575
    .line 1576
    if-eqz v0, :cond_27

    .line 1577
    .line 1578
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_a
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 1579
    .line 1580
    .line 1581
    goto :goto_1f

    .line 1582
    :goto_1e
    :try_start_12
    const-string v2, "Helpshift_Migrator"

    .line 1583
    .line 1584
    const-string v5, "Error closing DB instance"

    .line 1585
    .line 1586
    invoke-static {v2, v5, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 1587
    .line 1588
    .line 1589
    :cond_27
    :goto_1f
    monitor-exit v3

    .line 1590
    goto :goto_25

    .line 1591
    :goto_20
    :try_start_13
    iget-object v2, v3, Lll1;->f:Lxi1;

    .line 1592
    .line 1593
    const-string v5, "Migration failed with exception"

    .line 1594
    .line 1595
    invoke-virtual {v2, v5, v0}, Lxi1;->a(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 1596
    .line 1597
    .line 1598
    :try_start_14
    iget-object v0, v3, Lll1;->b:Lat0;

    .line 1599
    .line 1600
    if-eqz v0, :cond_28

    .line 1601
    .line 1602
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 1603
    .line 1604
    .line 1605
    goto :goto_21

    .line 1606
    :catch_b
    move-exception v0

    .line 1607
    goto :goto_22

    .line 1608
    :cond_28
    :goto_21
    iget-object v0, v3, Lll1;->e:Lat0;

    .line 1609
    .line 1610
    if-eqz v0, :cond_29

    .line 1611
    .line 1612
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_b
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 1613
    .line 1614
    .line 1615
    goto :goto_24

    .line 1616
    :goto_22
    :try_start_15
    const-string v2, "Helpshift_Migrator"

    .line 1617
    .line 1618
    goto :goto_1c

    .line 1619
    :goto_23
    invoke-static {v2, v5, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 1620
    .line 1621
    .line 1622
    :cond_29
    :goto_24
    monitor-exit v3

    .line 1623
    :goto_25
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v0, Lrs0;

    .line 1626
    .line 1627
    iget-object v2, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1628
    .line 1629
    check-cast v2, Landroid/app/Application;

    .line 1630
    .line 1631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1632
    .line 1633
    .line 1634
    new-instance v3, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 1635
    .line 1636
    new-instance v5, Lqs0;

    .line 1637
    .line 1638
    invoke-direct {v5, v10}, Lqs0;-><init>(I)V

    .line 1639
    .line 1640
    .line 1641
    invoke-direct {v3, v4, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 1642
    .line 1643
    .line 1644
    iput-object v3, v0, Lrs0;->v:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 1645
    .line 1646
    new-instance v3, Lcb;

    .line 1647
    .line 1648
    iget-object v5, v0, Lrs0;->n:Ler0;

    .line 1649
    .line 1650
    invoke-direct {v3, v7, v2, v5}, Lcb;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1651
    .line 1652
    .line 1653
    iput-object v3, v0, Lrs0;->r:Lcb;

    .line 1654
    .line 1655
    new-instance v6, Lb5;

    .line 1656
    .line 1657
    iget-object v7, v0, Lrs0;->p:Lra2;

    .line 1658
    .line 1659
    const/16 v13, 0x8

    .line 1660
    .line 1661
    invoke-direct {v6, v13}, Lb5;-><init>(I)V

    .line 1662
    .line 1663
    .line 1664
    iput-object v2, v6, Lb5;->b:Ljava/lang/Object;

    .line 1665
    .line 1666
    iput-object v3, v6, Lb5;->c:Ljava/lang/Object;

    .line 1667
    .line 1668
    iput-object v5, v6, Lb5;->d:Ljava/lang/Object;

    .line 1669
    .line 1670
    iput-object v7, v6, Lb5;->f:Ljava/lang/Object;

    .line 1671
    .line 1672
    iput-object v6, v0, Lrs0;->h:Lb5;

    .line 1673
    .line 1674
    new-instance v2, Lts0;

    .line 1675
    .line 1676
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1677
    .line 1678
    .line 1679
    iput-object v5, v2, Lts0;->a:Ljava/lang/Object;

    .line 1680
    .line 1681
    iput-object v2, v0, Lrs0;->o:Lts0;

    .line 1682
    .line 1683
    new-instance v2, Lec0;

    .line 1684
    .line 1685
    const/16 v6, 0xc

    .line 1686
    .line 1687
    invoke-direct {v2, v6}, Lec0;-><init>(I)V

    .line 1688
    .line 1689
    .line 1690
    iput-object v2, v0, Lrs0;->g:Lec0;

    .line 1691
    .line 1692
    new-instance v2, Lra2;

    .line 1693
    .line 1694
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1695
    .line 1696
    .line 1697
    new-instance v7, Ljava/util/HashMap;

    .line 1698
    .line 1699
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 1700
    .line 1701
    .line 1702
    iput-object v7, v2, Lra2;->c:Ljava/lang/Object;

    .line 1703
    .line 1704
    new-instance v7, Ljava/util/HashMap;

    .line 1705
    .line 1706
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 1707
    .line 1708
    .line 1709
    iput-object v7, v2, Lra2;->d:Ljava/lang/Object;

    .line 1710
    .line 1711
    iput-object v5, v2, Lra2;->a:Ljava/lang/Object;

    .line 1712
    .line 1713
    iput-object v3, v2, Lra2;->b:Ljava/lang/Object;

    .line 1714
    .line 1715
    iput-object v2, v0, Lrs0;->i:Lra2;

    .line 1716
    .line 1717
    new-instance v2, Lwc0;

    .line 1718
    .line 1719
    iget-object v15, v0, Lrs0;->p:Lra2;

    .line 1720
    .line 1721
    invoke-direct {v2, v6, v15, v10}, Lwc0;-><init>(ILjava/lang/Object;Z)V

    .line 1722
    .line 1723
    .line 1724
    iput-object v2, v0, Lrs0;->q:Lwc0;

    .line 1725
    .line 1726
    new-instance v13, Lqi1;

    .line 1727
    .line 1728
    iget-object v3, v0, Lrs0;->r:Lcb;

    .line 1729
    .line 1730
    iget-object v12, v0, Lrs0;->n:Ler0;

    .line 1731
    .line 1732
    iget-object v6, v0, Lrs0;->g:Lec0;

    .line 1733
    .line 1734
    iget-object v14, v0, Lrs0;->o:Lts0;

    .line 1735
    .line 1736
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1737
    .line 1738
    .line 1739
    iput-object v3, v13, Lqi1;->f:Ljava/lang/Object;

    .line 1740
    .line 1741
    iput-object v12, v13, Lqi1;->a:Ljava/lang/Object;

    .line 1742
    .line 1743
    iput-object v15, v13, Lqi1;->b:Ljava/lang/Object;

    .line 1744
    .line 1745
    iput-object v2, v13, Lqi1;->e:Ljava/lang/Object;

    .line 1746
    .line 1747
    iput-object v6, v13, Lqi1;->c:Ljava/lang/Object;

    .line 1748
    .line 1749
    iput-object v14, v13, Lqi1;->d:Ljava/lang/Object;

    .line 1750
    .line 1751
    new-instance v11, Lnm;

    .line 1752
    .line 1753
    iget-object v2, v0, Lrs0;->h:Lb5;

    .line 1754
    .line 1755
    move-object/from16 v16, v2

    .line 1756
    .line 1757
    invoke-direct/range {v11 .. v16}, Lnm;-><init>(Ler0;Lqi1;Lts0;Lra2;Lb5;)V

    .line 1758
    .line 1759
    .line 1760
    iput-object v11, v0, Lrs0;->f:Lnm;

    .line 1761
    .line 1762
    new-instance v2, Liy;

    .line 1763
    .line 1764
    iget-object v3, v0, Lrs0;->i:Lra2;

    .line 1765
    .line 1766
    iget-object v6, v0, Lrs0;->r:Lcb;

    .line 1767
    .line 1768
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1769
    .line 1770
    .line 1771
    new-instance v7, Ljava/util/ArrayList;

    .line 1772
    .line 1773
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1774
    .line 1775
    .line 1776
    iput-object v7, v2, Liy;->e:Ljava/lang/Object;

    .line 1777
    .line 1778
    iput-object v5, v2, Liy;->a:Ljava/lang/Object;

    .line 1779
    .line 1780
    iput-object v3, v2, Liy;->b:Ljava/lang/Object;

    .line 1781
    .line 1782
    iput-object v6, v2, Liy;->c:Ljava/lang/Object;

    .line 1783
    .line 1784
    iput-object v11, v2, Liy;->d:Ljava/lang/Object;

    .line 1785
    .line 1786
    new-instance v3, Ljava/util/ArrayList;

    .line 1787
    .line 1788
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1789
    .line 1790
    .line 1791
    iput-object v3, v2, Liy;->i:Ljava/lang/Object;

    .line 1792
    .line 1793
    iput-object v2, v0, Lrs0;->e:Liy;

    .line 1794
    .line 1795
    new-instance v13, Liy;

    .line 1796
    .line 1797
    iget-object v3, v0, Lrs0;->r:Lcb;

    .line 1798
    .line 1799
    iget-object v12, v0, Lrs0;->n:Ler0;

    .line 1800
    .line 1801
    iget-object v5, v0, Lrs0;->o:Lts0;

    .line 1802
    .line 1803
    iget-object v14, v0, Lrs0;->f:Lnm;

    .line 1804
    .line 1805
    iget-object v6, v0, Lrs0;->h:Lb5;

    .line 1806
    .line 1807
    iget-object v7, v0, Lrs0;->g:Lec0;

    .line 1808
    .line 1809
    iget-object v15, v0, Lrs0;->q:Lwc0;

    .line 1810
    .line 1811
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1812
    .line 1813
    .line 1814
    iput-object v3, v13, Liy;->a:Ljava/lang/Object;

    .line 1815
    .line 1816
    iput-object v12, v13, Liy;->b:Ljava/lang/Object;

    .line 1817
    .line 1818
    iput-object v5, v13, Liy;->c:Ljava/lang/Object;

    .line 1819
    .line 1820
    iput-object v14, v13, Liy;->d:Ljava/lang/Object;

    .line 1821
    .line 1822
    iput-object v6, v13, Liy;->e:Ljava/lang/Object;

    .line 1823
    .line 1824
    iput-object v7, v13, Liy;->f:Ljava/lang/Object;

    .line 1825
    .line 1826
    iput-object v15, v13, Liy;->i:Ljava/lang/Object;

    .line 1827
    .line 1828
    new-instance v5, Lub0;

    .line 1829
    .line 1830
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1831
    .line 1832
    .line 1833
    const/16 v6, 0x1388

    .line 1834
    .line 1835
    iput v6, v5, Lub0;->a:I

    .line 1836
    .line 1837
    const v8, 0xea60

    .line 1838
    .line 1839
    .line 1840
    iput v8, v5, Lub0;->b:I

    .line 1841
    .line 1842
    iput v6, v5, Lub0;->c:I

    .line 1843
    .line 1844
    new-instance v6, Ljt1;

    .line 1845
    .line 1846
    iget-object v8, v0, Lrs0;->v:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 1847
    .line 1848
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1849
    .line 1850
    .line 1851
    iput-object v13, v6, Ljt1;->a:Liy;

    .line 1852
    .line 1853
    iput-object v14, v6, Ljt1;->d:Lnm;

    .line 1854
    .line 1855
    iput-object v5, v6, Ljt1;->c:Lub0;

    .line 1856
    .line 1857
    iput-object v8, v6, Ljt1;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 1858
    .line 1859
    new-instance v5, Lcb;

    .line 1860
    .line 1861
    const/16 v8, 0x1c

    .line 1862
    .line 1863
    invoke-direct {v5, v8, v10}, Lcb;-><init>(IZ)V

    .line 1864
    .line 1865
    .line 1866
    iput-object v6, v5, Lcb;->b:Ljava/lang/Object;

    .line 1867
    .line 1868
    iput-object v14, v5, Lcb;->c:Ljava/lang/Object;

    .line 1869
    .line 1870
    iput-object v5, v0, Lrs0;->s:Lcb;

    .line 1871
    .line 1872
    iput-object v5, v14, Lnm;->d:Ljava/lang/Object;

    .line 1873
    .line 1874
    iput-object v13, v14, Lnm;->e:Ljava/lang/Object;

    .line 1875
    .line 1876
    new-instance v5, Lxy1;

    .line 1877
    .line 1878
    iget-object v6, v0, Lrs0;->i:Lra2;

    .line 1879
    .line 1880
    iget-object v8, v0, Lrs0;->p:Lra2;

    .line 1881
    .line 1882
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1883
    .line 1884
    .line 1885
    iput-object v3, v5, Lxy1;->a:Ljava/lang/Object;

    .line 1886
    .line 1887
    iput-object v14, v5, Lxy1;->b:Ljava/lang/Object;

    .line 1888
    .line 1889
    iput-object v12, v5, Lxy1;->c:Ljava/lang/Object;

    .line 1890
    .line 1891
    iput-object v6, v5, Lxy1;->d:Ljava/lang/Object;

    .line 1892
    .line 1893
    iput-object v8, v5, Lxy1;->e:Ljava/lang/Object;

    .line 1894
    .line 1895
    iput-object v7, v5, Lxy1;->f:Ljava/lang/Object;

    .line 1896
    .line 1897
    iput-object v5, v0, Lrs0;->j:Lxy1;

    .line 1898
    .line 1899
    new-instance v3, Lec;

    .line 1900
    .line 1901
    const/16 v5, 0x18

    .line 1902
    .line 1903
    invoke-direct {v3, v5}, Lec;-><init>(I)V

    .line 1904
    .line 1905
    .line 1906
    iput-object v2, v3, Lec;->d:Ljava/lang/Object;

    .line 1907
    .line 1908
    iput-object v3, v0, Lrs0;->t:Lec;

    .line 1909
    .line 1910
    new-instance v11, Lb5;

    .line 1911
    .line 1912
    const/16 v17, 0xb

    .line 1913
    .line 1914
    move-object/from16 v16, v8

    .line 1915
    .line 1916
    invoke-direct/range {v11 .. v17}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1917
    .line 1918
    .line 1919
    iput-object v11, v0, Lrs0;->u:Lb5;

    .line 1920
    .line 1921
    iget-object v0, v1, Ljs0;->c:Ljava/lang/Object;

    .line 1922
    .line 1923
    check-cast v0, Landroid/app/Application;

    .line 1924
    .line 1925
    iget-object v1, v1, Ljs0;->d:Ljava/lang/Object;

    .line 1926
    .line 1927
    check-cast v1, Ljava/util/HashMap;

    .line 1928
    .line 1929
    const-string v2, "manualLifecycleTracking"

    .line 1930
    .line 1931
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v1

    .line 1935
    instance-of v2, v1, Ljava/lang/Boolean;

    .line 1936
    .line 1937
    if-eqz v2, :cond_2a

    .line 1938
    .line 1939
    check-cast v1, Ljava/lang/Boolean;

    .line 1940
    .line 1941
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1942
    .line 1943
    .line 1944
    move-result v1

    .line 1945
    if-eqz v1, :cond_2a

    .line 1946
    .line 1947
    move/from16 v18, v4

    .line 1948
    .line 1949
    goto :goto_26

    .line 1950
    :cond_2a
    move/from16 v18, v10

    .line 1951
    .line 1952
    :goto_26
    sget-object v1, Lfs0;->c:Lfs0;

    .line 1953
    .line 1954
    if-nez v1, :cond_2b

    .line 1955
    .line 1956
    new-instance v1, Lfs0;

    .line 1957
    .line 1958
    invoke-direct {v1, v10, v10}, Lfs0;-><init>(IZ)V

    .line 1959
    .line 1960
    .line 1961
    sput-object v1, Lfs0;->c:Lfs0;

    .line 1962
    .line 1963
    :cond_2b
    sget-object v1, Lfs0;->c:Lfs0;

    .line 1964
    .line 1965
    new-instance v2, Lec0;

    .line 1966
    .line 1967
    const/16 v3, 0xb

    .line 1968
    .line 1969
    invoke-direct {v2, v3}, Lec0;-><init>(I)V

    .line 1970
    .line 1971
    .line 1972
    iget-object v3, v1, Lfs0;->b:Ljava/lang/Object;

    .line 1973
    .line 1974
    check-cast v3, Lpg3;

    .line 1975
    .line 1976
    if-eqz v3, :cond_2c

    .line 1977
    .line 1978
    goto :goto_27

    .line 1979
    :cond_2c
    if-eqz v18, :cond_2d

    .line 1980
    .line 1981
    new-instance v0, Lnb1;

    .line 1982
    .line 1983
    invoke-direct {v0, v2}, Lpg3;-><init>(Lec0;)V

    .line 1984
    .line 1985
    .line 1986
    iput-object v0, v1, Lfs0;->b:Ljava/lang/Object;

    .line 1987
    .line 1988
    goto :goto_27

    .line 1989
    :cond_2d
    new-instance v3, Lu50;

    .line 1990
    .line 1991
    invoke-direct {v3, v2}, Lpg3;-><init>(Lec0;)V

    .line 1992
    .line 1993
    .line 1994
    iput-boolean v10, v3, Lu50;->U:Z

    .line 1995
    .line 1996
    invoke-virtual {v0, v3}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1997
    .line 1998
    .line 1999
    invoke-virtual {v0, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 2000
    .line 2001
    .line 2002
    iput-object v3, v1, Lfs0;->b:Ljava/lang/Object;

    .line 2003
    .line 2004
    :goto_27
    return-void

    .line 2005
    :goto_28
    :try_start_16
    iget-object v0, v3, Lll1;->b:Lat0;

    .line 2006
    .line 2007
    if-eqz v0, :cond_2e

    .line 2008
    .line 2009
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 2010
    .line 2011
    .line 2012
    goto :goto_29

    .line 2013
    :catch_c
    move-exception v0

    .line 2014
    goto :goto_2a

    .line 2015
    :cond_2e
    :goto_29
    iget-object v0, v3, Lll1;->e:Lat0;

    .line 2016
    .line 2017
    if-eqz v0, :cond_2f

    .line 2018
    .line 2019
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_c
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    .line 2020
    .line 2021
    .line 2022
    goto :goto_2b

    .line 2023
    :goto_2a
    :try_start_17
    const-string v2, "Helpshift_Migrator"

    .line 2024
    .line 2025
    const-string v4, "Error closing DB instance"

    .line 2026
    .line 2027
    invoke-static {v2, v4, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2028
    .line 2029
    .line 2030
    :cond_2f
    :goto_2b
    throw v1

    .line 2031
    :goto_2c
    monitor-exit v3
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    .line 2032
    throw v0

    .line 2033
    :pswitch_10
    iget-object v0, v1, Ljs0;->d:Ljava/lang/Object;

    .line 2034
    .line 2035
    check-cast v0, Lwc0;

    .line 2036
    .line 2037
    iget-object v0, v0, Lwc0;->b:Ljava/lang/Object;

    .line 2038
    .line 2039
    check-cast v0, Lec0;

    .line 2040
    .line 2041
    if-nez v0, :cond_30

    .line 2042
    .line 2043
    goto :goto_2e

    .line 2044
    :cond_30
    iget-object v0, v1, Ljs0;->b:Ljava/lang/Object;

    .line 2045
    .line 2046
    check-cast v0, Ljava/lang/String;

    .line 2047
    .line 2048
    iget-object v1, v1, Ljs0;->c:Ljava/lang/Object;

    .line 2049
    .line 2050
    check-cast v1, Ljava/util/HashMap;

    .line 2051
    .line 2052
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 2056
    .line 2057
    .line 2058
    move-result v3

    .line 2059
    sparse-switch v3, :sswitch_data_0

    .line 2060
    .line 2061
    .line 2062
    goto :goto_2d

    .line 2063
    :sswitch_0
    const-string v3, "helpshiftSessionEnded"

    .line 2064
    .line 2065
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v0

    .line 2069
    if-nez v0, :cond_31

    .line 2070
    .line 2071
    goto :goto_2d

    .line 2072
    :cond_31
    move v2, v7

    .line 2073
    goto :goto_2d

    .line 2074
    :sswitch_1
    const-string v3, "receivedUnreadMessageCount"

    .line 2075
    .line 2076
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2077
    .line 2078
    .line 2079
    move-result v0

    .line 2080
    if-nez v0, :cond_32

    .line 2081
    .line 2082
    goto :goto_2d

    .line 2083
    :cond_32
    move v2, v9

    .line 2084
    goto :goto_2d

    .line 2085
    :sswitch_2
    const-string v3, "helpshiftSessionStarted"

    .line 2086
    .line 2087
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2088
    .line 2089
    .line 2090
    move-result v0

    .line 2091
    if-nez v0, :cond_33

    .line 2092
    .line 2093
    goto :goto_2d

    .line 2094
    :cond_33
    move v2, v10

    .line 2095
    :goto_2d
    packed-switch v2, :pswitch_data_1

    .line 2096
    .line 2097
    .line 2098
    goto :goto_2e

    .line 2099
    :pswitch_11
    sput-boolean v10, Lcom/supercell/titan/HelpshiftTitan;->m:Z

    .line 2100
    .line 2101
    goto :goto_2e

    .line 2102
    :pswitch_12
    const-string v0, "count"

    .line 2103
    .line 2104
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v0

    .line 2108
    check-cast v0, Ljava/lang/Integer;

    .line 2109
    .line 2110
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2111
    .line 2112
    .line 2113
    move-result v0

    .line 2114
    sput v0, Lcom/supercell/titan/HelpshiftTitan;->a:I

    .line 2115
    .line 2116
    goto :goto_2e

    .line 2117
    :pswitch_13
    sput-boolean v9, Lcom/supercell/titan/HelpshiftTitan;->m:Z

    .line 2118
    .line 2119
    :goto_2e
    return-void

    .line 2120
    :pswitch_14
    iget-object v0, v1, Ljs0;->d:Ljava/lang/Object;

    .line 2121
    .line 2122
    check-cast v0, Lls0;

    .line 2123
    .line 2124
    iget-object v0, v0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 2125
    .line 2126
    if-nez v0, :cond_34

    .line 2127
    .line 2128
    goto :goto_2f

    .line 2129
    :cond_34
    iget-object v2, v1, Ljs0;->b:Ljava/lang/Object;

    .line 2130
    .line 2131
    check-cast v2, Ljava/lang/String;

    .line 2132
    .line 2133
    iget-object v1, v1, Ljs0;->c:Ljava/lang/Object;

    .line 2134
    .line 2135
    check-cast v1, Landroid/webkit/ValueCallback;

    .line 2136
    .line 2137
    invoke-virtual {v0, v2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 2138
    .line 2139
    .line 2140
    :goto_2f
    return-void

    .line 2141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    :sswitch_data_0
    .sparse-switch
        -0x78e932b4 -> :sswitch_2
        -0x477aa9a8 -> :sswitch_1
        -0xf8ef1bb -> :sswitch_0
    .end sparse-switch

    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method
