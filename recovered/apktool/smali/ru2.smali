.class public final Lru2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lsu2;


# direct methods
.method public synthetic constructor <init>(Lsu2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lru2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lru2;->b:Lsu2;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lsu2;Lgj0;I)V
    .locals 0

    .line 10
    iput p3, p0, Lru2;->a:I

    iput-object p1, p0, Lru2;->b:Lsu2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lru2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lru2;->b:Lsu2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lsu2;->a:Lpg3;

    .line 11
    .line 12
    instance-of p0, p0, Lf03;

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 20
    .line 21
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 22
    .line 23
    iget-object p0, p0, Lf31;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Lpu2;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lpu2;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_1
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 34
    .line 35
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 36
    .line 37
    iget-object p0, p0, Lf31;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v2, Lmu2;

    .line 45
    .line 46
    invoke-direct {v2, p0}, Lmu2;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v2

    .line 50
    :pswitch_2
    iget-object v0, p0, Lsu2;->r:Lhk2;

    .line 51
    .line 52
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lmu2;

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 62
    .line 63
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 64
    .line 65
    iget-object p0, p0, Lf31;->i:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v2, p0

    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    :goto_1
    return-object v2

    .line 71
    :pswitch_3
    iget-object v0, p0, Lsu2;->f:Lo61;

    .line 72
    .line 73
    sget-object v2, Lo61;->b:Lo61;

    .line 74
    .line 75
    if-eq v0, v2, :cond_3

    .line 76
    .line 77
    sget-object v2, Lo61;->d:Lo61;

    .line 78
    .line 79
    if-ne v0, v2, :cond_2

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 v1, 0x0

    .line 83
    :cond_3
    :goto_2
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 84
    .line 85
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 86
    .line 87
    iget-object p0, p0, Lf31;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ljava/util/ArrayList;

    .line 90
    .line 91
    new-instance v0, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_5

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    move-object v3, v2

    .line 111
    check-cast v3, Lev1;

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    iget-object v3, v3, Lev1;->c:Lfv1;

    .line 116
    .line 117
    sget-object v4, Lfv1;->b:Lfv1;

    .line 118
    .line 119
    if-ne v3, v4, :cond_4

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    invoke-static {v0}, Lyy1;->p(Ljava/util/List;)Ljava/util/Collection;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Ljava/util/List;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_4
    sget-object v0, Lxz2;->Companion:Lwz2;

    .line 134
    .line 135
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 136
    .line 137
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 138
    .line 139
    iget-object p0, p0, Lf31;->f:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p0, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    if-eqz p0, :cond_6

    .line 147
    .line 148
    invoke-static {p0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    xor-int/2addr v0, v1

    .line 153
    if-ne v0, v1, :cond_6

    .line 154
    .line 155
    new-instance v2, Lxz2;

    .line 156
    .line 157
    invoke-direct {v2, p0}, Lxz2;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_6
    return-object v2

    .line 161
    :pswitch_5
    sget-object v0, Lq82;->Companion:Lp82;

    .line 162
    .line 163
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 164
    .line 165
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 166
    .line 167
    iget-object p0, p0, Lf31;->e:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Lej0;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    const/4 v0, -0x1

    .line 175
    if-nez p0, :cond_7

    .line 176
    .line 177
    move p0, v0

    .line 178
    goto :goto_4

    .line 179
    :cond_7
    sget-object v3, Lo82;->a:[I

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    aget p0, v3, p0

    .line 186
    .line 187
    :goto_4
    if-eq p0, v0, :cond_b

    .line 188
    .line 189
    if-eq p0, v1, :cond_a

    .line 190
    .line 191
    const/4 v0, 0x2

    .line 192
    if-eq p0, v0, :cond_9

    .line 193
    .line 194
    const/4 v0, 0x3

    .line 195
    if-ne p0, v0, :cond_8

    .line 196
    .line 197
    sget-object v2, Lq82;->c:Lq82;

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    invoke-static {}, Lds0;->b()V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_9
    sget-object v2, Lq82;->b:Lq82;

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    sget-object v2, Lq82;->a:Lq82;

    .line 208
    .line 209
    :cond_b
    :goto_5
    return-object v2

    .line 210
    :pswitch_6
    iget-boolean v0, p0, Lsu2;->i:Z

    .line 211
    .line 212
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 213
    .line 214
    iget-object p0, p0, Ljw2;->c:Lij;

    .line 215
    .line 216
    if-eqz v0, :cond_c

    .line 217
    .line 218
    iget-object p0, p0, Lij;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Ljava/util/List;

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_c
    iget-object p0, p0, Lij;->b:Ljava/util/List;

    .line 224
    .line 225
    check-cast p0, Ljava/util/ArrayList;

    .line 226
    .line 227
    :goto_6
    return-object p0

    .line 228
    :pswitch_7
    new-instance v0, Lmu2;

    .line 229
    .line 230
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 231
    .line 232
    iget-object p0, p0, Ljw2;->b:Lf31;

    .line 233
    .line 234
    iget-object p0, p0, Lf31;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p0, Ljava/lang/String;

    .line 237
    .line 238
    invoke-direct {v0, p0}, Lmu2;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_8
    iget-object v0, p0, Lsu2;->b:Ljw2;

    .line 243
    .line 244
    iget-object p0, p0, Lsu2;->h:Lac1;

    .line 245
    .line 246
    iget-object v0, v0, Ljw2;->d:Ljava/util/List;

    .line 247
    .line 248
    new-instance v1, Ljava/util/ArrayList;

    .line 249
    .line 250
    const/16 v3, 0xa

    .line 251
    .line 252
    invoke-static {v0, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_e

    .line 268
    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Ldu1;

    .line 274
    .line 275
    iget-object v5, v4, Ldu1;->a:Ljava/lang/String;

    .line 276
    .line 277
    iget-object v4, v4, Ldu1;->b:Ljava/util/List;

    .line 278
    .line 279
    new-instance v6, Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-static {v4, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    if-eqz v7, :cond_d

    .line 297
    .line 298
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    check-cast v7, Lcu1;

    .line 303
    .line 304
    invoke-virtual {p0, v7}, Lac1;->q(Lcu1;)Lyv1;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    invoke-static {v7, v8, p0}, Lq62;->d(Lcu1;Lyv1;Lac1;)Lst2;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_d
    invoke-virtual {p0}, Lac1;->e()V

    .line 317
    .line 318
    .line 319
    new-instance v4, Lut2;

    .line 320
    .line 321
    invoke-direct {v4, v5, v6, v2}, Lut2;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ldu2;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_e
    invoke-static {v1}, Lyy1;->p(Ljava/util/List;)Ljava/util/Collection;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    check-cast p0, Ljava/util/List;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_9
    iget-object p0, p0, Lsu2;->b:Ljw2;

    .line 336
    .line 337
    iget-object p0, p0, Ljw2;->c:Lij;

    .line 338
    .line 339
    iget-object v0, p0, Lij;->d:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Lr4;

    .line 342
    .line 343
    if-nez v0, :cond_f

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_f
    new-instance v2, Lju2;

    .line 347
    .line 348
    iget-object v0, v0, Lr4;->b:Ljava/lang/String;

    .line 349
    .line 350
    iget-boolean p0, p0, Lij;->a:Z

    .line 351
    .line 352
    invoke-direct {v2, v0, p0}, Lju2;-><init>(Ljava/lang/String;Z)V

    .line 353
    .line 354
    .line 355
    :goto_9
    return-object v2

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
