.class public final synthetic Lkv0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ldb2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkv0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lkv0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lfb2;)V
    .locals 11

    .line 1
    iget v0, p0, Lkv0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lkv0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Leb2;

    .line 11
    .line 12
    iget-object p0, p0, Leb2;->l:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ldb2;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ldb2;->a(Lfb2;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void

    .line 35
    :pswitch_0
    check-cast p0, Lvw1;

    .line 36
    .line 37
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object p1, p0, Lwy2;->f:Lzy2;

    .line 45
    .line 46
    check-cast p1, Lww1;

    .line 47
    .line 48
    iget-object v0, p0, Lwy2;->g:Lpg;

    .line 49
    .line 50
    invoke-virtual {p0, p1, v0}, Lvw1;->E(Lww1;Lpg;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lwy2;->n()V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :pswitch_1
    check-cast p0, Lqi1;

    .line 58
    .line 59
    invoke-virtual {p0}, Lqi1;->c()Lfb2;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lqi1;->b:Ljava/lang/Object;

    .line 64
    .line 65
    iget-object p0, p0, Lqi1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lmn;

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    iget-object v4, p0, Lmn;->b:Lxn;

    .line 72
    .line 73
    :try_start_0
    new-instance p0, Lmn;

    .line 74
    .line 75
    invoke-direct {p0, v4, v2}, Lmn;-><init>(Lxn;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, Lpy0;->Y(Lvm;)Lxm;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    :try_start_1
    iget-object p0, p0, Lxm;->b:Lwm;

    .line 83
    .line 84
    invoke-virtual {p0}, Ll0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    :try_start_2
    check-cast p0, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1

    .line 94
    if-nez p0, :cond_2

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_2
    iget-object p0, v4, Lxn;->h0:Lqi1;

    .line 98
    .line 99
    iget-object p1, p0, Lqi1;->b:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v6, p1

    .line 102
    check-cast v6, Lfb2;

    .line 103
    .line 104
    iget-object p1, p0, Lqi1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v7, p1

    .line 107
    check-cast v7, Lpi1;

    .line 108
    .line 109
    invoke-static {p0}, Lxn;->v(Lqi1;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    sget-object p0, Lbz2;->f:Lbz2;

    .line 114
    .line 115
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    iget-object p0, v4, Lxn;->c:Ly92;

    .line 120
    .line 121
    new-instance v3, Lon;

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-direct/range {v3 .. v10}, Lon;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v3}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :catch_0
    move-exception v0

    .line 133
    goto :goto_2

    .line 134
    :catch_1
    move-exception v0

    .line 135
    :goto_2
    move-object p0, v0

    .line 136
    const-string p1, "Unable to check if MeteringRepeating is attached."

    .line 137
    .line 138
    invoke-static {p1, p0}, Lds0;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    :goto_3
    return-void

    .line 142
    :pswitch_2
    check-cast p0, Lzv0;

    .line 143
    .line 144
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-nez p1, :cond_4

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    iget-object p1, p0, Lzv0;->u:Lqm2;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-static {}, Lpg3;->a()V

    .line 157
    .line 158
    .line 159
    iput-boolean v1, p1, Lqm2;->d:Z

    .line 160
    .line 161
    invoke-virtual {p0, v1}, Lzv0;->B(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lwy2;->d()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object v0, p0, Lwy2;->f:Lzy2;

    .line 169
    .line 170
    check-cast v0, Law0;

    .line 171
    .line 172
    iget-object v3, p0, Lwy2;->g:Lpg;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, p1, v0, v3}, Lzv0;->C(Ljava/lang/String;Law0;Lpg;)Lbb2;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iput-object p1, p0, Lzv0;->s:Lbb2;

    .line 182
    .line 183
    invoke-virtual {p1}, Lbb2;->c()Lfb2;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    .line 195
    .line 196
    aget-object p1, p1, v2

    .line 197
    .line 198
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p0, p1}, Lwy2;->A(Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Lwy2;->n()V

    .line 212
    .line 213
    .line 214
    iget-object p0, p0, Lzv0;->u:Lqm2;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Lpg3;->a()V

    .line 220
    .line 221
    .line 222
    iput-boolean v2, p0, Lqm2;->d:Z

    .line 223
    .line 224
    invoke-virtual {p0}, Lqm2;->c()V

    .line 225
    .line 226
    .line 227
    :goto_4
    return-void

    .line 228
    :pswitch_3
    check-cast p0, Lpv0;

    .line 229
    .line 230
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-nez p1, :cond_5

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_5
    invoke-static {}, Lpg3;->a()V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lpv0;->t:Lcb2;

    .line 241
    .line 242
    const/4 v0, 0x0

    .line 243
    if-eqz p1, :cond_6

    .line 244
    .line 245
    invoke-virtual {p1}, Lcb2;->b()V

    .line 246
    .line 247
    .line 248
    iput-object v0, p0, Lpv0;->t:Lcb2;

    .line 249
    .line 250
    :cond_6
    iget-object p1, p0, Lpv0;->s:Luw0;

    .line 251
    .line 252
    if-eqz p1, :cond_7

    .line 253
    .line 254
    invoke-virtual {p1}, Ld70;->a()V

    .line 255
    .line 256
    .line 257
    iput-object v0, p0, Lpv0;->s:Luw0;

    .line 258
    .line 259
    :cond_7
    iget-object p1, p0, Lpv0;->o:Lrv0;

    .line 260
    .line 261
    invoke-virtual {p1}, Lrv0;->c()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lwy2;->d()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    iget-object p1, p0, Lwy2;->f:Lzy2;

    .line 268
    .line 269
    check-cast p1, Ltv0;

    .line 270
    .line 271
    iget-object v0, p0, Lwy2;->g:Lpg;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0, p1, v0}, Lpv0;->B(Ltv0;Lpg;)Lbb2;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    iput-object p1, p0, Lpv0;->r:Lbb2;

    .line 281
    .line 282
    invoke-virtual {p1}, Lbb2;->c()Lfb2;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    new-instance v0, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    .line 294
    .line 295
    aget-object p1, p1, v2

    .line 296
    .line 297
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p0, p1}, Lwy2;->A(Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Lwy2;->n()V

    .line 311
    .line 312
    .line 313
    :goto_5
    return-void

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
