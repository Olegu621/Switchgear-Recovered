.class public final Lyk;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Le63;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ler;

.field public final synthetic c:Lzk;


# direct methods
.method public constructor <init>(Lzk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyk;->c:Lzk;

    .line 5
    .line 6
    sget-object p1, Lbl;->p:Lr4;

    .line 7
    .line 8
    iput-object p1, p0, Lyk;->a:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ls82;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyk;->b:Ler;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ler;->a(Ls82;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(Lik0;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lzk;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    iget-object v1, p0, Lyk;->c:Lzk;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lft;

    .line 10
    .line 11
    :goto_0
    sget-object v2, Lzk;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const/4 v7, 0x1

    .line 18
    invoke-virtual {v1, v2, v3, v7}, Lzk;->v(JZ)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    sget-object p1, Lbl;->l:Lr4;

    .line 25
    .line 26
    iput-object p1, p0, Lyk;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v1}, Lzk;->n()Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    sget p1, Lfg2;->a:I

    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    sget-object v2, Lzk;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    sget v2, Lbl;->b:I

    .line 47
    .line 48
    int-to-long v2, v2

    .line 49
    div-long v8, v4, v2

    .line 50
    .line 51
    rem-long v2, v4, v2

    .line 52
    .line 53
    long-to-int v3, v2

    .line 54
    iget-wide v10, v0, Ls82;->e:J

    .line 55
    .line 56
    cmp-long v2, v10, v8

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1, v8, v9, v0}, Lzk;->l(JLft;)Lft;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v2, v0

    .line 68
    :cond_3
    const/4 v6, 0x0

    .line 69
    invoke-virtual/range {v1 .. v6}, Lzk;->I(Lft;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v8, Lbl;->m:Lr4;

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    if-eq v0, v8, :cond_12

    .line 77
    .line 78
    sget-object v10, Lbl;->o:Lr4;

    .line 79
    .line 80
    if-ne v0, v10, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1}, Lzk;->q()J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    cmp-long v0, v4, v6

    .line 87
    .line 88
    if-gez v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v2}, Lry;->b()V

    .line 91
    .line 92
    .line 93
    :cond_4
    move-object v0, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_5
    sget-object v6, Lbl;->n:Lr4;

    .line 96
    .line 97
    if-ne v0, v6, :cond_11

    .line 98
    .line 99
    invoke-static {p1}, Lmz0;->b(Lc10;)Lc10;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lqj3;->w(Lc10;)Ler;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :try_start_0
    iput-object p1, p0, Lyk;->b:Ler;

    .line 108
    .line 109
    move-object v6, p0

    .line 110
    invoke-virtual/range {v1 .. v6}, Lzk;->I(Lft;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v8, :cond_6

    .line 115
    .line 116
    invoke-virtual {v6, v2, v3}, Lyk;->a(Ls82;I)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_5

    .line 120
    .line 121
    :catchall_0
    move-exception v0

    .line 122
    move-object p0, v0

    .line 123
    goto/16 :goto_6

    .line 124
    .line 125
    :cond_6
    if-ne p0, v10, :cond_10

    .line 126
    .line 127
    invoke-virtual {v1}, Lzk;->q()J

    .line 128
    .line 129
    .line 130
    move-result-wide v10

    .line 131
    cmp-long p0, v4, v10

    .line 132
    .line 133
    if-gez p0, :cond_7

    .line 134
    .line 135
    invoke-virtual {v2}, Lry;->b()V

    .line 136
    .line 137
    .line 138
    :cond_7
    sget-object p0, Lzk;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 139
    .line 140
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    check-cast p0, Lft;

    .line 145
    .line 146
    :goto_1
    sget-object v0, Lzk;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    invoke-virtual {v1, v2, v3, v7}, Lzk;->v(JZ)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_9

    .line 157
    .line 158
    iget-object p0, v6, Lyk;->b:Ler;

    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iput-object v9, v6, Lyk;->b:Ler;

    .line 164
    .line 165
    sget-object v0, Lbl;->l:Lr4;

    .line 166
    .line 167
    iput-object v0, v6, Lyk;->a:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual {v1}, Lzk;->n()Ljava/lang/Throwable;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-nez v0, :cond_8

    .line 174
    .line 175
    sget-object v0, Lo42;->b:Lm42;

    .line 176
    .line 177
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {p0, v0}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_5

    .line 183
    .line 184
    :cond_8
    sget-object v1, Lo42;->b:Lm42;

    .line 185
    .line 186
    new-instance v1, Ln42;

    .line 187
    .line 188
    invoke-direct {v1, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v1}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_9
    sget-object v0, Lzk;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    sget v0, Lbl;->b:I

    .line 202
    .line 203
    int-to-long v2, v0

    .line 204
    div-long v10, v4, v2

    .line 205
    .line 206
    rem-long v2, v4, v2

    .line 207
    .line 208
    long-to-int v3, v2

    .line 209
    iget-wide v12, p0, Ls82;->e:J

    .line 210
    .line 211
    cmp-long v0, v12, v10

    .line 212
    .line 213
    if-eqz v0, :cond_b

    .line 214
    .line 215
    invoke-virtual {v1, v10, v11, p0}, Lzk;->l(JLft;)Lft;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-nez v0, :cond_a

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_a
    move-object v2, v0

    .line 223
    goto :goto_2

    .line 224
    :cond_b
    move-object v2, p0

    .line 225
    :goto_2
    invoke-virtual/range {v1 .. v6}, Lzk;->I(Lft;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    move-object v0, v2

    .line 230
    sget-object v2, Lbl;->m:Lr4;

    .line 231
    .line 232
    if-ne p0, v2, :cond_c

    .line 233
    .line 234
    invoke-virtual {v6, v0, v3}, Lyk;->a(Ls82;I)V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_c
    sget-object v2, Lbl;->o:Lr4;

    .line 239
    .line 240
    if-ne p0, v2, :cond_e

    .line 241
    .line 242
    invoke-virtual {v1}, Lzk;->q()J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    cmp-long p0, v4, v2

    .line 247
    .line 248
    if-gez p0, :cond_d

    .line 249
    .line 250
    invoke-virtual {v0}, Lry;->b()V

    .line 251
    .line 252
    .line 253
    :cond_d
    move-object p0, v0

    .line 254
    goto :goto_1

    .line 255
    :cond_e
    sget-object v1, Lbl;->n:Lr4;

    .line 256
    .line 257
    if-eq p0, v1, :cond_f

    .line 258
    .line 259
    invoke-virtual {v0}, Lry;->b()V

    .line 260
    .line 261
    .line 262
    iput-object p0, v6, Lyk;->a:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v9, v6, Lyk;->b:Ler;

    .line 265
    .line 266
    :goto_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 270
    .line 271
    const-string v0, "unexpected"

    .line 272
    .line 273
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p0

    .line 277
    :cond_10
    invoke-virtual {v2}, Lry;->b()V

    .line 278
    .line 279
    .line 280
    iput-object p0, v6, Lyk;->a:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v9, v6, Lyk;->b:Ler;

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :goto_4
    invoke-virtual {p1, p0, v9}, Ler;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    .line 288
    :goto_5
    invoke-virtual {p1}, Ler;->s()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    sget-object p1, Lz10;->a:Lz10;

    .line 293
    .line 294
    return-object p0

    .line 295
    :goto_6
    invoke-virtual {p1}, Ler;->B()V

    .line 296
    .line 297
    .line 298
    throw p0

    .line 299
    :cond_11
    move-object v6, p0

    .line 300
    invoke-virtual {v2}, Lry;->b()V

    .line 301
    .line 302
    .line 303
    iput-object v0, v6, Lyk;->a:Ljava/lang/Object;

    .line 304
    .line 305
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 306
    .line 307
    return-object p0

    .line 308
    :cond_12
    const-string p0, "unreachable"

    .line 309
    .line 310
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v9
.end method
