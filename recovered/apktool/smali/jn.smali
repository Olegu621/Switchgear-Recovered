.class public final Ljn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lnp;


# instance fields
.field public final b:Lhn;

.field public final c:Ly92;

.field public final d:Ljava/lang/Object;

.field public final e:Lgp;

.field public final f:Lgr0;

.field public final g:Lbb2;

.field public final h:Lfl0;

.field public final i:Lu93;

.field public final j:Lvt;

.field public final k:Lzr3;

.field public final l:Lzr0;

.field public final m:Lcn;

.field public final n:Lxt0;

.field public final o:Ler0;

.field public p:I

.field public volatile q:Z

.field public volatile r:I

.field public final s:Ld52;

.field public final t:Lme;

.field public final u:Ljava/util/concurrent/atomic/AtomicLong;

.field public v:I

.field public w:J


# direct methods
.method public constructor <init>(Lgp;Lnt0;Ly92;Lgr0;Ler0;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ljn;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lbb2;

    .line 12
    .line 13
    invoke-direct {v0}, Lab2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ljn;->g:Lbb2;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput v1, p0, Ljn;->p:I

    .line 20
    .line 21
    iput-boolean v1, p0, Ljn;->q:Z

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    iput v2, p0, Ljn;->r:I

    .line 25
    .line 26
    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ljn;->u:Ljava/util/concurrent/atomic/AtomicLong;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    iput v2, p0, Ljn;->v:I

    .line 37
    .line 38
    iput-wide v3, p0, Ljn;->w:J

    .line 39
    .line 40
    new-instance v3, Lgn;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v4, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v4, v3, Lgn;->a:Ljava/util/HashSet;

    .line 51
    .line 52
    new-instance v4, Landroid/util/ArrayMap;

    .line 53
    .line 54
    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v4, v3, Lgn;->b:Landroid/util/ArrayMap;

    .line 58
    .line 59
    iput-object p1, p0, Ljn;->e:Lgp;

    .line 60
    .line 61
    iput-object p4, p0, Ljn;->f:Lgr0;

    .line 62
    .line 63
    iput-object p3, p0, Ljn;->c:Ly92;

    .line 64
    .line 65
    new-instance p4, Ler0;

    .line 66
    .line 67
    invoke-direct {p4, p3}, Ler0;-><init>(Ly92;)V

    .line 68
    .line 69
    .line 70
    iput-object p4, p0, Ljn;->o:Ler0;

    .line 71
    .line 72
    new-instance p4, Lhn;

    .line 73
    .line 74
    invoke-direct {p4, p3}, Lhn;-><init>(Ly92;)V

    .line 75
    .line 76
    .line 77
    iput-object p4, p0, Ljn;->b:Lhn;

    .line 78
    .line 79
    iget v4, p0, Ljn;->v:I

    .line 80
    .line 81
    iget-object v5, v0, Lab2;->b:Lir;

    .line 82
    .line 83
    iput v4, v5, Lir;->a:I

    .line 84
    .line 85
    new-instance v4, Lhr;

    .line 86
    .line 87
    invoke-direct {v4, p4}, Lhr;-><init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 88
    .line 89
    .line 90
    iget-object p4, v0, Lab2;->b:Lir;

    .line 91
    .line 92
    invoke-virtual {p4, v4}, Lir;->c(Lmo;)V

    .line 93
    .line 94
    .line 95
    iget-object p4, v0, Lab2;->b:Lir;

    .line 96
    .line 97
    invoke-virtual {p4, v3}, Lir;->c(Lmo;)V

    .line 98
    .line 99
    .line 100
    new-instance p4, Lzr3;

    .line 101
    .line 102
    invoke-direct {p4, p0, p3}, Lzr3;-><init>(Ljn;Ly92;)V

    .line 103
    .line 104
    .line 105
    iput-object p4, p0, Ljn;->k:Lzr3;

    .line 106
    .line 107
    new-instance p4, Lfl0;

    .line 108
    .line 109
    invoke-direct {p4, p0, p2, p3}, Lfl0;-><init>(Ljn;Lnt0;Ly92;)V

    .line 110
    .line 111
    .line 112
    iput-object p4, p0, Ljn;->h:Lfl0;

    .line 113
    .line 114
    new-instance p4, Lu93;

    .line 115
    .line 116
    invoke-direct {p4, p0, p1, p3}, Lu93;-><init>(Ljn;Lgp;Ly92;)V

    .line 117
    .line 118
    .line 119
    iput-object p4, p0, Ljn;->i:Lu93;

    .line 120
    .line 121
    new-instance p4, Lvt;

    .line 122
    .line 123
    invoke-direct {p4, p0, p1, p3}, Lvt;-><init>(Ljn;Lgp;Ly92;)V

    .line 124
    .line 125
    .line 126
    iput-object p4, p0, Ljn;->j:Lvt;

    .line 127
    .line 128
    new-instance p4, Lzr0;

    .line 129
    .line 130
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-boolean v1, p4, Lzr0;->a:Z

    .line 134
    .line 135
    iput-boolean v1, p4, Lzr0;->b:Z

    .line 136
    .line 137
    iput-boolean v1, p4, Lzr0;->c:Z

    .line 138
    .line 139
    iput-object p1, p4, Lzr0;->d:Ljava/lang/Object;

    .line 140
    .line 141
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, [I

    .line 148
    .line 149
    if-eqz v0, :cond_1

    .line 150
    .line 151
    array-length v3, v0

    .line 152
    move v4, v1

    .line 153
    :goto_0
    if-ge v4, v3, :cond_1

    .line 154
    .line 155
    aget v5, v0, v4

    .line 156
    .line 157
    const/4 v6, 0x4

    .line 158
    if-ne v5, v6, :cond_0

    .line 159
    .line 160
    move v0, v2

    .line 161
    goto :goto_1

    .line 162
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_1
    move v0, v1

    .line 166
    :goto_1
    iput-boolean v0, p4, Lzr0;->b:Z

    .line 167
    .line 168
    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;

    .line 169
    .line 170
    sget-object v3, Lf80;->a:Ler0;

    .line 171
    .line 172
    invoke-virtual {v3, v0}, Ler0;->h(Ljava/lang/Class;)Lh02;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_2

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_2
    move v2, v1

    .line 180
    :goto_2
    iput-boolean v2, p4, Lzr0;->c:Z

    .line 181
    .line 182
    new-instance v0, Lac1;

    .line 183
    .line 184
    new-instance v2, Lf42;

    .line 185
    .line 186
    const/16 v3, 0x16

    .line 187
    .line 188
    invoke-direct {v2, v3}, Lf42;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v2}, Lac1;-><init>(Lf42;)V

    .line 192
    .line 193
    .line 194
    iput-object v0, p4, Lzr0;->e:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object p4, p0, Ljn;->l:Lzr0;

    .line 197
    .line 198
    new-instance p4, Ld52;

    .line 199
    .line 200
    const/4 v0, 0x5

    .line 201
    invoke-direct {p4, p5, v0}, Ld52;-><init>(Ler0;I)V

    .line 202
    .line 203
    .line 204
    iput-object p4, p0, Ljn;->s:Ld52;

    .line 205
    .line 206
    new-instance p4, Lme;

    .line 207
    .line 208
    invoke-direct {p4, p5, v1}, Lme;-><init>(Ler0;I)V

    .line 209
    .line 210
    .line 211
    iput-object p4, p0, Ljn;->t:Lme;

    .line 212
    .line 213
    new-instance p4, Lcn;

    .line 214
    .line 215
    invoke-direct {p4, p0, p3}, Lcn;-><init>(Ljn;Ly92;)V

    .line 216
    .line 217
    .line 218
    iput-object p4, p0, Ljn;->m:Lcn;

    .line 219
    .line 220
    new-instance v0, Lxt0;

    .line 221
    .line 222
    move-object v1, p0

    .line 223
    move-object v2, p1

    .line 224
    move-object v5, p2

    .line 225
    move-object v4, p3

    .line 226
    move-object v3, p5

    .line 227
    invoke-direct/range {v0 .. v5}, Lxt0;-><init>(Ljn;Lgp;Ler0;Ly92;Lnt0;)V

    .line 228
    .line 229
    .line 230
    iput-object v0, v1, Ljn;->n:Lxt0;

    .line 231
    .line 232
    return-void
.end method

.method public static k(Lgp;I)I
    .locals 2

    .line 1
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-static {p0, p1}, Ljn;->l([II)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x1

    .line 21
    invoke-static {p0, p1}, Ljn;->l([II)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    return p1

    .line 28
    :cond_2
    return v0
.end method

.method public static l([II)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    if-ne p1, v3, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v1
.end method


# virtual methods
.method public final a(Lty;)V
    .locals 7

    .line 1
    iget-object p0, p0, Ljn;->m:Lcn;

    .line 2
    .line 3
    invoke-static {p1}, Lnr;->b(Lty;)Lnr;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Lnr;->b:Luk1;

    .line 8
    .line 9
    invoke-static {p1}, Lnq1;->d(Lty;)Lnq1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcn;->e:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcn;->f:Ld52;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v2, Lsy;->c:Lsy;

    .line 22
    .line 23
    invoke-interface {p1}, Lty;->c()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Llf;

    .line 42
    .line 43
    iget-object v5, v1, Ld52;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v5, Luk1;

    .line 46
    .line 47
    invoke-interface {p1, v4}, Lty;->e(Llf;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v5, v4, v2, v6}, Luk1;->o(Llf;Lsy;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    new-instance p1, Lum;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lu32;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p1, Lum;->c:Lu32;

    .line 67
    .line 68
    new-instance v0, Lxm;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lxm;-><init>(Lum;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p1, Lum;->b:Lxm;

    .line 74
    .line 75
    const-class v1, Len;

    .line 76
    .line 77
    iput-object v1, p1, Lum;->a:Ljava/lang/Object;

    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    :try_start_1
    iget-object v2, p0, Lcn;->d:Ly92;

    .line 81
    .line 82
    new-instance v3, Lbn;

    .line 83
    .line 84
    invoke-direct {v3, p0, p1, v1}, Lbn;-><init>(Lcn;Lum;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    const-string p0, "addCaptureRequestOptions"

    .line 91
    .line 92
    iput-object p0, p1, Lum;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catch_0
    move-exception p0

    .line 96
    invoke-virtual {v0, p0}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-static {v0}, Lw11;->w(Ls81;)Ls81;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-instance p1, Lh7;

    .line 104
    .line 105
    invoke-direct {p1, v1}, Lh7;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lpg3;->g()Lo80;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p0, p1, v0}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    throw p0
.end method

.method public final b()Landroid/graphics/Rect;
    .locals 3

    .line 1
    iget-object p0, p0, Ljn;->e:Lgp;

    .line 2
    .line 3
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/graphics/Rect;

    .line 10
    .line 11
    const-string v0, "robolectric"

    .line 12
    .line 13
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    new-instance p0, Landroid/graphics/Rect;

    .line 24
    .line 25
    const/16 v0, 0xfa0

    .line 26
    .line 27
    const/16 v1, 0xbb8

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {p0, v2, v2, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public final c(I)V
    .locals 3

    .line 1
    const-string v0, "Camera2CameraControlImp"

    .line 2
    .line 3
    iget-object v1, p0, Ljn;->d:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Ljn;->p:I

    .line 7
    .line 8
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string p0, "Camera is not active."

    .line 18
    .line 19
    invoke-static {v0, p0}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iput p1, p0, Ljn;->r:I

    .line 24
    .line 25
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Ljn;->l:Lzr0;

    .line 29
    .line 30
    iget v0, p0, Ljn;->r:I

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    iget v0, p0, Ljn;->r:I

    .line 35
    .line 36
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljn;->o()Ls81;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p0
.end method

.method public final d(Ls72;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Lbb2;)V
    .locals 13

    .line 1
    iget-object p0, p0, Ljn;->l:Lzr0;

    .line 2
    .line 3
    const/16 v0, 0x22

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lzr0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lac1;

    .line 12
    .line 13
    :goto_0
    iget-object v3, v2, Lac1;->d:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v4, v2, Lac1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Lac1;->h()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lmw0;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v2, p0, Lzr0;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Luw0;

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v5, p0, Lzr0;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Lir;

    .line 48
    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    iget-object v6, v2, Ld70;->e:Lxm;

    .line 52
    .line 53
    invoke-static {v6}, Lw11;->w(Ls81;)Ls81;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v7, Llr;

    .line 58
    .line 59
    invoke-direct {v7, v5, v3}, Llr;-><init>(Lir;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v6, v7, v5}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 67
    .line 68
    .line 69
    iput-object v4, p0, Lzr0;->f:Ljava/lang/Object;

    .line 70
    .line 71
    :cond_1
    invoke-virtual {v2}, Ld70;->a()V

    .line 72
    .line 73
    .line 74
    iput-object v4, p0, Lzr0;->h:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_2
    iget-object v2, p0, Lzr0;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Landroid/media/ImageWriter;

    .line 79
    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/media/ImageWriter;->close()V

    .line 83
    .line 84
    .line 85
    iput-object v4, p0, Lzr0;->i:Ljava/lang/Object;

    .line 86
    .line 87
    :cond_3
    iget-boolean v2, p0, Lzr0;->a:Z

    .line 88
    .line 89
    const/4 v5, 0x1

    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    iget-object p0, p1, Lab2;->b:Lir;

    .line 93
    .line 94
    iput v5, p0, Lir;->a:I

    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    iget-boolean v2, p0, Lzr0;->c:Z

    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    iget-object p0, p1, Lab2;->b:Lir;

    .line 102
    .line 103
    iput v5, p0, Lir;->a:I

    .line 104
    .line 105
    return-void

    .line 106
    :cond_5
    iget-object v2, p0, Lzr0;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Lgp;

    .line 109
    .line 110
    :try_start_1
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 111
    .line 112
    invoke-virtual {v2, v6}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Landroid/hardware/camera2/params/StreamConfigurationMap;
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    .line 118
    move-object v4, v2

    .line 119
    goto :goto_1

    .line 120
    :catch_0
    move-exception v2

    .line 121
    const-string v6, "ZslControlImpl"

    .line 122
    .line 123
    new-instance v7, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v8, "Failed to retrieve StreamConfigurationMap, error = "

    .line 126
    .line 127
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {v6, v2}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :goto_1
    const/4 v2, 0x0

    .line 145
    if-eqz v4, :cond_8

    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputFormats()[I

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-nez v6, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    new-instance v6, Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputFormats()[I

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    array-length v8, v7

    .line 164
    move v9, v2

    .line 165
    :goto_2
    if-ge v9, v8, :cond_9

    .line 166
    .line 167
    aget v10, v7, v9

    .line 168
    .line 169
    invoke-virtual {v4, v10}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputSizes(I)[Landroid/util/Size;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    if-eqz v11, :cond_7

    .line 174
    .line 175
    new-instance v12, Lhx;

    .line 176
    .line 177
    invoke-direct {v12, v5}, Lhx;-><init>(Z)V

    .line 178
    .line 179
    .line 180
    invoke-static {v11, v12}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    aget-object v11, v11, v2

    .line 188
    .line 189
    invoke-virtual {v6, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_8
    :goto_3
    new-instance v6, Ljava/util/HashMap;

    .line 196
    .line 197
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    :cond_9
    iget-boolean v4, p0, Lzr0;->b:Z

    .line 201
    .line 202
    if-eqz v4, :cond_f

    .line 203
    .line 204
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v4, :cond_f

    .line 209
    .line 210
    invoke-interface {v6, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_f

    .line 215
    .line 216
    iget-object v4, p0, Lzr0;->d:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v4, Lgp;

    .line 219
    .line 220
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 221
    .line 222
    invoke-virtual {v4, v7}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 227
    .line 228
    if-nez v4, :cond_a

    .line 229
    .line 230
    goto/16 :goto_6

    .line 231
    .line 232
    :cond_a
    invoke-virtual {v4, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getValidOutputFormatsForInput(I)[I

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    if-nez v4, :cond_b

    .line 237
    .line 238
    goto/16 :goto_6

    .line 239
    .line 240
    :cond_b
    array-length v7, v4

    .line 241
    :goto_4
    if-ge v2, v7, :cond_f

    .line 242
    .line 243
    aget v8, v4, v2

    .line 244
    .line 245
    const/16 v9, 0x100

    .line 246
    .line 247
    if-ne v8, v9, :cond_e

    .line 248
    .line 249
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Landroid/util/Size;

    .line 254
    .line 255
    new-instance v2, Lli1;

    .line 256
    .line 257
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    const/16 v5, 0x9

    .line 266
    .line 267
    invoke-direct {v2, v4, v1, v0, v5}, Lli1;-><init>(IIII)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v2, Lli1;->b:Lki1;

    .line 271
    .line 272
    iput-object v1, p0, Lzr0;->g:Ljava/lang/Object;

    .line 273
    .line 274
    new-instance v1, Lir;

    .line 275
    .line 276
    invoke-direct {v1, v2}, Lir;-><init>(Low0;)V

    .line 277
    .line 278
    .line 279
    iput-object v1, p0, Lzr0;->f:Ljava/lang/Object;

    .line 280
    .line 281
    new-instance v1, Lx6;

    .line 282
    .line 283
    const/16 v4, 0x17

    .line 284
    .line 285
    invoke-direct {v1, p0, v4}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 286
    .line 287
    .line 288
    invoke-static {}, Lpg3;->n()Lwz0;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v2, v1, v4}, Lli1;->f(Lnw0;Ljava/util/concurrent/Executor;)V

    .line 293
    .line 294
    .line 295
    new-instance v1, Luw0;

    .line 296
    .line 297
    iget-object v2, p0, Lzr0;->f:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v2, Lir;

    .line 300
    .line 301
    invoke-virtual {v2}, Lir;->getSurface()Landroid/view/Surface;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    new-instance v4, Landroid/util/Size;

    .line 306
    .line 307
    iget-object v5, p0, Lzr0;->f:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v5, Lir;

    .line 310
    .line 311
    invoke-virtual {v5}, Lir;->getWidth()I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    iget-object v6, p0, Lzr0;->f:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v6, Lir;

    .line 318
    .line 319
    invoke-virtual {v6}, Lir;->getHeight()I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    invoke-direct {v4, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v1, v2, v4, v0}, Luw0;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 327
    .line 328
    .line 329
    iput-object v1, p0, Lzr0;->h:Ljava/lang/Object;

    .line 330
    .line 331
    iget-object v0, p0, Lzr0;->f:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Lir;

    .line 334
    .line 335
    iget-object v1, v1, Ld70;->e:Lxm;

    .line 336
    .line 337
    invoke-static {v1}, Lw11;->w(Ls81;)Ls81;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    new-instance v2, Llr;

    .line 345
    .line 346
    invoke-direct {v2, v0, v3}, Llr;-><init>(Lir;I)V

    .line 347
    .line 348
    .line 349
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-interface {v1, v2, v0}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Lzr0;->h:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Luw0;

    .line 359
    .line 360
    sget-object v1, Lmb0;->d:Lmb0;

    .line 361
    .line 362
    const/4 v2, -0x1

    .line 363
    invoke-virtual {p1, v0, v1, v2}, Lbb2;->b(Ld70;Lmb0;I)V

    .line 364
    .line 365
    .line 366
    iget-object v0, p0, Lzr0;->g:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Lki1;

    .line 369
    .line 370
    iget-object v1, p1, Lab2;->b:Lir;

    .line 371
    .line 372
    invoke-virtual {v1, v0}, Lir;->c(Lmo;)V

    .line 373
    .line 374
    .line 375
    iget-object v1, p1, Lab2;->e:Ljava/util/ArrayList;

    .line 376
    .line 377
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-nez v2, :cond_c

    .line 382
    .line 383
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    :cond_c
    new-instance v0, Ldp;

    .line 387
    .line 388
    invoke-direct {v0, p0, v3}, Ldp;-><init>(Ljava/lang/Object;I)V

    .line 389
    .line 390
    .line 391
    iget-object v1, p1, Lab2;->d:Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-eqz v2, :cond_d

    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_d
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    :goto_5
    new-instance v0, Landroid/hardware/camera2/params/InputConfiguration;

    .line 404
    .line 405
    iget-object v1, p0, Lzr0;->f:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, Lir;

    .line 408
    .line 409
    invoke-virtual {v1}, Lir;->getWidth()I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    iget-object v2, p0, Lzr0;->f:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v2, Lir;

    .line 416
    .line 417
    invoke-virtual {v2}, Lir;->getHeight()I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    iget-object p0, p0, Lzr0;->f:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast p0, Lir;

    .line 424
    .line 425
    invoke-virtual {p0}, Lir;->a()I

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    invoke-direct {v0, v1, v2, p0}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 430
    .line 431
    .line 432
    iput-object v0, p1, Lab2;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 433
    .line 434
    goto :goto_7

    .line 435
    :cond_e
    add-int/lit8 v2, v2, 0x1

    .line 436
    .line 437
    goto/16 :goto_4

    .line 438
    .line 439
    :cond_f
    :goto_6
    iget-object p0, p1, Lab2;->b:Lir;

    .line 440
    .line 441
    iput v5, p0, Lir;->a:I

    .line 442
    .line 443
    :goto_7
    return-void

    .line 444
    :catchall_0
    move-exception p0

    .line 445
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 446
    throw p0
.end method

.method public final f()Lty;
    .locals 2

    .line 1
    iget-object p0, p0, Ljn;->m:Lcn;

    .line 2
    .line 3
    iget-object v0, p0, Lcn;->e:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object p0, p0, Lcn;->f:Ld52;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lho;

    .line 12
    .line 13
    iget-object p0, p0, Ld52;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Luk1;

    .line 16
    .line 17
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v1, p0}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object v1

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object p0, p0, Ljn;->m:Lcn;

    .line 2
    .line 3
    iget-object v0, p0, Lcn;->e:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    new-instance v1, Ld52;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ld52;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcn;->f:Ld52;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    new-instance v0, Lum;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lu32;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lum;->c:Lu32;

    .line 27
    .line 28
    new-instance v1, Lxm;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lxm;-><init>(Lum;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Lum;->b:Lxm;

    .line 34
    .line 35
    const-class v2, Len;

    .line 36
    .line 37
    iput-object v2, v0, Lum;->a:Ljava/lang/Object;

    .line 38
    .line 39
    :try_start_1
    iget-object v2, p0, Lcn;->d:Ly92;

    .line 40
    .line 41
    new-instance v3, Lbn;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct {v3, p0, v0, v4}, Lbn;-><init>(Lcn;Lum;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    const-string p0, "clearCaptureRequestOptions"

    .line 51
    .line 52
    iput-object p0, v0, Lum;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p0

    .line 56
    invoke-virtual {v1, p0}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {v1}, Lw11;->w(Ls81;)Ls81;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance v0, Lh7;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {v0, v1}, Lh7;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lpg3;->g()Lo80;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {p0, v0, v1}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    throw p0
.end method

.method public final h(Lin;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljn;->b:Lhn;

    .line 2
    .line 3
    iget-object p0, p0, Lhn;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljn;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ljn;->p:I

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    iput v1, p0, Ljn;->p:I

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "Decrementing use count occurs more times than incrementing"

    .line 19
    .line 20
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public final j()Lfb2;
    .locals 11

    .line 1
    iget-object v0, p0, Ljn;->g:Lbb2;

    .line 2
    .line 3
    iget v1, p0, Ljn;->v:I

    .line 4
    .line 5
    iget-object v2, v0, Lab2;->b:Lir;

    .line 6
    .line 7
    iput v1, v2, Lir;->a:I

    .line 8
    .line 9
    new-instance v1, Ld52;

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ld52;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v1, v2, v4}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Ljn;->h:Lfl0;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget v4, v2, Lfl0;->c:I

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    const/4 v6, 0x3

    .line 35
    if-eq v4, v6, :cond_0

    .line 36
    .line 37
    move v4, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v4, v6

    .line 40
    :goto_0
    sget-object v7, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 41
    .line 42
    iget-object v8, v2, Lfl0;->a:Ljn;

    .line 43
    .line 44
    iget-object v8, v8, Ljn;->e:Lgp;

    .line 45
    .line 46
    sget-object v9, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 47
    .line 48
    invoke-virtual {v8, v9}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, [I

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    if-nez v8, :cond_2

    .line 56
    .line 57
    :cond_1
    move v5, v9

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {v8, v4}, Ljn;->l([II)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_3

    .line 64
    .line 65
    move v5, v4

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {v8, v5}, Ljn;->l([II)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-static {v8, v3}, Ljn;->l([II)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_1

    .line 79
    .line 80
    move v5, v3

    .line 81
    :goto_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v1, v7, v4}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v2, Lfl0;->d:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 89
    .line 90
    array-length v5, v4

    .line 91
    if-eqz v5, :cond_5

    .line 92
    .line 93
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 94
    .line 95
    invoke-virtual {v1, v5, v4}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    iget-object v4, v2, Lfl0;->e:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 99
    .line 100
    array-length v5, v4

    .line 101
    if-eqz v5, :cond_6

    .line 102
    .line 103
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 104
    .line 105
    invoke-virtual {v1, v5, v4}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    iget-object v2, v2, Lfl0;->f:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 109
    .line 110
    array-length v4, v2

    .line 111
    if-eqz v4, :cond_7

    .line 112
    .line 113
    sget-object v4, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 114
    .line 115
    invoke-virtual {v1, v4, v2}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    iget-object v2, p0, Ljn;->s:Ld52;

    .line 119
    .line 120
    iget-object v2, v2, Ld52;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Landroid/util/Range;

    .line 123
    .line 124
    if-eqz v2, :cond_8

    .line 125
    .line 126
    sget-object v4, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 127
    .line 128
    invoke-virtual {v1, v4, v2}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_8
    iget-object v2, p0, Ljn;->i:Lu93;

    .line 132
    .line 133
    iget-object v2, v2, Lu93;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Lt93;

    .line 136
    .line 137
    invoke-interface {v2, v1}, Lt93;->g(Ld52;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, p0, Ljn;->h:Lfl0;

    .line 141
    .line 142
    iget-boolean v2, v2, Lfl0;->g:Z

    .line 143
    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    const/4 v2, 0x5

    .line 147
    goto :goto_2

    .line 148
    :cond_9
    move v2, v3

    .line 149
    :goto_2
    iget-boolean v4, p0, Ljn;->q:Z

    .line 150
    .line 151
    const/4 v5, 0x2

    .line 152
    if-eqz v4, :cond_a

    .line 153
    .line 154
    sget-object v4, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 155
    .line 156
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v1, v4, v5}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_a
    iget v4, p0, Ljn;->r:I

    .line 165
    .line 166
    if-eqz v4, :cond_c

    .line 167
    .line 168
    if-eq v4, v3, :cond_e

    .line 169
    .line 170
    if-eq v4, v5, :cond_b

    .line 171
    .line 172
    :goto_3
    move v6, v2

    .line 173
    goto :goto_5

    .line 174
    :cond_b
    :goto_4
    move v6, v3

    .line 175
    goto :goto_5

    .line 176
    :cond_c
    iget-object v2, p0, Ljn;->t:Lme;

    .line 177
    .line 178
    iget-boolean v4, v2, Lme;->a:Z

    .line 179
    .line 180
    if-nez v4, :cond_b

    .line 181
    .line 182
    iget-boolean v2, v2, Lme;->b:Z

    .line 183
    .line 184
    if-eqz v2, :cond_d

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_d
    move v6, v5

    .line 188
    :cond_e
    :goto_5
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 189
    .line 190
    iget-object v4, p0, Ljn;->e:Lgp;

    .line 191
    .line 192
    invoke-static {v4, v6}, Ljn;->k(Lgp;I)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v1, v2, v4}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 204
    .line 205
    iget-object v4, p0, Ljn;->e:Lgp;

    .line 206
    .line 207
    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 208
    .line 209
    invoke-virtual {v4, v5}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    check-cast v4, [I

    .line 214
    .line 215
    if-nez v4, :cond_10

    .line 216
    .line 217
    :cond_f
    move v3, v9

    .line 218
    goto :goto_6

    .line 219
    :cond_10
    invoke-static {v4, v3}, Ljn;->l([II)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_11

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_11
    invoke-static {v4, v3}, Ljn;->l([II)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eqz v4, :cond_f

    .line 231
    .line 232
    :goto_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v1, v2, v3}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object v2, p0, Ljn;->k:Lzr3;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 245
    .line 246
    iget-object v2, v2, Lzr3;->c:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v2, Ld1;

    .line 249
    .line 250
    iget-object v2, v2, Ld1;->a:Ljava/lang/Object;

    .line 251
    .line 252
    monitor-enter v2

    .line 253
    :try_start_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 254
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v1, v3, v2}, Ld52;->F(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iget-object v2, p0, Ljn;->m:Lcn;

    .line 262
    .line 263
    iget-object v3, v2, Lcn;->e:Ljava/lang/Object;

    .line 264
    .line 265
    monitor-enter v3

    .line 266
    :try_start_1
    iget-object v2, v2, Lcn;->f:Ld52;

    .line 267
    .line 268
    iget-object v2, v2, Ld52;->a:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v2, Luk1;

    .line 271
    .line 272
    sget-object v4, Lsy;->a:Lsy;

    .line 273
    .line 274
    invoke-virtual {v2}, Lnq1;->c()Ljava/util/Set;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-eqz v6, :cond_12

    .line 287
    .line 288
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    check-cast v6, Llf;

    .line 293
    .line 294
    iget-object v7, v1, Ld52;->a:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v7, Luk1;

    .line 297
    .line 298
    invoke-virtual {v2, v6}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    invoke-virtual {v7, v6, v4, v8}, Luk1;->o(Llf;Lsy;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_12
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 307
    new-instance v2, Lho;

    .line 308
    .line 309
    iget-object v1, v1, Ld52;->a:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v1, Luk1;

    .line 312
    .line 313
    invoke-static {v1}, Lnq1;->d(Lty;)Lnq1;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-direct {v2, v1}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iget-object v0, v0, Lab2;->b:Lir;

    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {v2}, Luk1;->m(Lty;)Luk1;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iput-object v1, v0, Lir;->d:Ljava/lang/Object;

    .line 330
    .line 331
    iget-object v0, p0, Ljn;->g:Lbb2;

    .line 332
    .line 333
    iget-wide v1, p0, Ljn;->w:J

    .line 334
    .line 335
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    iget-object v0, v0, Lab2;->b:Lir;

    .line 340
    .line 341
    const-string v2, "CameraControlSessionUpdateId"

    .line 342
    .line 343
    iget-object v0, v0, Lir;->f:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lcl1;

    .line 346
    .line 347
    iget-object v0, v0, Lnm2;->a:Landroid/util/ArrayMap;

    .line 348
    .line 349
    invoke-virtual {v0, v2, v1}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    iget-object p0, p0, Ljn;->g:Lbb2;

    .line 353
    .line 354
    invoke-virtual {p0}, Lbb2;->c()Lfb2;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    return-object p0

    .line 359
    :catchall_0
    move-exception p0

    .line 360
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 361
    throw p0

    .line 362
    :catchall_1
    move-exception p0

    .line 363
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 364
    throw p0
.end method

.method public final m(Z)V
    .locals 9

    .line 1
    const-string v0, "Camera2CameraControlImp"

    .line 2
    .line 3
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljn;->h:Lfl0;

    .line 7
    .line 8
    iget-boolean v1, v0, Lfl0;->b:Z

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iput-boolean p1, v0, Lfl0;->b:Z

    .line 16
    .line 17
    iget-boolean v1, v0, Lfl0;->b:Z

    .line 18
    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    iget-object v1, v0, Lfl0;->a:Ljn;

    .line 22
    .line 23
    iget-object v4, v1, Ljn;->b:Lhn;

    .line 24
    .line 25
    iget-object v4, v4, Lhn;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v4, v1, Ljn;->b:Lhn;

    .line 33
    .line 34
    iget-object v4, v4, Lhn;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Ljava/util/HashSet;

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object v4, v0, Lfl0;->d:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 42
    .line 43
    array-length v4, v4

    .line 44
    if-lez v4, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-boolean v5, v0, Lfl0;->b:Z

    .line 52
    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v5, Lir;

    .line 57
    .line 58
    invoke-direct {v5}, Lir;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-boolean v2, v5, Lir;->b:Z

    .line 62
    .line 63
    iget v6, v0, Lfl0;->c:I

    .line 64
    .line 65
    iput v6, v5, Lir;->a:I

    .line 66
    .line 67
    invoke-static {}, Luk1;->j()Luk1;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    sget-object v7, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 72
    .line 73
    invoke-static {v7}, Lho;->L(Landroid/hardware/camera2/CaptureRequest$Key;)Llf;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v6, v7, v4}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v4, Lho;

    .line 81
    .line 82
    invoke-static {v6}, Lnq1;->d(Lty;)Lnq1;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-direct {v4, v6}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v4}, Lir;->e(Lty;)V

    .line 90
    .line 91
    .line 92
    iget-object v4, v0, Lfl0;->a:Ljn;

    .line 93
    .line 94
    invoke-virtual {v5}, Lir;->i()Ljr;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v4, v5}, Ljn;->n(Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    sget-object v4, Lfl0;->h:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 106
    .line 107
    iput-object v4, v0, Lfl0;->d:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 108
    .line 109
    iput-object v4, v0, Lfl0;->e:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 110
    .line 111
    iput-object v4, v0, Lfl0;->f:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljn;->p()J

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_1
    iget-object v0, p0, Ljn;->i:Lu93;

    .line 117
    .line 118
    iget-boolean v1, v0, Lu93;->a:Z

    .line 119
    .line 120
    if-ne v1, p1, :cond_4

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    iput-boolean p1, v0, Lu93;->a:Z

    .line 124
    .line 125
    if-nez p1, :cond_6

    .line 126
    .line 127
    iget-object v1, v0, Lu93;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Lv93;

    .line 130
    .line 131
    monitor-enter v1

    .line 132
    :try_start_0
    iget-object v4, v0, Lu93;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Lv93;

    .line 135
    .line 136
    invoke-virtual {v4}, Lv93;->e()V

    .line 137
    .line 138
    .line 139
    iget-object v4, v0, Lu93;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, Lv93;

    .line 142
    .line 143
    new-instance v5, Lyf;

    .line 144
    .line 145
    invoke-virtual {v4}, Lv93;->d()F

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    invoke-virtual {v4}, Lv93;->b()F

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-virtual {v4}, Lv93;->c()F

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-virtual {v4}, Lv93;->a()F

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    invoke-direct {v5, v6, v7, v8, v4}, Lyf;-><init>(FFFF)V

    .line 162
    .line 163
    .line 164
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    iget-object v6, v0, Lu93;->d:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v6, Lrk1;

    .line 176
    .line 177
    if-ne v1, v4, :cond_5

    .line 178
    .line 179
    invoke-virtual {v6, v5}, Lrk1;->j(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-virtual {v6, v5}, Lrk1;->k(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :goto_2
    iget-object v1, v0, Lu93;->e:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Lt93;

    .line 189
    .line 190
    invoke-interface {v1}, Lt93;->o()V

    .line 191
    .line 192
    .line 193
    iget-object v0, v0, Lu93;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Ljn;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljn;->p()J

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :catchall_0
    move-exception p0

    .line 202
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    throw p0

    .line 204
    :cond_6
    :goto_3
    iget-object v0, p0, Ljn;->j:Lvt;

    .line 205
    .line 206
    iget-boolean v1, v0, Lvt;->a:Z

    .line 207
    .line 208
    const/4 v4, 0x0

    .line 209
    if-ne v1, p1, :cond_7

    .line 210
    .line 211
    goto/16 :goto_5

    .line 212
    .line 213
    :cond_7
    iput-boolean p1, v0, Lvt;->a:Z

    .line 214
    .line 215
    if-nez p1, :cond_a

    .line 216
    .line 217
    iget-boolean v1, v0, Lvt;->b:Z

    .line 218
    .line 219
    if-eqz v1, :cond_9

    .line 220
    .line 221
    iput-boolean v4, v0, Lvt;->b:Z

    .line 222
    .line 223
    iget-object v1, v0, Lvt;->c:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, Ljn;

    .line 226
    .line 227
    iput-boolean v4, v1, Ljn;->q:Z

    .line 228
    .line 229
    new-instance v5, Lir;

    .line 230
    .line 231
    invoke-direct {v5}, Lir;-><init>()V

    .line 232
    .line 233
    .line 234
    iget v6, v1, Ljn;->v:I

    .line 235
    .line 236
    iput v6, v5, Lir;->a:I

    .line 237
    .line 238
    iput-boolean v2, v5, Lir;->b:Z

    .line 239
    .line 240
    invoke-static {}, Luk1;->j()Luk1;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    sget-object v7, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 245
    .line 246
    iget-object v8, v1, Ljn;->e:Lgp;

    .line 247
    .line 248
    invoke-static {v8, v2}, Ljn;->k(Lgp;I)I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-static {v7}, Lho;->L(Landroid/hardware/camera2/CaptureRequest$Key;)Llf;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-virtual {v6, v7, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 264
    .line 265
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-static {v2}, Lho;->L(Landroid/hardware/camera2/CaptureRequest$Key;)Llf;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v6, v2, v7}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    new-instance v2, Lho;

    .line 277
    .line 278
    invoke-static {v6}, Lnq1;->d(Lty;)Lnq1;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-direct {v2, v6}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v2}, Lir;->e(Lty;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5}, Lir;->i()Ljr;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v1, v2}, Ljn;->n(Ljava/util/List;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Ljn;->p()J

    .line 300
    .line 301
    .line 302
    iget-object v1, v0, Lvt;->d:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Lrk1;

    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v5}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    if-ne v5, v6, :cond_8

    .line 323
    .line 324
    invoke-virtual {v1, v2}, Lrk1;->j(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_8
    invoke-virtual {v1, v2}, Lrk1;->k(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    :cond_9
    :goto_4
    iget-object v1, v0, Lvt;->e:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v1, Lum;

    .line 334
    .line 335
    if-eqz v1, :cond_a

    .line 336
    .line 337
    new-instance v2, Llp;

    .line 338
    .line 339
    const-string v5, "Camera is not active."

    .line 340
    .line 341
    invoke-direct {v2, v5, v4}, Llp;-><init>(Ljava/lang/String;I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v2}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 345
    .line 346
    .line 347
    iput-object v3, v0, Lvt;->e:Ljava/lang/Object;

    .line 348
    .line 349
    :cond_a
    :goto_5
    iget-object v0, p0, Ljn;->k:Lzr3;

    .line 350
    .line 351
    iget-boolean v1, v0, Lzr3;->b:Z

    .line 352
    .line 353
    if-ne p1, v1, :cond_b

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_b
    iput-boolean p1, v0, Lzr3;->b:Z

    .line 357
    .line 358
    if-nez p1, :cond_c

    .line 359
    .line 360
    iget-object v0, v0, Lzr3;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Ld1;

    .line 363
    .line 364
    iget-object v0, v0, Ld1;->a:Ljava/lang/Object;

    .line 365
    .line 366
    monitor-enter v0

    .line 367
    :try_start_2
    monitor-exit v0

    .line 368
    goto :goto_6

    .line 369
    :catchall_1
    move-exception p0

    .line 370
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 371
    throw p0

    .line 372
    :cond_c
    :goto_6
    iget-object v0, p0, Ljn;->m:Lcn;

    .line 373
    .line 374
    iget-object v1, v0, Lcn;->d:Ly92;

    .line 375
    .line 376
    new-instance v2, Lan;

    .line 377
    .line 378
    invoke-direct {v2, v4, v0, p1}, Lan;-><init>(ILjava/lang/Object;Z)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v2}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 382
    .line 383
    .line 384
    if-nez p1, :cond_d

    .line 385
    .line 386
    iget-object p0, p0, Ljn;->o:Ler0;

    .line 387
    .line 388
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 391
    .line 392
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 393
    .line 394
    .line 395
    const-string p0, "VideoUsageControl"

    .line 396
    .line 397
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    :cond_d
    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 14

    .line 1
    iget-object p0, p0, Ljn;->f:Lgr0;

    .line 2
    .line 3
    iget-object p0, p0, Lgr0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lxn;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_b

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljr;

    .line 30
    .line 31
    new-instance v2, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Luk1;->j()Luk1;

    .line 37
    .line 38
    .line 39
    new-instance v3, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcl1;->a()Lcl1;

    .line 45
    .line 46
    .line 47
    iget-object v4, v1, Ljr;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-interface {v2, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 50
    .line 51
    .line 52
    iget-object v4, v1, Ljr;->b:Lnq1;

    .line 53
    .line 54
    invoke-static {v4}, Luk1;->m(Lty;)Luk1;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget v8, v1, Ljr;->c:I

    .line 59
    .line 60
    iget-object v5, v1, Ljr;->d:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    iget-boolean v10, v1, Ljr;->e:Z

    .line 66
    .line 67
    iget-object v5, v1, Ljr;->f:Lnm2;

    .line 68
    .line 69
    new-instance v6, Landroid/util/ArrayMap;

    .line 70
    .line 71
    invoke-direct {v6}, Landroid/util/ArrayMap;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v7, v5, Lnm2;->a:Landroid/util/ArrayMap;

    .line 75
    .line 76
    invoke-virtual {v7}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_0

    .line 89
    .line 90
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    check-cast v9, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v11, v5, Lnm2;->a:Landroid/util/ArrayMap;

    .line 97
    .line 98
    invoke-virtual {v11, v9}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    invoke-virtual {v6, v9, v11}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_0
    new-instance v5, Lcl1;

    .line 107
    .line 108
    invoke-direct {v5, v6}, Lnm2;-><init>(Landroid/util/ArrayMap;)V

    .line 109
    .line 110
    .line 111
    iget v6, v1, Ljr;->c:I

    .line 112
    .line 113
    const/4 v7, 0x5

    .line 114
    const/4 v9, 0x0

    .line 115
    if-ne v6, v7, :cond_1

    .line 116
    .line 117
    iget-object v6, v1, Ljr;->g:Lso;

    .line 118
    .line 119
    if-eqz v6, :cond_1

    .line 120
    .line 121
    move-object v12, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_1
    move-object v12, v9

    .line 124
    :goto_2
    iget-object v6, v1, Ljr;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_9

    .line 135
    .line 136
    iget-boolean v1, v1, Ljr;->e:Z

    .line 137
    .line 138
    if-eqz v1, :cond_9

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    const-string v6, "Camera2CameraImpl"

    .line 145
    .line 146
    if-nez v1, :cond_2

    .line 147
    .line 148
    const-string v1, "The capture config builder already has surface inside."

    .line 149
    .line 150
    invoke-static {v6, v1}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_2
    iget-object v1, p0, Lxn;->a:Lfs0;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v7, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    iget-object v1, v1, Lfs0;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    :cond_3
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_4

    .line 182
    .line 183
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    check-cast v9, Ljava/util/Map$Entry;

    .line 188
    .line 189
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    check-cast v11, Lxy2;

    .line 194
    .line 195
    iget-boolean v13, v11, Lxy2;->f:Z

    .line 196
    .line 197
    if-eqz v13, :cond_3

    .line 198
    .line 199
    iget-boolean v11, v11, Lxy2;->e:Z

    .line 200
    .line 201
    if-eqz v11, :cond_3

    .line 202
    .line 203
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    check-cast v9, Lxy2;

    .line 208
    .line 209
    iget-object v9, v9, Lxy2;->a:Lfb2;

    .line 210
    .line 211
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_4
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_8

    .line 228
    .line 229
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    check-cast v7, Lfb2;

    .line 234
    .line 235
    iget-object v7, v7, Lfb2;->g:Ljr;

    .line 236
    .line 237
    iget-object v9, v7, Ljr;->a:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    if-nez v11, :cond_5

    .line 248
    .line 249
    invoke-virtual {v7}, Ljr;->a()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    if-eqz v11, :cond_6

    .line 254
    .line 255
    invoke-virtual {v7}, Ljr;->a()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    if-eqz v11, :cond_6

    .line 260
    .line 261
    sget-object v13, Lzy2;->P:Llf;

    .line 262
    .line 263
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-virtual {v4, v13, v11}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    :cond_6
    invoke-virtual {v7}, Ljr;->b()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    if-eqz v11, :cond_7

    .line 275
    .line 276
    invoke-virtual {v7}, Ljr;->b()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-eqz v7, :cond_7

    .line 281
    .line 282
    sget-object v11, Lzy2;->Q:Llf;

    .line 283
    .line 284
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v4, v11, v7}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_7
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eqz v9, :cond_5

    .line 300
    .line 301
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    check-cast v9, Ld70;

    .line 306
    .line 307
    invoke-virtual {v2, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_8
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_9

    .line 316
    .line 317
    const-string v1, "Unable to find a repeating surface to attach to CaptureConfig"

    .line 318
    .line 319
    invoke-static {v6, v1}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_9
    move-object v1, v5

    .line 325
    new-instance v5, Ljr;

    .line 326
    .line 327
    new-instance v6, Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v4}, Lnq1;->d(Lty;)Lnq1;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    new-instance v9, Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 339
    .line 340
    .line 341
    sget-object v2, Lnm2;->b:Lnm2;

    .line 342
    .line 343
    new-instance v2, Landroid/util/ArrayMap;

    .line 344
    .line 345
    invoke-direct {v2}, Landroid/util/ArrayMap;-><init>()V

    .line 346
    .line 347
    .line 348
    iget-object v1, v1, Lnm2;->a:Landroid/util/ArrayMap;

    .line 349
    .line 350
    invoke-virtual {v1}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_a

    .line 363
    .line 364
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    check-cast v4, Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v1, v4}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v11

    .line 374
    invoke-virtual {v2, v4, v11}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    goto :goto_5

    .line 378
    :cond_a
    new-instance v11, Lnm2;

    .line 379
    .line 380
    invoke-direct {v11, v2}, Lnm2;-><init>(Landroid/util/ArrayMap;)V

    .line 381
    .line 382
    .line 383
    invoke-direct/range {v5 .. v12}, Ljr;-><init>(Ljava/util/ArrayList;Lnq1;ILjava/util/ArrayList;ZLnm2;Lso;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :cond_b
    const-string p1, "Issue capture request"

    .line 392
    .line 393
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    iget-object p0, p0, Lxn;->W:Lrr;

    .line 397
    .line 398
    invoke-virtual {p0, v0}, Lrr;->g(Ljava/util/List;)V

    .line 399
    .line 400
    .line 401
    return-void
.end method

.method public final o()Ls81;
    .locals 6

    .line 1
    const-string v0, "updateSessionConfigAsync"

    .line 2
    .line 3
    new-instance v1, Lum;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lu32;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, Lum;->c:Lu32;

    .line 14
    .line 15
    new-instance v2, Lxm;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Lxm;-><init>(Lum;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, Lum;->b:Lxm;

    .line 21
    .line 22
    const-class v3, Len;

    .line 23
    .line 24
    iput-object v3, v1, Lum;->a:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    iget-object v3, p0, Ljn;->c:Ly92;

    .line 27
    .line 28
    new-instance v4, Lj8;

    .line 29
    .line 30
    const/4 v5, 0x4

    .line 31
    invoke-direct {v4, v5, p0, v1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, v1, Lum;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {v2, p0}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-static {v2}, Lw11;->w(Ls81;)Ls81;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public final p()J
    .locals 2

    .line 1
    iget-object v0, p0, Ljn;->u:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Ljn;->w:J

    .line 8
    .line 9
    iget-object v0, p0, Ljn;->f:Lgr0;

    .line 10
    .line 11
    iget-object v0, v0, Lgr0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lxn;

    .line 14
    .line 15
    invoke-virtual {v0}, Lxn;->J()V

    .line 16
    .line 17
    .line 18
    iget-wide v0, p0, Ljn;->w:J

    .line 19
    .line 20
    return-wide v0
.end method
