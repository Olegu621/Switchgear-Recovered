.class public final Ln62;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Lw62;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    const-class v28, Landroid/util/Size;

    .line 2
    .line 3
    const-class v29, Landroid/util/SizeF;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    const-class v2, [Z

    .line 8
    .line 9
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const-class v4, [D

    .line 12
    .line 13
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v6, [I

    .line 16
    .line 17
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    const-class v8, [J

    .line 20
    .line 21
    const-class v9, Ljava/lang/String;

    .line 22
    .line 23
    const-class v10, [Ljava/lang/String;

    .line 24
    .line 25
    const-class v11, Landroid/os/Binder;

    .line 26
    .line 27
    const-class v12, Landroid/os/Bundle;

    .line 28
    .line 29
    sget-object v13, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v14, [B

    .line 32
    .line 33
    sget-object v15, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-class v16, [C

    .line 36
    .line 37
    const-class v17, Ljava/lang/CharSequence;

    .line 38
    .line 39
    const-class v18, [Ljava/lang/CharSequence;

    .line 40
    .line 41
    const-class v19, Ljava/util/ArrayList;

    .line 42
    .line 43
    sget-object v20, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    const-class v21, [F

    .line 46
    .line 47
    const-class v22, Landroid/os/Parcelable;

    .line 48
    .line 49
    const-class v23, [Landroid/os/Parcelable;

    .line 50
    .line 51
    const-class v24, Ljava/io/Serializable;

    .line 52
    .line 53
    sget-object v25, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    const-class v26, [S

    .line 56
    .line 57
    const-class v27, Landroid/util/SparseArray;

    .line 58
    .line 59
    filled-new-array/range {v1 .. v29}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Ln62;->f:[Ljava/lang/Class;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln62;->a:Ljava/util/LinkedHashMap;

    .line 46
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln62;->b:Ljava/util/LinkedHashMap;

    .line 47
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln62;->c:Ljava/util/LinkedHashMap;

    .line 48
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln62;->d:Ljava/util/LinkedHashMap;

    .line 49
    new-instance v0, Ltx;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ltx;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ln62;->e:Lw62;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln62;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ln62;->b:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Ln62;->c:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ln62;->d:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    new-instance v1, Ltx;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {v1, p0, v2}, Ltx;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Ln62;->e:Lw62;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static a(Ln62;)Landroid/os/Bundle;
    .locals 10

    .line 1
    iget-object v0, p0, Ln62;->b:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v1, p0, Ln62;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-static {v0}, Loc1;->h(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v2, :cond_7

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lw62;

    .line 42
    .line 43
    invoke-interface {v2}, Lw62;->a()Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_0
    :goto_1
    const/16 v6, 0x1d

    .line 54
    .line 55
    if-ge v4, v6, :cond_6

    .line 56
    .line 57
    sget-object v6, Ln62;->f:[Ljava/lang/Class;

    .line 58
    .line 59
    aget-object v6, v6, v4

    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    :goto_2
    iget-object v4, p0, Ln62;->c:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    instance-of v6, v4, Lrk1;

    .line 77
    .line 78
    if-eqz v6, :cond_1

    .line 79
    .line 80
    check-cast v4, Lrk1;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_1
    move-object v4, v3

    .line 84
    :goto_3
    if-eqz v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4, v2}, Lrk1;->j(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_2
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_4
    iget-object v4, p0, Ln62;->d:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lrg2;

    .line 100
    .line 101
    if-nez v4, :cond_3

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    if-nez v2, :cond_4

    .line 105
    .line 106
    sget-object v2, Ljb1;->c:Lr4;

    .line 107
    .line 108
    :cond_4
    invoke-virtual {v4, v3, v2}, Lrg2;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v0, " into saved state"

    .line 120
    .line 121
    const-string v1, "Can\'t put value with type "

    .line 122
    .line 123
    invoke-static {p0, v1, v0}, Lf42;->r(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object v3

    .line 127
    :cond_7
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_8

    .line 158
    .line 159
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    check-cast v5, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_8
    new-instance p0, Lkotlin/Pair;

    .line 177
    .line 178
    const-string v1, "keys"

    .line 179
    .line 180
    invoke-direct {p0, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance v0, Lkotlin/Pair;

    .line 184
    .line 185
    const-string v1, "values"

    .line 186
    .line 187
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    filled-new-array {p0, v0}, [Lkotlin/Pair;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    new-instance v0, Landroid/os/Bundle;

    .line 195
    .line 196
    const/4 v1, 0x2

    .line 197
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 198
    .line 199
    .line 200
    :goto_6
    if-ge v4, v1, :cond_26

    .line 201
    .line 202
    aget-object v2, p0, v4

    .line 203
    .line 204
    iget-object v5, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v5, Ljava/lang/String;

    .line 207
    .line 208
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 209
    .line 210
    if-nez v2, :cond_9

    .line 211
    .line 212
    invoke-virtual {v0, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_7

    .line 216
    .line 217
    :cond_9
    instance-of v6, v2, Ljava/lang/Boolean;

    .line 218
    .line 219
    if-eqz v6, :cond_a

    .line 220
    .line 221
    check-cast v2, Ljava/lang/Boolean;

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_7

    .line 231
    .line 232
    :cond_a
    instance-of v6, v2, Ljava/lang/Byte;

    .line 233
    .line 234
    if-eqz v6, :cond_b

    .line 235
    .line 236
    check-cast v2, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_7

    .line 246
    .line 247
    :cond_b
    instance-of v6, v2, Ljava/lang/Character;

    .line 248
    .line 249
    if-eqz v6, :cond_c

    .line 250
    .line 251
    check-cast v2, Ljava/lang/Character;

    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_7

    .line 261
    .line 262
    :cond_c
    instance-of v6, v2, Ljava/lang/Double;

    .line 263
    .line 264
    if-eqz v6, :cond_d

    .line 265
    .line 266
    check-cast v2, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 269
    .line 270
    .line 271
    move-result-wide v6

    .line 272
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_7

    .line 276
    .line 277
    :cond_d
    instance-of v6, v2, Ljava/lang/Float;

    .line 278
    .line 279
    if-eqz v6, :cond_e

    .line 280
    .line 281
    check-cast v2, Ljava/lang/Number;

    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_7

    .line 291
    .line 292
    :cond_e
    instance-of v6, v2, Ljava/lang/Integer;

    .line 293
    .line 294
    if-eqz v6, :cond_f

    .line 295
    .line 296
    check-cast v2, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_7

    .line 306
    .line 307
    :cond_f
    instance-of v6, v2, Ljava/lang/Long;

    .line 308
    .line 309
    if-eqz v6, :cond_10

    .line 310
    .line 311
    check-cast v2, Ljava/lang/Number;

    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_7

    .line 321
    .line 322
    :cond_10
    instance-of v6, v2, Ljava/lang/Short;

    .line 323
    .line 324
    if-eqz v6, :cond_11

    .line 325
    .line 326
    check-cast v2, Ljava/lang/Number;

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Number;->shortValue()S

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_7

    .line 336
    .line 337
    :cond_11
    instance-of v6, v2, Landroid/os/Bundle;

    .line 338
    .line 339
    if-eqz v6, :cond_12

    .line 340
    .line 341
    check-cast v2, Landroid/os/Bundle;

    .line 342
    .line 343
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_7

    .line 347
    .line 348
    :cond_12
    instance-of v6, v2, Ljava/lang/CharSequence;

    .line 349
    .line 350
    if-eqz v6, :cond_13

    .line 351
    .line 352
    check-cast v2, Ljava/lang/CharSequence;

    .line 353
    .line 354
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_7

    .line 358
    .line 359
    :cond_13
    instance-of v6, v2, Landroid/os/Parcelable;

    .line 360
    .line 361
    if-eqz v6, :cond_14

    .line 362
    .line 363
    check-cast v2, Landroid/os/Parcelable;

    .line 364
    .line 365
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_7

    .line 369
    .line 370
    :cond_14
    instance-of v6, v2, [Z

    .line 371
    .line 372
    if-eqz v6, :cond_15

    .line 373
    .line 374
    check-cast v2, [Z

    .line 375
    .line 376
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_7

    .line 380
    .line 381
    :cond_15
    instance-of v6, v2, [B

    .line 382
    .line 383
    if-eqz v6, :cond_16

    .line 384
    .line 385
    check-cast v2, [B

    .line 386
    .line 387
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_7

    .line 391
    .line 392
    :cond_16
    instance-of v6, v2, [C

    .line 393
    .line 394
    if-eqz v6, :cond_17

    .line 395
    .line 396
    check-cast v2, [C

    .line 397
    .line 398
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_7

    .line 402
    .line 403
    :cond_17
    instance-of v6, v2, [D

    .line 404
    .line 405
    if-eqz v6, :cond_18

    .line 406
    .line 407
    check-cast v2, [D

    .line 408
    .line 409
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_7

    .line 413
    .line 414
    :cond_18
    instance-of v6, v2, [F

    .line 415
    .line 416
    if-eqz v6, :cond_19

    .line 417
    .line 418
    check-cast v2, [F

    .line 419
    .line 420
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_7

    .line 424
    .line 425
    :cond_19
    instance-of v6, v2, [I

    .line 426
    .line 427
    if-eqz v6, :cond_1a

    .line 428
    .line 429
    check-cast v2, [I

    .line 430
    .line 431
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_7

    .line 435
    .line 436
    :cond_1a
    instance-of v6, v2, [J

    .line 437
    .line 438
    if-eqz v6, :cond_1b

    .line 439
    .line 440
    check-cast v2, [J

    .line 441
    .line 442
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_7

    .line 446
    .line 447
    :cond_1b
    instance-of v6, v2, [S

    .line 448
    .line 449
    if-eqz v6, :cond_1c

    .line 450
    .line 451
    check-cast v2, [S

    .line 452
    .line 453
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_7

    .line 457
    .line 458
    :cond_1c
    instance-of v6, v2, [Ljava/lang/Object;

    .line 459
    .line 460
    const/16 v7, 0x22

    .line 461
    .line 462
    const-string v8, " for key \""

    .line 463
    .line 464
    if-eqz v6, :cond_21

    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    const-class v9, Landroid/os/Parcelable;

    .line 478
    .line 479
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    if-eqz v9, :cond_1d

    .line 484
    .line 485
    check-cast v2, [Landroid/os/Parcelable;

    .line 486
    .line 487
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 488
    .line 489
    .line 490
    goto :goto_7

    .line 491
    :cond_1d
    const-class v9, Ljava/lang/String;

    .line 492
    .line 493
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 494
    .line 495
    .line 496
    move-result v9

    .line 497
    if-eqz v9, :cond_1e

    .line 498
    .line 499
    check-cast v2, [Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_1e
    const-class v9, Ljava/lang/CharSequence;

    .line 506
    .line 507
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    if-eqz v9, :cond_1f

    .line 512
    .line 513
    check-cast v2, [Ljava/lang/CharSequence;

    .line 514
    .line 515
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 516
    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_1f
    const-class v9, Ljava/io/Serializable;

    .line 520
    .line 521
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    if-eqz v9, :cond_20

    .line 526
    .line 527
    check-cast v2, Ljava/io/Serializable;

    .line 528
    .line 529
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 530
    .line 531
    .line 532
    goto :goto_7

    .line 533
    :cond_20
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    const-string v0, "Illegal value array type "

    .line 538
    .line 539
    invoke-static {v7, v0, p0, v8, v5}, Ls80;->b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    return-object v3

    .line 543
    :cond_21
    instance-of v6, v2, Ljava/io/Serializable;

    .line 544
    .line 545
    if-eqz v6, :cond_22

    .line 546
    .line 547
    check-cast v2, Ljava/io/Serializable;

    .line 548
    .line 549
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 550
    .line 551
    .line 552
    goto :goto_7

    .line 553
    :cond_22
    instance-of v6, v2, Landroid/os/IBinder;

    .line 554
    .line 555
    if-eqz v6, :cond_23

    .line 556
    .line 557
    check-cast v2, Landroid/os/IBinder;

    .line 558
    .line 559
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 560
    .line 561
    .line 562
    goto :goto_7

    .line 563
    :cond_23
    instance-of v6, v2, Landroid/util/Size;

    .line 564
    .line 565
    if-eqz v6, :cond_24

    .line 566
    .line 567
    check-cast v2, Landroid/util/Size;

    .line 568
    .line 569
    invoke-static {v0, v5, v2}, Lel;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V

    .line 570
    .line 571
    .line 572
    goto :goto_7

    .line 573
    :cond_24
    instance-of v6, v2, Landroid/util/SizeF;

    .line 574
    .line 575
    if-eqz v6, :cond_25

    .line 576
    .line 577
    check-cast v2, Landroid/util/SizeF;

    .line 578
    .line 579
    invoke-static {v0, v5, v2}, Lel;->b(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V

    .line 580
    .line 581
    .line 582
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 583
    .line 584
    goto/16 :goto_6

    .line 585
    .line 586
    :cond_25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object p0

    .line 594
    const-string v0, "Illegal value type "

    .line 595
    .line 596
    invoke-static {v7, v0, p0, v8, v5}, Ls80;->b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    return-object v3

    .line 600
    :cond_26
    return-object v0
.end method
