.class public final Lq50;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq50;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lyq2;Lng2;)Ljava/util/List;
    .locals 6

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p2, Lu72;

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :cond_0
    new-instance p0, Lb92;

    .line 17
    .line 18
    iget-wide v0, p2, Lu72;->b:J

    .line 19
    .line 20
    long-to-double v0, v0

    .line 21
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    div-double/2addr v0, v2

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Lkotlin/Pair;

    .line 32
    .line 33
    const-string v1, "foreground_sec"

    .line 34
    .line 35
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-wide v4, p2, Lu72;->c:J

    .line 39
    .line 40
    long-to-double v4, v4

    .line 41
    div-double/2addr v4, v2

    .line 42
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v1, Lkotlin/Pair;

    .line 47
    .line 48
    const-string v2, "background_sec"

    .line 49
    .line 50
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Loc1;->f([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v0, p2, Lu72;->d:Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "last_item_index"

    .line 74
    .line 75
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object v0, p2, Lu72;->e:Ljava/lang/Integer;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "items_count"

    .line 91
    .line 92
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v0, p2, Lu72;->f:Ljava/lang/Integer;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "min_y_offset"

    .line 108
    .line 109
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    :cond_3
    iget-object v0, p2, Lu72;->g:Ljava/lang/Integer;

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v1, "min_x_offset"

    .line 125
    .line 126
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_4
    iget-object v0, p2, Lu72;->h:Ljava/lang/Integer;

    .line 130
    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "max_y_offset"

    .line 142
    .line 143
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_5
    iget-object v0, p2, Lu72;->i:Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v1, "max_x_offset"

    .line 159
    .line 160
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_6
    iget-object v0, p2, Lu72;->j:Ljava/lang/Integer;

    .line 164
    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v1, "content_height"

    .line 176
    .line 177
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :cond_7
    iget-object p2, p2, Lu72;->k:Ljava/lang/Integer;

    .line 181
    .line 182
    if-eqz p2, :cond_8

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    const-string v0, "content_width"

    .line 193
    .line 194
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    :cond_8
    const-string p2, "iglu:com.snowplowanalytics.mobile/screen_summary/jsonschema/1-0-0"

    .line 198
    .line 199
    invoke-direct {p0, p2, p1}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :goto_0
    return-object v0

    .line 207
    :pswitch_0
    if-nez p2, :cond_9

    .line 208
    .line 209
    new-instance v0, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    instance-of p0, p2, Lt72;

    .line 216
    .line 217
    if-eqz p0, :cond_a

    .line 218
    .line 219
    check-cast p2, Lt72;

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_a
    move-object p2, v0

    .line 223
    :goto_1
    if-eqz p2, :cond_d

    .line 224
    .line 225
    new-instance p0, Lzq2;

    .line 226
    .line 227
    invoke-direct {p0}, Lzq2;-><init>()V

    .line 228
    .line 229
    .line 230
    const-string p1, "id"

    .line 231
    .line 232
    iget-object v1, p2, Lt72;->c:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {p0, p1, v1}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const-string p1, "name"

    .line 238
    .line 239
    iget-object v1, p2, Lt72;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p0, p1, v1}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const-string p1, "type"

    .line 245
    .line 246
    iget-object v1, p2, Lt72;->b:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {p0, p1, v1}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    const-string p1, "fragment"

    .line 252
    .line 253
    invoke-virtual {p0, p1, v0}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p2, Lt72;->d:Ljava/lang/String;

    .line 257
    .line 258
    iget-object p2, p2, Lt72;->e:Ljava/lang/String;

    .line 259
    .line 260
    if-eqz p1, :cond_b

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-lez v1, :cond_b

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_b
    if-eqz p2, :cond_c

    .line 270
    .line 271
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-lez p1, :cond_c

    .line 276
    .line 277
    move-object p1, p2

    .line 278
    goto :goto_2

    .line 279
    :cond_c
    move-object p1, v0

    .line 280
    :goto_2
    const-string p2, "activity"

    .line 281
    .line 282
    invoke-virtual {p0, p2, p1}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    new-instance p1, Lb92;

    .line 286
    .line 287
    invoke-direct {p1, p0}, Lb92;-><init>(Lzq2;)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_d
    move-object p1, v0

    .line 292
    :goto_3
    if-eqz p1, :cond_e

    .line 293
    .line 294
    invoke-static {p1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :cond_e
    :goto_4
    return-object v0

    .line 299
    :pswitch_1
    if-nez p2, :cond_f

    .line 300
    .line 301
    new-instance p0, Lc71;

    .line 302
    .line 303
    const/4 p1, 0x1

    .line 304
    invoke-direct {p0, p1}, Lc71;-><init>(Z)V

    .line 305
    .line 306
    .line 307
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    goto :goto_6

    .line 312
    :cond_f
    instance-of p0, p2, Lj71;

    .line 313
    .line 314
    if-eqz p0, :cond_10

    .line 315
    .line 316
    check-cast p2, Lj71;

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_10
    move-object p2, v0

    .line 320
    :goto_5
    if-eqz p2, :cond_12

    .line 321
    .line 322
    new-instance p0, Lc71;

    .line 323
    .line 324
    iget-boolean p1, p2, Lj71;->a:Z

    .line 325
    .line 326
    invoke-direct {p0, p1}, Lc71;-><init>(Z)V

    .line 327
    .line 328
    .line 329
    iget-object p1, p2, Lj71;->b:Ljava/lang/Integer;

    .line 330
    .line 331
    iget-object p2, p0, Lc71;->b:Ljava/util/HashMap;

    .line 332
    .line 333
    if-eqz p1, :cond_11

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    const-string v0, "index"

    .line 344
    .line 345
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    :cond_11
    invoke-virtual {p0, p2}, Lb92;->a(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    :cond_12
    :goto_6
    :pswitch_2
    return-object v0

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "ScreenSummaryContext"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "ScreenContext"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "Lifecycle"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "DeepLinkContext"

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lnd0;
    .locals 0

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lnd0;->a:Lnd0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    sget-object p0, Lnd0;->a:Lnd0;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    sget-object p0, Lnd0;->a:Lnd0;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/util/List;
    .locals 2

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0"

    .line 7
    .line 8
    const-string v0, "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0"

    .line 9
    .line 10
    const-string v1, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0"

    .line 11
    .line 12
    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    const-string p0, "*"

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    const-string p0, "*"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_2
    const-string p0, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 36
    .line 37
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Ljava/util/List;
    .locals 0

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    sget-object p0, Lnd0;->a:Lnd0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_2
    sget-object p0, Lnd0;->a:Lnd0;

    .line 20
    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f()Ljava/util/List;
    .locals 2

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0"

    .line 7
    .line 8
    const-string v0, "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0"

    .line 9
    .line 10
    const-string v1, "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0"

    .line 11
    .line 12
    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    sget-object p0, Lnd0;->a:Lnd0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_2
    sget-object p0, Lnd0;->a:Lnd0;

    .line 28
    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Ljava/util/List;
    .locals 0

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lnd0;->a:Lnd0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 10
    .line 11
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    sget-object p0, Lnd0;->a:Lnd0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_2
    new-instance p0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Ljava/util/List;
    .locals 6

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v4, "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0"

    .line 7
    .line 8
    const-string v5, "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0"

    .line 9
    .line 10
    const-string v0, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 11
    .line 12
    const-string v1, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0"

    .line 13
    .line 14
    const-string v2, "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0"

    .line 15
    .line 16
    const-string v3, "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0"

    .line 17
    .line 18
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    const-string p0, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    const-string p0, "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0"

    .line 35
    .line 36
    const-string v0, "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0"

    .line 37
    .line 38
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    const-string p0, "iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0"

    .line 48
    .line 49
    const-string v0, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 50
    .line 51
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lyq2;Lng2;)Ljava/util/Map;
    .locals 2

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    instance-of p0, p2, Lt72;

    .line 12
    .line 13
    if-eqz p0, :cond_6

    .line 14
    .line 15
    new-instance p0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p2, Lt72;

    .line 21
    .line 22
    iget-object p1, p2, Lt72;->f:Lt72;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p2, p1, Lt72;->a:Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object p2, v0

    .line 30
    :goto_0
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-lez v1, :cond_1

    .line 37
    .line 38
    const-string v1, "previousName"

    .line 39
    .line 40
    invoke-virtual {p0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-object p2, p1, Lt72;->c:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object p2, v0

    .line 49
    :goto_1
    if-eqz p2, :cond_3

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-lez v1, :cond_3

    .line 56
    .line 57
    const-string v1, "previousId"

    .line 58
    .line 59
    invoke-virtual {p0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_3
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iget-object v0, p1, Lt72;->b:Ljava/lang/String;

    .line 65
    .line 66
    :cond_4
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-lez p1, :cond_5

    .line 73
    .line 74
    const-string p1, "previousType"

    .line 75
    .line 76
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_5
    move-object v0, p0

    .line 80
    :cond_6
    :pswitch_1
    return-object v0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lk;Lng2;)Lng2;
    .locals 9

    .line 1
    iget p0, p0, Lq50;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    instance-of p0, p1, Lv72;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p2, Lu72;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    iput-wide p0, p2, Lu72;->a:J

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_0
    move-object p0, p2

    .line 29
    check-cast p0, Lu72;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    move-object p2, v1

    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :cond_1
    instance-of v1, p1, Lxl0;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iget-wide v2, p0, Lu72;->c:J

    .line 45
    .line 46
    iget-wide v4, p0, Lu72;->a:J

    .line 47
    .line 48
    sub-long v4, v0, v4

    .line 49
    .line 50
    add-long/2addr v4, v2

    .line 51
    iput-wide v4, p0, Lu72;->c:J

    .line 52
    .line 53
    iput-wide v0, p0, Lu72;->a:J

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_2
    instance-of v1, p1, Lhh;

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    iget-wide v2, p0, Lu72;->b:J

    .line 66
    .line 67
    iget-wide v4, p0, Lu72;->a:J

    .line 68
    .line 69
    sub-long v4, v0, v4

    .line 70
    .line 71
    add-long/2addr v4, v2

    .line 72
    iput-wide v4, p0, Lu72;->b:J

    .line 73
    .line 74
    iput-wide v0, p0, Lu72;->a:J

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_3
    instance-of v1, p1, Lr72;

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    iget-wide v2, p0, Lu72;->b:J

    .line 87
    .line 88
    iget-wide v4, p0, Lu72;->a:J

    .line 89
    .line 90
    sub-long v4, v0, v4

    .line 91
    .line 92
    add-long/2addr v4, v2

    .line 93
    iput-wide v4, p0, Lu72;->b:J

    .line 94
    .line 95
    iput-wide v0, p0, Lu72;->a:J

    .line 96
    .line 97
    goto/16 :goto_8

    .line 98
    .line 99
    :cond_4
    instance-of v1, p1, Lg81;

    .line 100
    .line 101
    if-eqz v1, :cond_7

    .line 102
    .line 103
    check-cast p1, Lg81;

    .line 104
    .line 105
    iget v1, p1, Lg81;->b:I

    .line 106
    .line 107
    iget-object v2, p0, Lu72;->d:Ljava/lang/Integer;

    .line 108
    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    goto :goto_0

    .line 116
    :cond_5
    move v2, v0

    .line 117
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Integer;->max(II)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iput-object v1, p0, Lu72;->d:Ljava/lang/Integer;

    .line 126
    .line 127
    iget-object p1, p1, Lg81;->c:Ljava/lang/Integer;

    .line 128
    .line 129
    if-eqz p1, :cond_13

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iget-object v1, p0, Lu72;->e:Ljava/lang/Integer;

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    :cond_6
    invoke-static {p1, v0}, Ljava/lang/Integer;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, Lu72;->e:Ljava/lang/Integer;

    .line 152
    .line 153
    goto/16 :goto_8

    .line 154
    .line 155
    :cond_7
    instance-of v1, p1, La82;

    .line 156
    .line 157
    if-eqz v1, :cond_13

    .line 158
    .line 159
    check-cast p1, La82;

    .line 160
    .line 161
    iget-object v1, p1, La82;->b:Ljava/lang/Integer;

    .line 162
    .line 163
    if-eqz v1, :cond_b

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    iget-object v2, p1, La82;->e:Ljava/lang/Integer;

    .line 170
    .line 171
    if-eqz v2, :cond_8

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    add-int/2addr v2, v1

    .line 178
    goto :goto_1

    .line 179
    :cond_8
    move v2, v1

    .line 180
    :goto_1
    iget-object v3, p0, Lu72;->f:Ljava/lang/Integer;

    .line 181
    .line 182
    if-eqz v3, :cond_9

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    goto :goto_2

    .line 189
    :cond_9
    move v3, v1

    .line 190
    :goto_2
    invoke-static {v1, v3}, Ljava/lang/Integer;->min(II)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iput-object v1, p0, Lu72;->f:Ljava/lang/Integer;

    .line 199
    .line 200
    iget-object v1, p0, Lu72;->h:Ljava/lang/Integer;

    .line 201
    .line 202
    if-eqz v1, :cond_a

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    goto :goto_3

    .line 209
    :cond_a
    move v1, v2

    .line 210
    :goto_3
    invoke-static {v2, v1}, Ljava/lang/Integer;->max(II)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iput-object v1, p0, Lu72;->h:Ljava/lang/Integer;

    .line 219
    .line 220
    :cond_b
    iget-object v1, p1, La82;->c:Ljava/lang/Integer;

    .line 221
    .line 222
    if-eqz v1, :cond_f

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    iget-object v2, p1, La82;->d:Ljava/lang/Integer;

    .line 229
    .line 230
    if-eqz v2, :cond_c

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    add-int/2addr v2, v1

    .line 237
    goto :goto_4

    .line 238
    :cond_c
    move v2, v1

    .line 239
    :goto_4
    iget-object v3, p0, Lu72;->g:Ljava/lang/Integer;

    .line 240
    .line 241
    if-eqz v3, :cond_d

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    goto :goto_5

    .line 248
    :cond_d
    move v3, v1

    .line 249
    :goto_5
    invoke-static {v1, v3}, Ljava/lang/Integer;->min(II)I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iput-object v1, p0, Lu72;->g:Ljava/lang/Integer;

    .line 258
    .line 259
    iget-object v1, p0, Lu72;->i:Ljava/lang/Integer;

    .line 260
    .line 261
    if-eqz v1, :cond_e

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    goto :goto_6

    .line 268
    :cond_e
    move v1, v2

    .line 269
    :goto_6
    invoke-static {v2, v1}, Ljava/lang/Integer;->max(II)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    iput-object v1, p0, Lu72;->i:Ljava/lang/Integer;

    .line 278
    .line 279
    :cond_f
    iget-object v1, p1, La82;->f:Ljava/lang/Integer;

    .line 280
    .line 281
    if-eqz v1, :cond_11

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    iget-object v2, p0, Lu72;->k:Ljava/lang/Integer;

    .line 288
    .line 289
    if-eqz v2, :cond_10

    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    goto :goto_7

    .line 296
    :cond_10
    move v2, v0

    .line 297
    :goto_7
    invoke-static {v1, v2}, Ljava/lang/Integer;->max(II)I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iput-object v1, p0, Lu72;->k:Ljava/lang/Integer;

    .line 306
    .line 307
    :cond_11
    iget-object p1, p1, La82;->g:Ljava/lang/Integer;

    .line 308
    .line 309
    if-eqz p1, :cond_13

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    iget-object v1, p0, Lu72;->j:Ljava/lang/Integer;

    .line 316
    .line 317
    if-eqz v1, :cond_12

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    :cond_12
    invoke-static {p1, v0}, Ljava/lang/Integer;->max(II)I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    iput-object p1, p0, Lu72;->j:Ljava/lang/Integer;

    .line 332
    .line 333
    :cond_13
    :goto_8
    return-object p2

    .line 334
    :pswitch_0
    instance-of p0, p1, Lv72;

    .line 335
    .line 336
    if-eqz p0, :cond_14

    .line 337
    .line 338
    check-cast p1, Lv72;

    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_14
    move-object p1, v1

    .line 342
    :goto_9
    if-eqz p1, :cond_16

    .line 343
    .line 344
    iget-object v5, p1, Lv72;->c:Ljava/lang/String;

    .line 345
    .line 346
    iget-object v3, p1, Lv72;->b:Ljava/lang/String;

    .line 347
    .line 348
    iget-object v4, p1, Lv72;->d:Ljava/lang/String;

    .line 349
    .line 350
    iget-object v6, p1, Lv72;->i:Ljava/lang/String;

    .line 351
    .line 352
    iget-object v7, p1, Lv72;->j:Ljava/lang/String;

    .line 353
    .line 354
    instance-of p0, p2, Lt72;

    .line 355
    .line 356
    if-eqz p0, :cond_15

    .line 357
    .line 358
    move-object v1, p2

    .line 359
    check-cast v1, Lt72;

    .line 360
    .line 361
    :cond_15
    move-object v8, v1

    .line 362
    new-instance v2, Lt72;

    .line 363
    .line 364
    invoke-direct/range {v2 .. v8}, Lt72;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt72;)V

    .line 365
    .line 366
    .line 367
    move-object v1, v2

    .line 368
    :cond_16
    return-object v1

    .line 369
    :pswitch_1
    instance-of p0, p1, Lxl0;

    .line 370
    .line 371
    if-eqz p0, :cond_17

    .line 372
    .line 373
    new-instance v1, Lj71;

    .line 374
    .line 375
    check-cast p1, Lxl0;

    .line 376
    .line 377
    iget-object p0, p1, Lxl0;->b:Ljava/lang/Integer;

    .line 378
    .line 379
    const/4 p1, 0x1

    .line 380
    invoke-direct {v1, p1, p0}, Lj71;-><init>(ZLjava/lang/Integer;)V

    .line 381
    .line 382
    .line 383
    goto :goto_a

    .line 384
    :cond_17
    instance-of p0, p1, Lhh;

    .line 385
    .line 386
    if-eqz p0, :cond_18

    .line 387
    .line 388
    new-instance v1, Lj71;

    .line 389
    .line 390
    check-cast p1, Lhh;

    .line 391
    .line 392
    iget-object p0, p1, Lhh;->b:Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-direct {v1, v0, p0}, Lj71;-><init>(ZLjava/lang/Integer;)V

    .line 395
    .line 396
    .line 397
    :cond_18
    :goto_a
    :pswitch_2
    return-object v1

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
