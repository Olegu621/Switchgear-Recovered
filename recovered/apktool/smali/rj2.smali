.class public final Lrj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/util/Size;

.field public final c:Lmb0;

.field public final d:Z

.field public final e:Lxm;

.field public final f:Lum;

.field public final g:Lxm;

.field public final h:Lum;

.field public final i:Lum;

.field public final j:Luw0;

.field public k:Lvg;

.field public l:Lpn;

.field public m:Lnt0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lpg;->f:Landroid/util/Range;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(Landroid/util/Size;ZLmb0;Lfj2;)V
    .locals 9

    .line 1
    const-string v0, "-Surface"

    .line 2
    .line 3
    const-string v1, "-status"

    .line 4
    .line 5
    const-string v2, "-cancellation"

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v3, p0, Lrj2;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p1, p0, Lrj2;->b:Landroid/util/Size;

    .line 18
    .line 19
    iput-boolean p2, p0, Lrj2;->d:Z

    .line 20
    .line 21
    iput-object p3, p0, Lrj2;->c:Lmb0;

    .line 22
    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p3, "SurfaceRequest[size: "

    .line 26
    .line 27
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p3, ", id: "

    .line 34
    .line 35
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p3, "]"

    .line 46
    .line 47
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {p3, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Lum;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v5, Lu32;

    .line 66
    .line 67
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v5, v4, Lum;->c:Lu32;

    .line 71
    .line 72
    new-instance v5, Lxm;

    .line 73
    .line 74
    invoke-direct {v5, v4}, Lxm;-><init>(Lum;)V

    .line 75
    .line 76
    .line 77
    iput-object v5, v4, Lum;->b:Lxm;

    .line 78
    .line 79
    const-class v6, Len;

    .line 80
    .line 81
    iput-object v6, v4, Lum;->a:Ljava/lang/Object;

    .line 82
    .line 83
    :try_start_0
    invoke-virtual {p3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iput-object v2, v4, Lum;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v2

    .line 94
    invoke-virtual {v5, v2}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    check-cast p3, Lum;

    .line 102
    .line 103
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iput-object p3, p0, Lrj2;->i:Lum;

    .line 107
    .line 108
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 109
    .line 110
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    new-instance v4, Lum;

    .line 114
    .line 115
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance v7, Lu32;

    .line 119
    .line 120
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v7, v4, Lum;->c:Lu32;

    .line 124
    .line 125
    new-instance v7, Lxm;

    .line 126
    .line 127
    invoke-direct {v7, v4}, Lxm;-><init>(Lum;)V

    .line 128
    .line 129
    .line 130
    iput-object v7, v4, Lum;->b:Lxm;

    .line 131
    .line 132
    iput-object v6, v4, Lum;->a:Ljava/lang/Object;

    .line 133
    .line 134
    :try_start_1
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, v4, Lum;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :catch_1
    move-exception v1

    .line 145
    invoke-virtual {v7, v1}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 146
    .line 147
    .line 148
    :goto_1
    iput-object v7, p0, Lrj2;->g:Lxm;

    .line 149
    .line 150
    new-instance v1, Lwe2;

    .line 151
    .line 152
    const/4 v4, 0x5

    .line 153
    const/4 v8, 0x0

    .line 154
    invoke-direct {v1, p3, v5, v4, v8}, Lwe2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lpg3;->g()Lo80;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    new-instance v4, Ldp0;

    .line 162
    .line 163
    invoke-direct {v4, v8, v7, v1}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, v4, p3}, Lxm;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    check-cast p3, Lum;

    .line 174
    .line 175
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 179
    .line 180
    invoke-direct {v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance v2, Lum;

    .line 184
    .line 185
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v4, Lu32;

    .line 189
    .line 190
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object v4, v2, Lum;->c:Lu32;

    .line 194
    .line 195
    new-instance v4, Lxm;

    .line 196
    .line 197
    invoke-direct {v4, v2}, Lxm;-><init>(Lum;)V

    .line 198
    .line 199
    .line 200
    iput-object v4, v2, Lum;->b:Lxm;

    .line 201
    .line 202
    iput-object v6, v2, Lum;->a:Ljava/lang/Object;

    .line 203
    .line 204
    :try_start_2
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iput-object v0, v2, Lum;->a:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :catch_2
    move-exception v0

    .line 215
    invoke-virtual {v4, v0}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 216
    .line 217
    .line 218
    :goto_2
    iput-object v4, p0, Lrj2;->e:Lxm;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Lum;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iput-object v0, p0, Lrj2;->f:Lum;

    .line 230
    .line 231
    new-instance v0, Luw0;

    .line 232
    .line 233
    invoke-direct {v0, p0, p1}, Luw0;-><init>(Lrj2;Landroid/util/Size;)V

    .line 234
    .line 235
    .line 236
    iput-object v0, p0, Lrj2;->j:Luw0;

    .line 237
    .line 238
    iget-object p1, v0, Ld70;->e:Lxm;

    .line 239
    .line 240
    invoke-static {p1}, Lw11;->w(Ls81;)Ls81;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    new-instance v0, Lac1;

    .line 245
    .line 246
    const/16 v1, 0x10

    .line 247
    .line 248
    invoke-direct {v0, v1, p1, p3, p2}, Lac1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lpg3;->g()Lo80;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    new-instance p3, Ldp0;

    .line 256
    .line 257
    invoke-direct {p3, v8, v4, v0}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, p3, p2}, Lxm;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 261
    .line 262
    .line 263
    new-instance p2, Lv60;

    .line 264
    .line 265
    const/4 p3, 0x1

    .line 266
    invoke-direct {p2, p0, p3}, Lv60;-><init>(Lrj2;I)V

    .line 267
    .line 268
    .line 269
    invoke-static {}, Lpg3;->g()Lo80;

    .line 270
    .line 271
    .line 272
    move-result-object p3

    .line 273
    invoke-interface {p1, p2, p3}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Lpg3;->g()Lo80;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 281
    .line 282
    invoke-direct {p2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    new-instance p3, Lpn;

    .line 286
    .line 287
    invoke-direct {p3, v1, p0, p2}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-static {p3}, Lpy0;->Y(Lvm;)Lxm;

    .line 291
    .line 292
    .line 293
    move-result-object p3

    .line 294
    new-instance v0, Ler0;

    .line 295
    .line 296
    const/16 v1, 0x11

    .line 297
    .line 298
    invoke-direct {v0, p4, v1}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 299
    .line 300
    .line 301
    new-instance p4, Ldp0;

    .line 302
    .line 303
    invoke-direct {p4, v8, p3, v0}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p3, p4, p1}, Lxm;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    check-cast p1, Lum;

    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iput-object p1, p0, Lrj2;->h:Lum;

    .line 319
    .line 320
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lc00;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lrj2;->f:Lum;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lum;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lrj2;->e:Lxm;

    .line 11
    .line 12
    invoke-virtual {v0}, Lxm;->isCancelled()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, v0, Lxm;->b:Lwm;

    .line 20
    .line 21
    invoke-virtual {p0}, Ll0;->isDone()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {v2, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v0}, Lxm;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    new-instance p0, Loj2;

    .line 33
    .line 34
    invoke-direct {p0, p3, p1, v1}, Loj2;-><init>(Lc00;Landroid/view/Surface;I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    new-instance p0, Loj2;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p0, p3, p1, v0}, Loj2;-><init>(Lc00;Landroid/view/Surface;I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    :goto_0
    new-instance v0, Lwe2;

    .line 52
    .line 53
    const/4 v2, 0x6

    .line 54
    invoke-direct {v0, p3, p1, v2, v1}, Lwe2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Ldp0;

    .line 58
    .line 59
    iget-object p0, p0, Lrj2;->g:Lxm;

    .line 60
    .line 61
    invoke-direct {p1, v1, p0, v0}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, Lxm;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    new-instance v0, Llp;

    .line 2
    .line 3
    const-string v1, "Surface request will not complete."

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Llp;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lrj2;->f:Lum;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
