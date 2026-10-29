.class public final Lcom/quago/mobile/sdk/i;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/quago/mobile/sdk/j0;

.field public final b:Lcom/quago/mobile/sdk/k;

.field public final c:Lcom/quago/mobile/sdk/k;

.field public final d:Lcom/quago/mobile/sdk/k;

.field public final e:Lcom/quago/mobile/sdk/k;

.field public final f:Lcom/quago/mobile/sdk/k;

.field public final g:Lcom/quago/mobile/sdk/k;

.field public final h:Lcom/quago/mobile/sdk/k;

.field public final i:Lcom/quago/mobile/sdk/k;

.field public final j:Lcom/quago/mobile/sdk/k;

.field public final k:Lcom/quago/mobile/sdk/k;

.field public final l:Lcom/quago/mobile/sdk/k;

.field public final m:Lcom/quago/mobile/sdk/k;

.field public final n:Lcom/quago/mobile/sdk/k;

.field public final o:Lcom/quago/mobile/sdk/k;

.field public final p:Lcom/quago/mobile/sdk/t;

.field public final q:Lcom/quago/mobile/sdk/QuagoSettings;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/e;Lcom/quago/mobile/sdk/t;Lcom/quago/mobile/sdk/QuagoSettings;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "DataManager"

    .line 5
    .line 6
    invoke-static {v0}, Lcom/quago/mobile/sdk/k0;->a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->p:Lcom/quago/mobile/sdk/t;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/quago/mobile/sdk/i;->q:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 15
    .line 16
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 17
    .line 18
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->LIFECYCLE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 19
    .line 20
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    const/16 v2, 0x64

    .line 27
    .line 28
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const-string v3, "LifeCycle"

    .line 33
    .line 34
    const-class v4, Lcom/quago/mobile/sdk/w;

    .line 35
    .line 36
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    .line 40
    .line 41
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 42
    .line 43
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->RESOLUTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 44
    .line 45
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    mul-int/2addr v0, v1

    .line 50
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const-string v3, "Resolution"

    .line 55
    .line 56
    const-class v4, Lcom/quago/mobile/sdk/g1;

    .line 57
    .line 58
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    .line 62
    .line 63
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 64
    .line 65
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 66
    .line 67
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->MOTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 68
    .line 69
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    mul-int/2addr v0, v1

    .line 74
    const/16 v3, 0x4e20

    .line 75
    .line 76
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const-string v3, "Motion"

    .line 81
    .line 82
    const-class v4, Lcom/quago/mobile/sdk/x;

    .line 83
    .line 84
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    .line 88
    .line 89
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 90
    .line 91
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->KEYS:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 92
    .line 93
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    mul-int/2addr v0, v1

    .line 98
    const/16 v3, 0x2710

    .line 99
    .line 100
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const-string v3, "Keys"

    .line 105
    .line 106
    const-class v4, Lcom/quago/mobile/sdk/v;

    .line 107
    .line 108
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 109
    .line 110
    .line 111
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    .line 112
    .line 113
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 114
    .line 115
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 116
    .line 117
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    mul-int/2addr v0, v1

    .line 122
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    const-string v3, "BatteryChange"

    .line 127
    .line 128
    const-class v4, Lcom/quago/mobile/sdk/p;

    .line 129
    .line 130
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 131
    .line 132
    .line 133
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->m:Lcom/quago/mobile/sdk/k;

    .line 134
    .line 135
    if-eqz p1, :cond_a

    .line 136
    .line 137
    iget-object p2, p1, Lcom/quago/mobile/sdk/e;->d:Ljava/util/List;

    .line 138
    .line 139
    if-eqz p2, :cond_a

    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-eqz p2, :cond_0

    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_0
    iget-object p1, p1, Lcom/quago/mobile/sdk/e;->d:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-eqz p2, :cond_a

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    check-cast p2, Landroid/hardware/Sensor;

    .line 166
    .line 167
    invoke-virtual {p2}, Landroid/hardware/Sensor;->getType()I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    const/4 v0, 0x1

    .line 172
    const-class v3, Lcom/quago/mobile/sdk/o;

    .line 173
    .line 174
    if-eq p2, v0, :cond_9

    .line 175
    .line 176
    if-eq p2, v1, :cond_8

    .line 177
    .line 178
    const/16 v0, 0x8

    .line 179
    .line 180
    if-eq p2, v0, :cond_7

    .line 181
    .line 182
    const/16 v0, 0xd

    .line 183
    .line 184
    if-eq p2, v0, :cond_6

    .line 185
    .line 186
    const/16 v0, 0x12

    .line 187
    .line 188
    if-eq p2, v0, :cond_5

    .line 189
    .line 190
    const/16 v0, 0x14

    .line 191
    .line 192
    if-eq p2, v0, :cond_4

    .line 193
    .line 194
    const/4 v0, 0x4

    .line 195
    if-eq p2, v0, :cond_3

    .line 196
    .line 197
    const/4 v0, 0x5

    .line 198
    if-eq p2, v0, :cond_2

    .line 199
    .line 200
    const/4 v0, 0x6

    .line 201
    if-eq p2, v0, :cond_1

    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_1
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 205
    .line 206
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 207
    .line 208
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 209
    .line 210
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    mul-int/2addr v0, v1

    .line 215
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    const-string v3, "Pressure"

    .line 220
    .line 221
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 222
    .line 223
    .line 224
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->k:Lcom/quago/mobile/sdk/k;

    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_2
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 228
    .line 229
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 230
    .line 231
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 232
    .line 233
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    mul-int/2addr v0, v1

    .line 238
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    const-string v3, "Light"

    .line 243
    .line 244
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 245
    .line 246
    .line 247
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->j:Lcom/quago/mobile/sdk/k;

    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_3
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 251
    .line 252
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 253
    .line 254
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 255
    .line 256
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    mul-int/2addr v0, v1

    .line 261
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    const-string v5, "Gyroscope"

    .line 266
    .line 267
    invoke-direct {p2, v5, v3, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 268
    .line 269
    .line 270
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->g:Lcom/quago/mobile/sdk/k;

    .line 271
    .line 272
    goto :goto_0

    .line 273
    :cond_4
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 274
    .line 275
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 276
    .line 277
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 278
    .line 279
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    mul-int/2addr v0, v1

    .line 284
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    const-string v5, "GeomagneticRotationVector"

    .line 289
    .line 290
    invoke-direct {p2, v5, v3, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 291
    .line 292
    .line 293
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->h:Lcom/quago/mobile/sdk/k;

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_5
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 298
    .line 299
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 300
    .line 301
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 302
    .line 303
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    mul-int/2addr v0, v1

    .line 308
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    const-string v3, "StepDetector"

    .line 313
    .line 314
    const-class v5, Lcom/quago/mobile/sdk/k1;

    .line 315
    .line 316
    invoke-direct {p2, v3, v5, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 317
    .line 318
    .line 319
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->n:Lcom/quago/mobile/sdk/k;

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_6
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 324
    .line 325
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 326
    .line 327
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 328
    .line 329
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    mul-int/2addr v0, v1

    .line 334
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    const-string v3, "AmbientTemperature"

    .line 339
    .line 340
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 341
    .line 342
    .line 343
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->l:Lcom/quago/mobile/sdk/k;

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_7
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 348
    .line 349
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 350
    .line 351
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 352
    .line 353
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    mul-int/2addr v0, v1

    .line 358
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    const-string v3, "Proximity"

    .line 363
    .line 364
    invoke-direct {p2, v3, v4, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 365
    .line 366
    .line 367
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->i:Lcom/quago/mobile/sdk/k;

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :cond_8
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 372
    .line 373
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 374
    .line 375
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 376
    .line 377
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    mul-int/2addr v0, v1

    .line 382
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    const-string v5, "MagneticField"

    .line 387
    .line 388
    invoke-direct {p2, v5, v3, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 389
    .line 390
    .line 391
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->f:Lcom/quago/mobile/sdk/k;

    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :cond_9
    new-instance p2, Lcom/quago/mobile/sdk/k;

    .line 396
    .line 397
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 398
    .line 399
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 400
    .line 401
    invoke-virtual {p3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    mul-int/2addr v0, v1

    .line 406
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    const-string v5, "Accelerometer"

    .line 411
    .line 412
    invoke-direct {p2, v5, v3, v0}, Lcom/quago/mobile/sdk/k;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 413
    .line 414
    .line 415
    iput-object p2, p0, Lcom/quago/mobile/sdk/i;->e:Lcom/quago/mobile/sdk/k;

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_a
    :goto_1
    return-void
.end method


# virtual methods
.method public final a(Lcom/quago/mobile/sdk/a1;JJ)Lcom/quago/mobile/sdk/l;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v9, v1, Lcom/quago/mobile/sdk/i;->q:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 6
    .line 7
    sget-object v2, Lcom/quago/mobile/sdk/f1;->a:Lcom/quago/mobile/sdk/j0;

    .line 8
    .line 9
    new-instance v10, Lcom/quago/mobile/sdk/l;

    .line 10
    .line 11
    invoke-direct {v10}, Lcom/quago/mobile/sdk/l;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->C:Ljava/util/LinkedList;

    .line 20
    .line 21
    new-instance v2, Ljava/util/LinkedList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 27
    .line 28
    new-instance v2, Ljava/util/LinkedList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->E:Ljava/util/LinkedList;

    .line 34
    .line 35
    new-instance v2, Ljava/util/LinkedList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->F:Ljava/util/LinkedList;

    .line 41
    .line 42
    new-instance v2, Ljava/util/LinkedList;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->G:Ljava/util/LinkedList;

    .line 48
    .line 49
    new-instance v2, Ljava/util/LinkedList;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->H:Ljava/util/LinkedList;

    .line 55
    .line 56
    new-instance v2, Ljava/util/LinkedList;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->I:Ljava/util/LinkedList;

    .line 62
    .line 63
    new-instance v2, Ljava/util/LinkedList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->J:Ljava/util/LinkedList;

    .line 69
    .line 70
    new-instance v2, Ljava/util/LinkedList;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->K:Ljava/util/LinkedList;

    .line 76
    .line 77
    new-instance v2, Ljava/util/LinkedList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->L:Ljava/util/LinkedList;

    .line 83
    .line 84
    new-instance v2, Ljava/util/LinkedList;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->M:Ljava/util/LinkedList;

    .line 90
    .line 91
    new-instance v2, Ljava/util/LinkedList;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->N:Ljava/util/LinkedList;

    .line 97
    .line 98
    new-instance v2, Ljava/util/LinkedList;

    .line 99
    .line 100
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->O:Ljava/util/LinkedList;

    .line 104
    .line 105
    new-instance v2, Ljava/util/LinkedList;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v2, v10, Lcom/quago/mobile/sdk/l;->P:Ljava/util/LinkedList;

    .line 111
    .line 112
    iget-object v2, v1, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    .line 113
    .line 114
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->MOTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 115
    .line 116
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    new-instance v14, Ljava/util/LinkedList;

    .line 121
    .line 122
    invoke-direct {v14}, Ljava/util/LinkedList;-><init>()V

    .line 123
    .line 124
    .line 125
    iget v4, v2, Lcom/quago/mobile/sdk/k;->c:I

    .line 126
    .line 127
    const/4 v5, -0x1

    .line 128
    const/4 v7, 0x1

    .line 129
    if-ne v4, v5, :cond_0

    .line 130
    .line 131
    move/from16 v27, v7

    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_0
    iget-object v5, v2, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v5, [Lcom/quago/mobile/sdk/x;

    .line 138
    .line 139
    array-length v5, v5

    .line 140
    new-instance v8, Lcom/quago/mobile/sdk/x;

    .line 141
    .line 142
    invoke-direct {v8}, Lcom/quago/mobile/sdk/x;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v17, Ljava/util/HashMap;

    .line 146
    .line 147
    invoke-direct/range {v17 .. v17}, Ljava/util/HashMap;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v18, Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-direct/range {v18 .. v18}, Ljava/util/HashMap;-><init>()V

    .line 153
    .line 154
    .line 155
    new-instance v19, Ljava/util/HashMap;

    .line 156
    .line 157
    invoke-direct/range {v19 .. v19}, Ljava/util/HashMap;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v20, Ljava/util/HashMap;

    .line 161
    .line 162
    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v12, Ljava/util/HashMap;

    .line 166
    .line 167
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    new-instance v11, Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 173
    .line 174
    .line 175
    new-instance v21, Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-direct/range {v21 .. v21}, Ljava/util/HashMap;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v22, Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-direct/range {v22 .. v22}, Ljava/util/HashMap;-><init>()V

    .line 183
    .line 184
    .line 185
    new-instance v23, Ljava/util/HashMap;

    .line 186
    .line 187
    invoke-direct/range {v23 .. v23}, Ljava/util/HashMap;-><init>()V

    .line 188
    .line 189
    .line 190
    new-instance v24, Ljava/util/HashMap;

    .line 191
    .line 192
    invoke-direct/range {v24 .. v24}, Ljava/util/HashMap;-><init>()V

    .line 193
    .line 194
    .line 195
    const/4 v15, 0x0

    .line 196
    :goto_0
    if-lez v5, :cond_1

    .line 197
    .line 198
    iget-object v13, v2, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v13, [Lcom/quago/mobile/sdk/x;

    .line 201
    .line 202
    aget-object v13, v13, v4

    .line 203
    .line 204
    monitor-enter v13

    .line 205
    :try_start_0
    iget-object v6, v2, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v6, [Lcom/quago/mobile/sdk/x;

    .line 208
    .line 209
    aget-object v6, v6, v4

    .line 210
    .line 211
    invoke-virtual {v6, v8}, Lcom/quago/mobile/sdk/x;->a(Lcom/quago/mobile/sdk/j;)V

    .line 212
    .line 213
    .line 214
    monitor-exit v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    iget v6, v8, Lcom/quago/mobile/sdk/x;->h:I

    .line 216
    .line 217
    if-nez v6, :cond_2

    .line 218
    .line 219
    :cond_1
    move/from16 v27, v7

    .line 220
    .line 221
    goto/16 :goto_7

    .line 222
    .line 223
    :cond_2
    move v6, v4

    .line 224
    move/from16 v25, v5

    .line 225
    .line 226
    iget-wide v4, v8, Lcom/quago/mobile/sdk/j;->a:J

    .line 227
    .line 228
    cmp-long v13, v4, p2

    .line 229
    .line 230
    if-ltz v13, :cond_3

    .line 231
    .line 232
    cmp-long v4, v4, p4

    .line 233
    .line 234
    if-gtz v4, :cond_3

    .line 235
    .line 236
    if-eqz v3, :cond_4

    .line 237
    .line 238
    if-ge v15, v3, :cond_3

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_3
    move/from16 v26, v3

    .line 242
    .line 243
    move/from16 v27, v7

    .line 244
    .line 245
    move-object v7, v11

    .line 246
    move-object v5, v12

    .line 247
    move-object/from16 v12, v19

    .line 248
    .line 249
    move-object/from16 v11, v20

    .line 250
    .line 251
    goto/16 :goto_6

    .line 252
    .line 253
    :cond_4
    :goto_1
    new-instance v13, Lcom/quago/mobile/sdk/x;

    .line 254
    .line 255
    invoke-direct {v13}, Lcom/quago/mobile/sdk/x;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8, v13}, Lcom/quago/mobile/sdk/x;->a(Lcom/quago/mobile/sdk/j;)V

    .line 259
    .line 260
    .line 261
    iget v4, v8, Lcom/quago/mobile/sdk/x;->h:I

    .line 262
    .line 263
    sget-object v5, Lcom/quago/mobile/sdk/f;->e:Ljava/util/Map;

    .line 264
    .line 265
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Lcom/quago/mobile/sdk/f;

    .line 274
    .line 275
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    move/from16 v26, v3

    .line 280
    .line 281
    const/4 v3, 0x4

    .line 282
    if-eqz v5, :cond_9

    .line 283
    .line 284
    if-eq v5, v7, :cond_8

    .line 285
    .line 286
    move/from16 v27, v7

    .line 287
    .line 288
    const/4 v7, 0x2

    .line 289
    if-eq v5, v7, :cond_7

    .line 290
    .line 291
    const/4 v7, 0x3

    .line 292
    if-eq v5, v7, :cond_6

    .line 293
    .line 294
    if-eq v5, v3, :cond_5

    .line 295
    .line 296
    :goto_2
    move-object v7, v11

    .line 297
    move-object v5, v12

    .line 298
    :goto_3
    move-object/from16 v12, v19

    .line 299
    .line 300
    move-object/from16 v11, v20

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_5
    const/16 v16, 0x0

    .line 304
    .line 305
    invoke-static/range {v11 .. v16}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/quago/mobile/sdk/x;Ljava/util/LinkedList;IZ)I

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    goto :goto_2

    .line 310
    :cond_6
    move-object v7, v11

    .line 311
    move-object v5, v12

    .line 312
    const/16 v16, 0x0

    .line 313
    .line 314
    move-object/from16 v12, v23

    .line 315
    .line 316
    move-object/from16 v11, v24

    .line 317
    .line 318
    invoke-static/range {v11 .. v16}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/quago/mobile/sdk/x;Ljava/util/LinkedList;IZ)I

    .line 319
    .line 320
    .line 321
    move-result v15

    .line 322
    goto :goto_3

    .line 323
    :cond_7
    move-object v7, v11

    .line 324
    move-object v5, v12

    .line 325
    const/16 v16, 0x1

    .line 326
    .line 327
    move-object/from16 v12, v17

    .line 328
    .line 329
    move-object/from16 v11, v18

    .line 330
    .line 331
    invoke-static/range {v11 .. v16}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/quago/mobile/sdk/x;Ljava/util/LinkedList;IZ)I

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    goto :goto_3

    .line 336
    :cond_8
    move/from16 v27, v7

    .line 337
    .line 338
    move-object v7, v11

    .line 339
    move-object v5, v12

    .line 340
    const/16 v16, 0x0

    .line 341
    .line 342
    move-object/from16 v12, v21

    .line 343
    .line 344
    move-object/from16 v11, v22

    .line 345
    .line 346
    invoke-static/range {v11 .. v16}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/quago/mobile/sdk/x;Ljava/util/LinkedList;IZ)I

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    goto :goto_3

    .line 351
    :cond_9
    move/from16 v27, v7

    .line 352
    .line 353
    move-object v7, v11

    .line 354
    move-object v5, v12

    .line 355
    const/16 v16, 0x0

    .line 356
    .line 357
    move-object/from16 v12, v19

    .line 358
    .line 359
    move-object/from16 v11, v20

    .line 360
    .line 361
    invoke-static/range {v11 .. v16}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/quago/mobile/sdk/x;Ljava/util/LinkedList;IZ)I

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    :goto_4
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_a

    .line 370
    .line 371
    if-eq v4, v3, :cond_a

    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_a
    invoke-virtual/range {v18 .. v18}, Ljava/util/HashMap;->clear()V

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v17 .. v17}, Ljava/util/HashMap;->clear()V

    .line 378
    .line 379
    .line 380
    :goto_5
    invoke-virtual {v14, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    add-int/lit8 v15, v15, 0x1

    .line 384
    .line 385
    :goto_6
    add-int/lit8 v4, v6, -0x1

    .line 386
    .line 387
    if-gez v4, :cond_b

    .line 388
    .line 389
    iget-object v3, v2, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v3, [Lcom/quago/mobile/sdk/x;

    .line 392
    .line 393
    array-length v3, v3

    .line 394
    add-int/lit8 v3, v3, -0x1

    .line 395
    .line 396
    move v4, v3

    .line 397
    :cond_b
    add-int/lit8 v3, v25, -0x1

    .line 398
    .line 399
    move-object/from16 v20, v11

    .line 400
    .line 401
    move-object/from16 v19, v12

    .line 402
    .line 403
    move-object v12, v5

    .line 404
    move-object v11, v7

    .line 405
    move/from16 v7, v27

    .line 406
    .line 407
    move v5, v3

    .line 408
    move/from16 v3, v26

    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    :catchall_0
    move-exception v0

    .line 413
    :try_start_1
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 414
    throw v0

    .line 415
    :goto_7
    const/4 v2, 0x0

    .line 416
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-interface {v14, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 421
    .line 422
    .line 423
    :goto_8
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_c

    .line 428
    .line 429
    move-wide/from16 v16, p2

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_c
    invoke-virtual {v14}, Ljava/util/LinkedList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    add-int/lit8 v2, v2, -0x1

    .line 437
    .line 438
    invoke-virtual {v14, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    check-cast v2, Lcom/quago/mobile/sdk/x;

    .line 443
    .line 444
    iget-wide v2, v2, Lcom/quago/mobile/sdk/j;->a:J

    .line 445
    .line 446
    move-wide/from16 v16, v2

    .line 447
    .line 448
    :goto_9
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-eqz v2, :cond_d

    .line 453
    .line 454
    move-wide/from16 v6, p4

    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_d
    const/4 v2, 0x0

    .line 458
    invoke-virtual {v14, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    check-cast v2, Lcom/quago/mobile/sdk/x;

    .line 463
    .line 464
    iget-wide v2, v2, Lcom/quago/mobile/sdk/j;->a:J

    .line 465
    .line 466
    move-wide v6, v2

    .line 467
    :goto_a
    iget-object v15, v1, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    .line 468
    .line 469
    sget-object v2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->KEYS:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 470
    .line 471
    invoke-virtual {v9, v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 472
    .line 473
    .line 474
    move-result v20

    .line 475
    move-wide/from16 v18, p4

    .line 476
    .line 477
    invoke-static/range {v15 .. v20}, Lcom/quago/mobile/sdk/f1;->b(Lcom/quago/mobile/sdk/k;JJI)Ljava/util/LinkedList;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    :try_start_2
    iget-object v3, v1, Lcom/quago/mobile/sdk/i;->p:Lcom/quago/mobile/sdk/t;

    .line 482
    .line 483
    if-eqz v3, :cond_16

    .line 484
    .line 485
    new-instance v3, Ljava/util/HashMap;

    .line 486
    .line 487
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 488
    .line 489
    .line 490
    new-instance v4, Ljava/util/HashMap;

    .line 491
    .line 492
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v8

    .line 503
    if-eqz v8, :cond_f

    .line 504
    .line 505
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v8

    .line 509
    check-cast v8, Lcom/quago/mobile/sdk/x;

    .line 510
    .line 511
    iget v11, v8, Lcom/quago/mobile/sdk/x;->l:I

    .line 512
    .line 513
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    invoke-virtual {v3, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    check-cast v11, Lcom/quago/mobile/sdk/u;

    .line 522
    .line 523
    if-nez v11, :cond_e

    .line 524
    .line 525
    new-instance v11, Lcom/quago/mobile/sdk/u;

    .line 526
    .line 527
    invoke-direct {v11, v8}, Lcom/quago/mobile/sdk/u;-><init>(Lcom/quago/mobile/sdk/x;)V

    .line 528
    .line 529
    .line 530
    iget v8, v8, Lcom/quago/mobile/sdk/x;->l:I

    .line 531
    .line 532
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    invoke-virtual {v3, v8, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    goto :goto_c

    .line 540
    :catch_0
    move-exception v0

    .line 541
    goto/16 :goto_10

    .line 542
    .line 543
    :cond_e
    :goto_c
    iget v8, v11, Lcom/quago/mobile/sdk/u;->c:I

    .line 544
    .line 545
    add-int/lit8 v8, v8, 0x1

    .line 546
    .line 547
    iput v8, v11, Lcom/quago/mobile/sdk/u;->c:I

    .line 548
    .line 549
    goto :goto_b

    .line 550
    :cond_f
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v8

    .line 558
    if-eqz v8, :cond_11

    .line 559
    .line 560
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v8

    .line 564
    check-cast v8, Lcom/quago/mobile/sdk/v;

    .line 565
    .line 566
    iget v11, v8, Lcom/quago/mobile/sdk/v;->e:I

    .line 567
    .line 568
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object v11

    .line 572
    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v11

    .line 576
    check-cast v11, Lcom/quago/mobile/sdk/s;

    .line 577
    .line 578
    if-nez v11, :cond_10

    .line 579
    .line 580
    new-instance v11, Lcom/quago/mobile/sdk/s;

    .line 581
    .line 582
    invoke-direct {v11, v8}, Lcom/quago/mobile/sdk/s;-><init>(Lcom/quago/mobile/sdk/v;)V

    .line 583
    .line 584
    .line 585
    iget v8, v8, Lcom/quago/mobile/sdk/v;->e:I

    .line 586
    .line 587
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object v8

    .line 591
    invoke-virtual {v4, v8, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    :cond_10
    iget v8, v11, Lcom/quago/mobile/sdk/s;->b:I

    .line 595
    .line 596
    add-int/lit8 v8, v8, 0x1

    .line 597
    .line 598
    iput v8, v11, Lcom/quago/mobile/sdk/s;->b:I

    .line 599
    .line 600
    goto :goto_d

    .line 601
    :cond_11
    new-instance v5, Ljava/util/LinkedList;

    .line 602
    .line 603
    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 604
    .line 605
    .line 606
    new-instance v8, Ljava/util/LinkedList;

    .line 607
    .line 608
    invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V

    .line 609
    .line 610
    .line 611
    new-instance v11, Ljava/util/LinkedList;

    .line 612
    .line 613
    invoke-direct {v11}, Ljava/util/LinkedList;-><init>()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v12

    .line 628
    if-eqz v12, :cond_13

    .line 629
    .line 630
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v12

    .line 634
    check-cast v12, Ljava/util/Map$Entry;

    .line 635
    .line 636
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v13

    .line 640
    check-cast v13, Ljava/lang/Integer;

    .line 641
    .line 642
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v15

    .line 646
    move-object/from16 v18, v3

    .line 647
    .line 648
    iget-object v3, v1, Lcom/quago/mobile/sdk/i;->p:Lcom/quago/mobile/sdk/t;

    .line 649
    .line 650
    invoke-virtual {v3, v15}, Lcom/quago/mobile/sdk/t;->a(I)Lcom/quago/mobile/sdk/i0;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    if-eqz v3, :cond_12

    .line 655
    .line 656
    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    :cond_12
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    check-cast v3, Lcom/quago/mobile/sdk/u;

    .line 664
    .line 665
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    iget v12, v3, Lcom/quago/mobile/sdk/u;->a:I

    .line 669
    .line 670
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 671
    .line 672
    .line 673
    move-result-object v12

    .line 674
    iget v15, v3, Lcom/quago/mobile/sdk/u;->b:I

    .line 675
    .line 676
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 677
    .line 678
    .line 679
    move-result-object v15

    .line 680
    iget v3, v3, Lcom/quago/mobile/sdk/u;->c:I

    .line 681
    .line 682
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    filled-new-array {v13, v12, v15, v3}, [Ljava/lang/Integer;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    invoke-virtual {v8, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-object/from16 v3, v18

    .line 694
    .line 695
    goto :goto_e

    .line 696
    :cond_13
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 701
    .line 702
    .line 703
    move-result-object v3

    .line 704
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    if-eqz v4, :cond_15

    .line 709
    .line 710
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    check-cast v4, Ljava/util/Map$Entry;

    .line 715
    .line 716
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v12

    .line 720
    check-cast v12, Ljava/lang/Integer;

    .line 721
    .line 722
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 723
    .line 724
    .line 725
    move-result v13

    .line 726
    iget-object v15, v1, Lcom/quago/mobile/sdk/i;->p:Lcom/quago/mobile/sdk/t;

    .line 727
    .line 728
    invoke-virtual {v15, v13}, Lcom/quago/mobile/sdk/t;->a(I)Lcom/quago/mobile/sdk/i0;

    .line 729
    .line 730
    .line 731
    move-result-object v13

    .line 732
    if-eqz v13, :cond_14

    .line 733
    .line 734
    invoke-virtual {v5, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    :cond_14
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    check-cast v4, Lcom/quago/mobile/sdk/s;

    .line 742
    .line 743
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    iget v13, v4, Lcom/quago/mobile/sdk/s;->a:I

    .line 747
    .line 748
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 749
    .line 750
    .line 751
    move-result-object v13

    .line 752
    iget v4, v4, Lcom/quago/mobile/sdk/s;->b:I

    .line 753
    .line 754
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    filled-new-array {v12, v13, v4}, [Ljava/lang/Integer;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    invoke-virtual {v11, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    goto :goto_f

    .line 766
    :cond_15
    iget-object v0, v0, Lcom/quago/mobile/sdk/a1;->h:Lcom/quago/mobile/sdk/p0;

    .line 767
    .line 768
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    new-instance v3, Lcom/quago/mobile/sdk/p0;

    .line 772
    .line 773
    invoke-direct {v3, v0, v5, v8, v11}, Lcom/quago/mobile/sdk/p0;-><init>(Lcom/quago/mobile/sdk/p0;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;)V

    .line 774
    .line 775
    .line 776
    iput-object v3, v10, Lcom/quago/mobile/sdk/l;->s:Lcom/quago/mobile/sdk/p0;

    .line 777
    .line 778
    goto :goto_11

    .line 779
    :cond_16
    if-eqz v0, :cond_17

    .line 780
    .line 781
    iget-object v0, v0, Lcom/quago/mobile/sdk/a1;->h:Lcom/quago/mobile/sdk/p0;

    .line 782
    .line 783
    iput-object v0, v10, Lcom/quago/mobile/sdk/l;->s:Lcom/quago/mobile/sdk/p0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 784
    .line 785
    goto :goto_11

    .line 786
    :goto_10
    sget-object v3, Lcom/quago/mobile/sdk/f1;->a:Lcom/quago/mobile/sdk/j0;

    .line 787
    .line 788
    const-string v4, "queryDataSegment-input_devices"

    .line 789
    .line 790
    invoke-virtual {v3, v4, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 791
    .line 792
    .line 793
    :cond_17
    :goto_11
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 794
    .line 795
    invoke-static {v14, v0}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/LinkedList;Ljava/util/List;)V

    .line 796
    .line 797
    .line 798
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->E:Ljava/util/LinkedList;

    .line 799
    .line 800
    invoke-static {v2, v0}, Lcom/quago/mobile/sdk/f1;->a(Ljava/util/LinkedList;Ljava/util/List;)V

    .line 801
    .line 802
    .line 803
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 804
    .line 805
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    if-eqz v0, :cond_18

    .line 810
    .line 811
    move-wide/from16 v20, p2

    .line 812
    .line 813
    move-wide/from16 v22, p4

    .line 814
    .line 815
    goto :goto_12

    .line 816
    :cond_18
    move-wide/from16 v22, v6

    .line 817
    .line 818
    move-wide/from16 v20, v16

    .line 819
    .line 820
    :goto_12
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->e:Lcom/quago/mobile/sdk/k;

    .line 821
    .line 822
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->F:Ljava/util/LinkedList;

    .line 823
    .line 824
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 825
    .line 826
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 827
    .line 828
    .line 829
    move-result v24

    .line 830
    move-object/from16 v18, v0

    .line 831
    .line 832
    move-object/from16 v19, v2

    .line 833
    .line 834
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 835
    .line 836
    .line 837
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 838
    .line 839
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_19

    .line 844
    .line 845
    move-wide/from16 v20, p2

    .line 846
    .line 847
    move-wide/from16 v22, p4

    .line 848
    .line 849
    goto :goto_13

    .line 850
    :cond_19
    move-wide/from16 v22, v6

    .line 851
    .line 852
    move-wide/from16 v20, v16

    .line 853
    .line 854
    :goto_13
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->f:Lcom/quago/mobile/sdk/k;

    .line 855
    .line 856
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->G:Ljava/util/LinkedList;

    .line 857
    .line 858
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 859
    .line 860
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 861
    .line 862
    .line 863
    move-result v24

    .line 864
    move-object/from16 v18, v0

    .line 865
    .line 866
    move-object/from16 v19, v2

    .line 867
    .line 868
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 869
    .line 870
    .line 871
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 872
    .line 873
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    if-eqz v0, :cond_1a

    .line 878
    .line 879
    move-wide/from16 v20, p2

    .line 880
    .line 881
    move-wide/from16 v22, p4

    .line 882
    .line 883
    goto :goto_14

    .line 884
    :cond_1a
    move-wide/from16 v22, v6

    .line 885
    .line 886
    move-wide/from16 v20, v16

    .line 887
    .line 888
    :goto_14
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->g:Lcom/quago/mobile/sdk/k;

    .line 889
    .line 890
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->H:Ljava/util/LinkedList;

    .line 891
    .line 892
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 893
    .line 894
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 895
    .line 896
    .line 897
    move-result v24

    .line 898
    move-object/from16 v18, v0

    .line 899
    .line 900
    move-object/from16 v19, v2

    .line 901
    .line 902
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 903
    .line 904
    .line 905
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 906
    .line 907
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-eqz v0, :cond_1b

    .line 912
    .line 913
    move-wide/from16 v20, p2

    .line 914
    .line 915
    move-wide/from16 v22, p4

    .line 916
    .line 917
    goto :goto_15

    .line 918
    :cond_1b
    move-wide/from16 v22, v6

    .line 919
    .line 920
    move-wide/from16 v20, v16

    .line 921
    .line 922
    :goto_15
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->h:Lcom/quago/mobile/sdk/k;

    .line 923
    .line 924
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->I:Ljava/util/LinkedList;

    .line 925
    .line 926
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 927
    .line 928
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 929
    .line 930
    .line 931
    move-result v24

    .line 932
    move-object/from16 v18, v0

    .line 933
    .line 934
    move-object/from16 v19, v2

    .line 935
    .line 936
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 937
    .line 938
    .line 939
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 940
    .line 941
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 942
    .line 943
    .line 944
    move-result v0

    .line 945
    if-eqz v0, :cond_1c

    .line 946
    .line 947
    move-wide/from16 v20, p2

    .line 948
    .line 949
    move-wide/from16 v22, p4

    .line 950
    .line 951
    goto :goto_16

    .line 952
    :cond_1c
    move-wide/from16 v22, v6

    .line 953
    .line 954
    move-wide/from16 v20, v16

    .line 955
    .line 956
    :goto_16
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->i:Lcom/quago/mobile/sdk/k;

    .line 957
    .line 958
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->J:Ljava/util/LinkedList;

    .line 959
    .line 960
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 961
    .line 962
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 963
    .line 964
    .line 965
    move-result v24

    .line 966
    move-object/from16 v18, v0

    .line 967
    .line 968
    move-object/from16 v19, v2

    .line 969
    .line 970
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 971
    .line 972
    .line 973
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 974
    .line 975
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    if-eqz v0, :cond_1d

    .line 980
    .line 981
    move-wide/from16 v20, p2

    .line 982
    .line 983
    move-wide/from16 v22, p4

    .line 984
    .line 985
    goto :goto_17

    .line 986
    :cond_1d
    move-wide/from16 v22, v6

    .line 987
    .line 988
    move-wide/from16 v20, v16

    .line 989
    .line 990
    :goto_17
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->j:Lcom/quago/mobile/sdk/k;

    .line 991
    .line 992
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->K:Ljava/util/LinkedList;

    .line 993
    .line 994
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 995
    .line 996
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 997
    .line 998
    .line 999
    move-result v24

    .line 1000
    move-object/from16 v18, v0

    .line 1001
    .line 1002
    move-object/from16 v19, v2

    .line 1003
    .line 1004
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 1008
    .line 1009
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v0

    .line 1013
    if-eqz v0, :cond_1e

    .line 1014
    .line 1015
    move-wide/from16 v20, p2

    .line 1016
    .line 1017
    move-wide/from16 v22, p4

    .line 1018
    .line 1019
    goto :goto_18

    .line 1020
    :cond_1e
    move-wide/from16 v22, v6

    .line 1021
    .line 1022
    move-wide/from16 v20, v16

    .line 1023
    .line 1024
    :goto_18
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->k:Lcom/quago/mobile/sdk/k;

    .line 1025
    .line 1026
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->L:Ljava/util/LinkedList;

    .line 1027
    .line 1028
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 1029
    .line 1030
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 1031
    .line 1032
    .line 1033
    move-result v24

    .line 1034
    move-object/from16 v18, v0

    .line 1035
    .line 1036
    move-object/from16 v19, v2

    .line 1037
    .line 1038
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1039
    .line 1040
    .line 1041
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 1042
    .line 1043
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v0

    .line 1047
    if-eqz v0, :cond_1f

    .line 1048
    .line 1049
    move-wide/from16 v20, p2

    .line 1050
    .line 1051
    move-wide/from16 v22, p4

    .line 1052
    .line 1053
    goto :goto_19

    .line 1054
    :cond_1f
    move-wide/from16 v22, v6

    .line 1055
    .line 1056
    move-wide/from16 v20, v16

    .line 1057
    .line 1058
    :goto_19
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->l:Lcom/quago/mobile/sdk/k;

    .line 1059
    .line 1060
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->M:Ljava/util/LinkedList;

    .line 1061
    .line 1062
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 1063
    .line 1064
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 1065
    .line 1066
    .line 1067
    move-result v24

    .line 1068
    move-object/from16 v18, v0

    .line 1069
    .line 1070
    move-object/from16 v19, v2

    .line 1071
    .line 1072
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1073
    .line 1074
    .line 1075
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 1076
    .line 1077
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_20

    .line 1082
    .line 1083
    move-wide/from16 v20, p2

    .line 1084
    .line 1085
    move-wide/from16 v22, p4

    .line 1086
    .line 1087
    goto :goto_1a

    .line 1088
    :cond_20
    move-wide/from16 v22, v6

    .line 1089
    .line 1090
    move-wide/from16 v20, v16

    .line 1091
    .line 1092
    :goto_1a
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->n:Lcom/quago/mobile/sdk/k;

    .line 1093
    .line 1094
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->N:Ljava/util/LinkedList;

    .line 1095
    .line 1096
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 1097
    .line 1098
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 1099
    .line 1100
    .line 1101
    move-result v24

    .line 1102
    move-object/from16 v18, v0

    .line 1103
    .line 1104
    move-object/from16 v19, v2

    .line 1105
    .line 1106
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1107
    .line 1108
    .line 1109
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 1110
    .line 1111
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    if-eqz v0, :cond_21

    .line 1116
    .line 1117
    move-wide/from16 v20, p2

    .line 1118
    .line 1119
    move-wide/from16 v22, p4

    .line 1120
    .line 1121
    goto :goto_1b

    .line 1122
    :cond_21
    move-wide/from16 v22, v6

    .line 1123
    .line 1124
    move-wide/from16 v20, v16

    .line 1125
    .line 1126
    :goto_1b
    iget-object v0, v1, Lcom/quago/mobile/sdk/i;->m:Lcom/quago/mobile/sdk/k;

    .line 1127
    .line 1128
    iget-object v2, v10, Lcom/quago/mobile/sdk/l;->P:Ljava/util/LinkedList;

    .line 1129
    .line 1130
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 1131
    .line 1132
    invoke-virtual {v9, v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 1133
    .line 1134
    .line 1135
    move-result v24

    .line 1136
    move-object/from16 v18, v0

    .line 1137
    .line 1138
    move-object/from16 v19, v2

    .line 1139
    .line 1140
    invoke-static/range {v18 .. v24}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1141
    .line 1142
    .line 1143
    iget-object v2, v1, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    .line 1144
    .line 1145
    iget-object v3, v10, Lcom/quago/mobile/sdk/l;->O:Ljava/util/LinkedList;

    .line 1146
    .line 1147
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->RESOLUTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 1148
    .line 1149
    invoke-virtual {v9, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 1150
    .line 1151
    .line 1152
    move-result v8

    .line 1153
    move-wide/from16 v4, p2

    .line 1154
    .line 1155
    invoke-static/range {v2 .. v8}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1156
    .line 1157
    .line 1158
    move-wide/from16 v19, v6

    .line 1159
    .line 1160
    iget-object v15, v1, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    .line 1161
    .line 1162
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->C:Ljava/util/LinkedList;

    .line 1163
    .line 1164
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;->LIFECYCLE:Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;

    .line 1165
    .line 1166
    invoke-virtual {v9, v1}, Lcom/quago/mobile/sdk/QuagoSettings;->getQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;)I

    .line 1167
    .line 1168
    .line 1169
    move-result v21

    .line 1170
    move-wide/from16 v17, v16

    .line 1171
    .line 1172
    move-object/from16 v16, v0

    .line 1173
    .line 1174
    invoke-static/range {v15 .. v21}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;Ljava/util/List;JJI)V

    .line 1175
    .line 1176
    .line 1177
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 1178
    .line 1179
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->a(JLjava/util/List;)V

    .line 1180
    .line 1181
    .line 1182
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->E:Ljava/util/LinkedList;

    .line 1183
    .line 1184
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->a(JLjava/util/List;)V

    .line 1185
    .line 1186
    .line 1187
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->C:Ljava/util/LinkedList;

    .line 1188
    .line 1189
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1190
    .line 1191
    .line 1192
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->F:Ljava/util/LinkedList;

    .line 1193
    .line 1194
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1195
    .line 1196
    .line 1197
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->G:Ljava/util/LinkedList;

    .line 1198
    .line 1199
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1200
    .line 1201
    .line 1202
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->H:Ljava/util/LinkedList;

    .line 1203
    .line 1204
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1205
    .line 1206
    .line 1207
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->I:Ljava/util/LinkedList;

    .line 1208
    .line 1209
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1210
    .line 1211
    .line 1212
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->J:Ljava/util/LinkedList;

    .line 1213
    .line 1214
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1215
    .line 1216
    .line 1217
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->K:Ljava/util/LinkedList;

    .line 1218
    .line 1219
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1220
    .line 1221
    .line 1222
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->L:Ljava/util/LinkedList;

    .line 1223
    .line 1224
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1225
    .line 1226
    .line 1227
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->M:Ljava/util/LinkedList;

    .line 1228
    .line 1229
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1230
    .line 1231
    .line 1232
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->N:Ljava/util/LinkedList;

    .line 1233
    .line 1234
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1235
    .line 1236
    .line 1237
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->O:Ljava/util/LinkedList;

    .line 1238
    .line 1239
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1240
    .line 1241
    .line 1242
    iget-object v0, v10, Lcom/quago/mobile/sdk/l;->P:Ljava/util/LinkedList;

    .line 1243
    .line 1244
    invoke-static {v4, v5, v0}, Lcom/quago/mobile/sdk/f1;->b(JLjava/util/List;)V

    .line 1245
    .line 1246
    .line 1247
    return-object v10
.end method

.method public final a(Landroid/view/KeyEvent;)V
    .locals 8

    if-nez p1, :cond_0

    goto :goto_0

    .line 1260
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    :goto_0
    return-void

    .line 1261
    :cond_1
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    const/4 v0, 0x2

    goto :goto_1

    .line 1262
    :cond_2
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    move v0, v1

    .line 1263
    :goto_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    move-result v2

    .line 1264
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v3

    .line 1265
    iget-object v4, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    iget v5, v4, Lcom/quago/mobile/sdk/k;->c:I

    add-int/2addr v5, v1

    iget-object v1, v4, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/v;

    array-length v4, v1

    rem-int/2addr v5, v4

    .line 1266
    aget-object v1, v1, v5

    monitor-enter v1

    .line 1267
    :try_start_0
    iget-object v4, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    iget-object v4, v4, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, [Lcom/quago/mobile/sdk/v;

    aget-object v6, v6, v5

    iput v0, v6, Lcom/quago/mobile/sdk/v;->c:I

    .line 1268
    check-cast v4, [Lcom/quago/mobile/sdk/v;

    aget-object v0, v4, v5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDownTime()J

    move-result-wide v6

    iput-wide v6, v0, Lcom/quago/mobile/sdk/v;->b:J

    .line 1269
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    iget-object v0, v0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v0, [Lcom/quago/mobile/sdk/v;

    aget-object v0, v0, v5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v6

    iput-wide v6, v0, Lcom/quago/mobile/sdk/j;->a:J

    .line 1270
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    iget-object v0, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, [Lcom/quago/mobile/sdk/v;

    aget-object v4, v4, v5

    iput v2, v4, Lcom/quago/mobile/sdk/v;->d:I

    .line 1271
    check-cast v0, [Lcom/quago/mobile/sdk/v;

    aget-object v0, v0, v5

    iput v3, v0, Lcom/quago/mobile/sdk/v;->e:I

    .line 1272
    iput v5, p1, Lcom/quago/mobile/sdk/k;->c:I

    .line 1273
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1274
    iget p1, p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {p1}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1275
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v0, "dispatchKey"

    const-string v2, "%s%s(%s)"

    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    iget-object v4, v3, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/v;

    aget-object v3, v3, v5

    .line 1276
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/v;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->d:Lcom/quago/mobile/sdk/k;

    iget p0, p0, Lcom/quago/mobile/sdk/k;->c:I

    .line 1277
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v4, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 1278
    invoke-virtual {p1, v0, v2, p0}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    .line 1279
    :cond_3
    :goto_2
    monitor-exit v1

    return-void

    .line 1280
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final a(Landroid/view/MotionEvent;)V
    .locals 13

    .line 1281
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    const/4 v3, 0x5

    if-eq v0, v2, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 v5, 0x4

    if-eq v0, v5, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x6

    if-eq v0, v3, :cond_0

    goto/16 :goto_4

    .line 1282
    :cond_0
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    move v3, v5

    goto :goto_0

    .line 1283
    :cond_1
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    move v3, v4

    goto :goto_0

    .line 1284
    :cond_2
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    move v3, v1

    goto :goto_0

    .line 1285
    :cond_3
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    goto :goto_0

    .line 1286
    :cond_4
    sget-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    move v3, v2

    .line 1287
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v0

    .line 1288
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-ne v3, v1, :cond_7

    const/4 v1, 0x0

    .line 1289
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    if-ge v1, v6, :cond_6

    .line 1290
    iget-object v6, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget v7, v6, Lcom/quago/mobile/sdk/k;->c:I

    add-int/2addr v7, v2

    iget-object v6, v6, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v6, [Lcom/quago/mobile/sdk/x;

    array-length v8, v6

    rem-int/2addr v7, v8

    .line 1291
    aget-object v6, v6, v7

    monitor-enter v6

    .line 1292
    :try_start_0
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v9, v8

    check-cast v9, [Lcom/quago/mobile/sdk/x;

    aget-object v9, v9, v7

    iput v3, v9, Lcom/quago/mobile/sdk/x;->h:I

    .line 1293
    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v9

    iput-wide v9, v8, Lcom/quago/mobile/sdk/x;->b:J

    .line 1294
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v9

    iput-wide v9, v8, Lcom/quago/mobile/sdk/j;->a:J

    .line 1295
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->c:F

    .line 1296
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->d:F

    .line 1297
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getSize(I)F

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->e:F

    .line 1298
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result v9

    invoke-static {v9, v5}, Ljava/lang/Math;->min(FF)F

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->f:F

    .line 1299
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getOrientation(I)F

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->g:F

    .line 1300
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->i:I

    .line 1301
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v8, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v9, v8

    check-cast v9, [Lcom/quago/mobile/sdk/x;

    aget-object v9, v9, v7

    iput v4, v9, Lcom/quago/mobile/sdk/x;->j:I

    .line 1302
    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v9

    iput v9, v8, Lcom/quago/mobile/sdk/x;->k:I

    .line 1303
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v9, v8, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v9, [Lcom/quago/mobile/sdk/x;

    aget-object v9, v9, v7

    iput v0, v9, Lcom/quago/mobile/sdk/x;->l:I

    .line 1304
    iput v7, v8, Lcom/quago/mobile/sdk/k;->c:I

    .line 1305
    sget-object v8, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v9, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1306
    iget v8, v8, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {v8}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 1307
    iget-object v8, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v9, "dispatchTouch"

    const-string v10, "%s%s(%s)"

    iget-object v11, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v12, v11, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object v11, v11, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v11, [Lcom/quago/mobile/sdk/x;

    aget-object v7, v11, v7

    .line 1308
    invoke-virtual {v7}, Lcom/quago/mobile/sdk/x;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object v11, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget v11, v11, Lcom/quago/mobile/sdk/k;->c:I

    .line 1309
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v12, v7, v11}, [Ljava/lang/Object;

    move-result-object v7

    .line 1310
    invoke-virtual {v8, v9, v10, v7}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    .line 1311
    :cond_5
    :goto_2
    monitor-exit v6

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    .line 1312
    :goto_3
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_6
    :goto_4
    return-void

    .line 1313
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    .line 1314
    iget-object v6, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget v7, v6, Lcom/quago/mobile/sdk/k;->c:I

    add-int/2addr v7, v2

    iget-object v2, v6, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/x;

    array-length v6, v2

    rem-int/2addr v7, v6

    .line 1315
    aget-object v2, v2, v7

    monitor-enter v2

    .line 1316
    :try_start_1
    iget-object v6, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v6, v6, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v8, v6

    check-cast v8, [Lcom/quago/mobile/sdk/x;

    aget-object v8, v8, v7

    iput v3, v8, Lcom/quago/mobile/sdk/x;->h:I

    .line 1317
    check-cast v6, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v6, v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v8

    iput-wide v8, v3, Lcom/quago/mobile/sdk/x;->b:J

    .line 1318
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v8

    iput-wide v8, v3, Lcom/quago/mobile/sdk/j;->a:J

    .line 1319
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    iput v6, v3, Lcom/quago/mobile/sdk/x;->c:F

    .line 1320
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    iput v6, v3, Lcom/quago/mobile/sdk/x;->d:F

    .line 1321
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getSize(I)F

    move-result v6

    iput v6, v3, Lcom/quago/mobile/sdk/x;->e:F

    .line 1322
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result v6

    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iput v5, v3, Lcom/quago/mobile/sdk/x;->f:F

    .line 1323
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getOrientation(I)F

    move-result v5

    iput v5, v3, Lcom/quago/mobile/sdk/x;->g:F

    .line 1324
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v5

    iput v5, v3, Lcom/quago/mobile/sdk/x;->i:I

    .line 1325
    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, [Lcom/quago/mobile/sdk/x;

    aget-object v5, v5, v7

    iput v4, v5, Lcom/quago/mobile/sdk/x;->j:I

    .line 1326
    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p1

    iput p1, v3, Lcom/quago/mobile/sdk/x;->k:I

    .line 1327
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/x;

    aget-object v1, v1, v7

    iput v0, v1, Lcom/quago/mobile/sdk/x;->l:I

    .line 1328
    iput v7, p1, Lcom/quago/mobile/sdk/k;->c:I

    .line 1329
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1330
    iget p1, p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {p1}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1331
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v0, "dispatchTouch"

    const-string v1, "%s%s(%s)"

    iget-object v3, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget-object v4, v3, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v3, [Lcom/quago/mobile/sdk/x;

    aget-object v3, v3, v7

    .line 1332
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/x;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    iget p0, p0, Lcom/quago/mobile/sdk/k;->c:I

    .line 1333
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v4, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 1334
    invoke-virtual {p1, v0, v1, p0}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception p0

    goto :goto_6

    .line 1335
    :cond_8
    :goto_5
    monitor-exit v2

    return-void

    .line 1336
    :goto_6
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public final a(Lcom/quago/mobile/sdk/k;)V
    .locals 5

    .line 1337
    iget v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/k1;

    array-length v2, v1

    rem-int/2addr v0, v2

    .line 1338
    aget-object v1, v1, v0

    monitor-enter v1

    .line 1339
    :try_start_0
    iget-object v2, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/k1;

    aget-object v2, v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/quago/mobile/sdk/j;->a:J

    .line 1340
    iput v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    .line 1341
    sget-object v2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v3, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1342
    iget v2, v2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {v2}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1343
    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v2, "onSensorChanged"

    const-string v3, "%s%s(%s)"

    iget-object v4, p1, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast p1, [Lcom/quago/mobile/sdk/k1;

    aget-object p1, p1, v0

    .line 1344
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/k1;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1345
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 1346
    invoke-virtual {p0, v2, v3, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 1347
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 1348
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final a(Lcom/quago/mobile/sdk/k;F)V
    .locals 5

    .line 1349
    iget v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/p;

    array-length v2, v1

    rem-int/2addr v0, v2

    .line 1350
    aget-object v1, v1, v0

    monitor-enter v1

    .line 1351
    :try_start_0
    iget-object v2, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/p;

    aget-object v2, v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/quago/mobile/sdk/j;->a:J

    .line 1352
    iget-object v2, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/p;

    aget-object v2, v2, v0

    iput p2, v2, Lcom/quago/mobile/sdk/p;->b:F

    .line 1353
    iput v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    .line 1354
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v2, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1355
    iget p2, p2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {p2}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 1356
    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string p2, "onSensorChanged"

    const-string v2, "%s%s(%s)"

    iget-object v3, p1, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast p1, [Lcom/quago/mobile/sdk/p;

    aget-object p1, p1, v0

    .line 1357
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/p;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1358
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 1359
    invoke-virtual {p0, p2, v2, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 1360
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 1361
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final a(Lcom/quago/mobile/sdk/k;FFF)V
    .locals 5

    .line 1362
    iget v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v1, [Lcom/quago/mobile/sdk/o;

    array-length v2, v1

    rem-int/2addr v0, v2

    .line 1363
    aget-object v1, v1, v0

    monitor-enter v1

    .line 1364
    :try_start_0
    iget-object v2, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/o;

    aget-object v2, v2, v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/quago/mobile/sdk/j;->a:J

    .line 1365
    iget-object v2, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [Lcom/quago/mobile/sdk/o;

    aget-object v3, v3, v0

    iput p2, v3, Lcom/quago/mobile/sdk/o;->b:F

    .line 1366
    move-object p2, v2

    check-cast p2, [Lcom/quago/mobile/sdk/o;

    aget-object p2, p2, v0

    iput p3, p2, Lcom/quago/mobile/sdk/o;->c:F

    .line 1367
    check-cast v2, [Lcom/quago/mobile/sdk/o;

    aget-object p2, v2, v0

    iput p4, p2, Lcom/quago/mobile/sdk/o;->d:F

    .line 1368
    iput v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    .line 1369
    sget-object p2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object p3, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1370
    iget p2, p2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {p2}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 1371
    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string p2, "onSensorChanged"

    const-string p3, "%s%s(%s)"

    iget-object p4, p1, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast p1, [Lcom/quago/mobile/sdk/o;

    aget-object p1, p1, v0

    .line 1372
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/o;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1373
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p4, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 1374
    invoke-virtual {p0, p2, p3, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 1375
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 1376
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final a(Lcom/quago/mobile/sdk/w;)V
    .locals 6

    .line 1248
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    iget v1, v0, Lcom/quago/mobile/sdk/k;->c:I

    add-int/lit8 v1, v1, 0x1

    iget-object v0, v0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v0, [Lcom/quago/mobile/sdk/w;

    array-length v2, v0

    rem-int/2addr v1, v2

    .line 1249
    aget-object v0, v0, v1

    monitor-enter v0

    .line 1250
    :try_start_0
    iget-object v2, p0, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    iget-object v2, v2, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/w;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lcom/quago/mobile/sdk/w;->a(Lcom/quago/mobile/sdk/j;)V

    .line 1251
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    iput v1, p1, Lcom/quago/mobile/sdk/k;->c:I

    .line 1252
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v2, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 1253
    iget p1, p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {p1}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1254
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v2, "onLifeCycleChanged"

    const-string v3, "%s%s(%s)"

    iget-object v4, p0, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    iget-object v5, v4, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object v4, v4, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v4, [Lcom/quago/mobile/sdk/w;

    aget-object v1, v4, v1

    .line 1255
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/w;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->b:Lcom/quago/mobile/sdk/k;

    iget p0, p0, Lcom/quago/mobile/sdk/k;->c:I

    .line 1256
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v5, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 1257
    invoke-virtual {p1, v2, v3, p0}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 1258
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    .line 1259
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
