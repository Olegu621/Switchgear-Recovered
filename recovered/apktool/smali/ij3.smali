.class public final Lij3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljk3;


# static fields
.field public static volatile p0:Lij3;


# instance fields
.field public final U:Lmh3;

.field public final V:Lxt0;

.field public final W:Llm3;

.field public final X:Lsl3;

.field public final Y:Lof3;

.field public final Z:Lwl3;

.field public final a:Landroid/content/Context;

.field public final a0:Ljava/lang/String;

.field public final b:Z

.field public b0:Llh3;

.field public final c:Lq62;

.field public c0:Lpn3;

.field public final d:Lpd3;

.field public d0:Lme3;

.field public final e:Lki3;

.field public e0:Lih3;

.field public final f:Luh3;

.field public f0:Lxl3;

.field public g0:Z

.field public h0:Ljava/lang/Boolean;

.field public final i:Lbj3;

.field public i0:J

.field public volatile j0:Ljava/lang/Boolean;

.field public volatile k0:Z

.field public l0:I

.field public m0:I

.field public final n0:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final o0:J

.field public final v:Llo3;

.field public final w:Lup3;


# direct methods
.method public constructor <init>(Lsk3;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lij3;->g0:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, p1, Lsk3;->a:Landroid/content/Context;

    .line 15
    .line 16
    new-instance v2, Lq62;

    .line 17
    .line 18
    const/16 v3, 0xb

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lq62;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lij3;->c:Lq62;

    .line 24
    .line 25
    sput-object v2, Ljb1;->e:Lq62;

    .line 26
    .line 27
    iput-object v1, p0, Lij3;->a:Landroid/content/Context;

    .line 28
    .line 29
    iget-boolean v2, p1, Lsk3;->e:Z

    .line 30
    .line 31
    iput-boolean v2, p0, Lij3;->b:Z

    .line 32
    .line 33
    iget-object v2, p1, Lsk3;->b:Ljava/lang/Boolean;

    .line 34
    .line 35
    iput-object v2, p0, Lij3;->j0:Ljava/lang/Boolean;

    .line 36
    .line 37
    iget-object v2, p1, Lsk3;->g:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v2, p0, Lij3;->a0:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    iput-boolean v2, p0, Lij3;->k0:Z

    .line 43
    .line 44
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzkl;->zzb(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lxt0;->c:Lxt0;

    .line 48
    .line 49
    iput-object v3, p0, Lij3;->V:Lxt0;

    .line 50
    .line 51
    iget-object v3, p1, Lsk3;->f:Ljava/lang/Long;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    :goto_0
    iput-wide v3, p0, Lij3;->o0:J

    .line 65
    .line 66
    new-instance v3, Lpd3;

    .line 67
    .line 68
    invoke-direct {v3, p0}, Lsq3;-><init>(Lij3;)V

    .line 69
    .line 70
    .line 71
    sget-object v4, Lp62;->c:Lp62;

    .line 72
    .line 73
    iput-object v4, v3, Lpd3;->d:Lod3;

    .line 74
    .line 75
    iput-object v3, p0, Lij3;->d:Lpd3;

    .line 76
    .line 77
    new-instance v3, Lki3;

    .line 78
    .line 79
    invoke-direct {v3, p0}, Lki3;-><init>(Lij3;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Lhk3;->C()V

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Lij3;->e:Lki3;

    .line 86
    .line 87
    new-instance v3, Luh3;

    .line 88
    .line 89
    invoke-direct {v3, p0}, Luh3;-><init>(Lij3;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Lhk3;->C()V

    .line 93
    .line 94
    .line 95
    iput-object v3, p0, Lij3;->f:Luh3;

    .line 96
    .line 97
    new-instance v4, Lup3;

    .line 98
    .line 99
    invoke-direct {v4, p0}, Lup3;-><init>(Lij3;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Lhk3;->C()V

    .line 103
    .line 104
    .line 105
    iput-object v4, p0, Lij3;->w:Lup3;

    .line 106
    .line 107
    new-instance v4, Loi3;

    .line 108
    .line 109
    invoke-direct {v4, p1, p0}, Loi3;-><init>(Lsk3;Lij3;)V

    .line 110
    .line 111
    .line 112
    new-instance v5, Lmh3;

    .line 113
    .line 114
    invoke-direct {v5, v4}, Lmh3;-><init>(Loi3;)V

    .line 115
    .line 116
    .line 117
    iput-object v5, p0, Lij3;->U:Lmh3;

    .line 118
    .line 119
    new-instance v4, Lof3;

    .line 120
    .line 121
    invoke-direct {v4, p0}, Lof3;-><init>(Lij3;)V

    .line 122
    .line 123
    .line 124
    iput-object v4, p0, Lij3;->Y:Lof3;

    .line 125
    .line 126
    new-instance v4, Llm3;

    .line 127
    .line 128
    invoke-direct {v4, p0}, Llm3;-><init>(Lij3;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4}, Lwg3;->B()V

    .line 132
    .line 133
    .line 134
    iput-object v4, p0, Lij3;->W:Llm3;

    .line 135
    .line 136
    new-instance v4, Lsl3;

    .line 137
    .line 138
    invoke-direct {v4, p0}, Lsl3;-><init>(Lij3;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Lwg3;->B()V

    .line 142
    .line 143
    .line 144
    iput-object v4, p0, Lij3;->X:Lsl3;

    .line 145
    .line 146
    new-instance v5, Llo3;

    .line 147
    .line 148
    invoke-direct {v5, p0}, Llo3;-><init>(Lij3;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Lwg3;->B()V

    .line 152
    .line 153
    .line 154
    iput-object v5, p0, Lij3;->v:Llo3;

    .line 155
    .line 156
    new-instance v5, Lwl3;

    .line 157
    .line 158
    invoke-direct {v5, p0}, Lhk3;-><init>(Lij3;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5}, Lhk3;->C()V

    .line 162
    .line 163
    .line 164
    iput-object v5, p0, Lij3;->Z:Lwl3;

    .line 165
    .line 166
    new-instance v5, Lbj3;

    .line 167
    .line 168
    invoke-direct {v5, p0}, Lbj3;-><init>(Lij3;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5}, Lhk3;->C()V

    .line 172
    .line 173
    .line 174
    iput-object v5, p0, Lij3;->i:Lbj3;

    .line 175
    .line 176
    iget-object v6, p1, Lsk3;->d:Lcom/google/android/gms/internal/measurement/zzdd;

    .line 177
    .line 178
    if-eqz v6, :cond_1

    .line 179
    .line 180
    iget-wide v6, v6, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    .line 181
    .line 182
    const-wide/16 v8, 0x0

    .line 183
    .line 184
    cmp-long v6, v6, v8

    .line 185
    .line 186
    if-eqz v6, :cond_1

    .line 187
    .line 188
    move v2, v0

    .line 189
    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    instance-of v1, v1, Landroid/app/Application;

    .line 194
    .line 195
    if-eqz v1, :cond_3

    .line 196
    .line 197
    invoke-static {v4}, Lij3;->k(Lwg3;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v4, Lsq3;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, Lij3;

    .line 203
    .line 204
    iget-object v1, v1, Lij3;->a:Landroid/content/Context;

    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    instance-of v1, v1, Landroid/app/Application;

    .line 211
    .line 212
    if-eqz v1, :cond_4

    .line 213
    .line 214
    iget-object v1, v4, Lsq3;->a:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v1, Lij3;

    .line 217
    .line 218
    iget-object v1, v1, Lij3;->a:Landroid/content/Context;

    .line 219
    .line 220
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Landroid/app/Application;

    .line 225
    .line 226
    iget-object v3, v4, Lsl3;->c:Ldh0;

    .line 227
    .line 228
    if-nez v3, :cond_2

    .line 229
    .line 230
    new-instance v3, Ldh0;

    .line 231
    .line 232
    const/4 v6, 0x2

    .line 233
    invoke-direct {v3, v4, v6}, Ldh0;-><init>(Ljava/lang/Object;I)V

    .line 234
    .line 235
    .line 236
    iput-object v3, v4, Lsl3;->c:Ldh0;

    .line 237
    .line 238
    :cond_2
    if-eqz v2, :cond_4

    .line 239
    .line 240
    iget-object v2, v4, Lsl3;->c:Ldh0;

    .line 241
    .line 242
    invoke-virtual {v1, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 243
    .line 244
    .line 245
    iget-object v2, v4, Lsl3;->c:Ldh0;

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 248
    .line 249
    .line 250
    iget-object v1, v4, Lsq3;->a:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, Lij3;

    .line 253
    .line 254
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 255
    .line 256
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 257
    .line 258
    .line 259
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 260
    .line 261
    const-string v2, "Registered activity lifecycle callback"

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_3
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v3, Luh3;->w:Lsh3;

    .line 271
    .line 272
    const-string v2, "Application context is not an Application"

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :cond_4
    :goto_1
    new-instance v1, Ldp0;

    .line 278
    .line 279
    const/16 v2, 0x1a

    .line 280
    .line 281
    invoke-direct {v1, p0, p1, v2, v0}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 285
    .line 286
    .line 287
    return-void
.end method

.method public static final i(Leg3;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Component not created"

    .line 5
    .line 6
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final j(Lsq3;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Component not created"

    .line 5
    .line 6
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final k(Lwg3;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Lwg3;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Component not created"

    .line 27
    .line 28
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final l(Lhk3;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Lhk3;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Component not created"

    .line 27
    .line 28
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static r(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lij3;
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v6, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-boolean v5, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzc:Z

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    .line 8
    .line 9
    iget-wide v1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdd;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzdd;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lij3;->p0:Lij3;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const-class v1, Lij3;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, Lij3;->p0:Lij3;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lsk3;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1, p2}, Lsk3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Lij3;

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lij3;-><init>(Lsk3;)V

    .line 47
    .line 48
    .line 49
    sput-object p0, Lij3;->p0:Lij3;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    monitor-exit v1

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p0

    .line 59
    :cond_2
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Landroid/os/Bundle;

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    const-string p1, "dataCollectionDefaultEnabled"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    sget-object p1, Lij3;->p0:Lij3;

    .line 74
    .line 75
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lij3;->p0:Lij3;

    .line 79
    .line 80
    const-string p2, "dataCollectionDefaultEnabled"

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, p1, Lij3;->j0:Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_3
    :goto_2
    sget-object p0, Lij3;->p0:Lij3;

    .line 93
    .line 94
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lij3;->p0:Lij3;

    .line 98
    .line 99
    return-object p0
.end method


# virtual methods
.method public final a()Luh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 2
    .line 3
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final b()Lbj3;
    .locals 0

    .line 1
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 2
    .line 3
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c()Lq62;
    .locals 0

    .line 1
    iget-object p0, p0, Lij3;->c:Lq62;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lij3;->g()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final e()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lij3;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Lxv;
    .locals 0

    .line 1
    iget-object p0, p0, Lij3;->V:Lxt0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()I
    .locals 5

    .line 1
    iget-object v0, p0, Lij3;->i:Lbj3;

    .line 2
    .line 3
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lbj3;->y()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lij3;->d:Lpd3;

    .line 10
    .line 11
    invoke-virtual {v1}, Lpd3;->M()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v2, :cond_8

    .line 17
    .line 18
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lbj3;->y()V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Lij3;->k0:Z

    .line 25
    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, Lij3;->e:Lki3;

    .line 29
    .line 30
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lsq3;->y()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v4, "measurement_enabled"

    .line 41
    .line 42
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 p0, 0x3

    .line 72
    return p0

    .line 73
    :cond_2
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lij3;

    .line 76
    .line 77
    iget-object v0, v0, Lij3;->c:Lq62;

    .line 78
    .line 79
    const-string v0, "firebase_analytics_collection_enabled"

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lpd3;->L(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 p0, 0x4

    .line 95
    return p0

    .line 96
    :cond_4
    iget-object v0, p0, Lij3;->j0:Ljava/lang/Boolean;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget-object p0, p0, Lij3;->j0:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    const/4 p0, 0x7

    .line 110
    return p0

    .line 111
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 112
    return p0

    .line 113
    :cond_7
    const/16 p0, 0x8

    .line 114
    .line 115
    return p0

    .line 116
    :cond_8
    return v3
.end method

.method public final h()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Lij3;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lij3;->i:Lbj3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lbj3;->y()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lij3;->h0:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object v2, p0, Lij3;->V:Lxt0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-wide v3, p0, Lij3;->i0:J

    .line 21
    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-wide v5, p0, Lij3;->i0:J

    .line 42
    .line 43
    sub-long/2addr v3, v5

    .line 44
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    const-wide/16 v5, 0x3e8

    .line 49
    .line 50
    cmp-long v0, v3, v5

    .line 51
    .line 52
    if-lez v0, :cond_3

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    iput-wide v2, p0, Lij3;->i0:J

    .line 62
    .line 63
    iget-object v0, p0, Lij3;->w:Lup3;

    .line 64
    .line 65
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 66
    .line 67
    .line 68
    const-string v2, "android.permission.INTERNET"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Lup3;->W(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Lup3;->W(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    iget-object v2, p0, Lij3;->a:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v2}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Lv30;->d()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const/4 v4, 0x1

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    iget-object v3, p0, Lij3;->d:Lpd3;

    .line 98
    .line 99
    invoke-virtual {v3}, Lpd3;->C()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_1

    .line 104
    .line 105
    invoke-static {v2}, Lup3;->p0(Landroid/content/Context;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    invoke-static {v2}, Lup3;->S(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    :cond_1
    move v1, v4

    .line 118
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iput-object v2, p0, Lij3;->h0:Ljava/lang/Boolean;

    .line 123
    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, Lij3;->q()Lih3;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lih3;->G()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lup3;->D(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lij3;->h0:Ljava/lang/Boolean;

    .line 143
    .line 144
    :cond_3
    iget-object p0, p0, Lij3;->h0:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    return p0

    .line 151
    :cond_4
    const-string p0, "AppMeasurement is not initialized"

    .line 152
    .line 153
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return v1
.end method

.method public final m()Lmh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lij3;->U:Lmh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Llh3;
    .locals 1

    .line 1
    iget-object v0, p0, Lij3;->b0:Llh3;

    .line 2
    .line 3
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->b0:Llh3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final o()Lpn3;
    .locals 1

    .line 1
    iget-object v0, p0, Lij3;->c0:Lpn3;

    .line 2
    .line 3
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->c0:Lpn3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final p()Lme3;
    .locals 1

    .line 1
    iget-object v0, p0, Lij3;->d0:Lme3;

    .line 2
    .line 3
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->d0:Lme3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final q()Lih3;
    .locals 1

    .line 1
    iget-object v0, p0, Lij3;->e0:Lih3;

    .line 2
    .line 3
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->e0:Lih3;

    .line 7
    .line 8
    return-object p0
.end method
