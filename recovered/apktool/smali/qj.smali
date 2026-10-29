.class public final Lqj;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Ljava/lang/String;)Lrj;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :sswitch_0
    const-string v0, "specialFeatureOptins"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lrj;->a0:Lrj;

    .line 24
    .line 25
    return-object p0

    .line 26
    :sswitch_1
    const-string v0, "vendorListVersion"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_1
    sget-object p0, Lrj;->c0:Lrj;

    .line 37
    .line 38
    return-object p0

    .line 39
    :sswitch_2
    const-string v0, "lastUpdated"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_2
    sget-object p0, Lrj;->v:Lrj;

    .line 50
    .line 51
    return-object p0

    .line 52
    :sswitch_3
    const-string v0, "publisherLegitimateInterests"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :cond_3
    sget-object p0, Lrj;->V:Lrj;

    .line 63
    .line 64
    return-object p0

    .line 65
    :sswitch_4
    const-string v0, "created"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_4

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_4
    sget-object p0, Lrj;->f:Lrj;

    .line 76
    .line 77
    return-object p0

    .line 78
    :sswitch_5
    const-string v0, "singleOrRange"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_5

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :cond_5
    sget-object p0, Lrj;->n0:Lrj;

    .line 89
    .line 90
    return-object p0

    .line 91
    :sswitch_6
    const-string v0, "numRestrictions"

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_6

    .line 98
    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :cond_6
    sget-object p0, Lrj;->j0:Lrj;

    .line 102
    .line 103
    return-object p0

    .line 104
    :sswitch_7
    const-string v0, "consentLanguage"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_7

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :cond_7
    sget-object p0, Lrj;->d:Lrj;

    .line 115
    .line 116
    return-object p0

    .line 117
    :sswitch_8
    const-string v0, "purposeOneTreatment"

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-nez p0, :cond_8

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :cond_8
    sget-object p0, Lrj;->Z:Lrj;

    .line 128
    .line 129
    return-object p0

    .line 130
    :sswitch_9
    const-string v0, "publisherConsents"

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_9

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_9
    sget-object p0, Lrj;->W:Lrj;

    .line 141
    .line 142
    return-object p0

    .line 143
    :sswitch_a
    const-string v0, "restrictionType"

    .line 144
    .line 145
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_a

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_a
    sget-object p0, Lrj;->l0:Lrj;

    .line 154
    .line 155
    return-object p0

    .line 156
    :sswitch_b
    const-string v0, "purposeLegitimateInterests"

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_b

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_b
    sget-object p0, Lrj;->Y:Lrj;

    .line 167
    .line 168
    return-object p0

    .line 169
    :sswitch_c
    const-string v0, "useNonStandardStacks"

    .line 170
    .line 171
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-nez p0, :cond_c

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_c
    sget-object p0, Lrj;->b0:Lrj;

    .line 180
    .line 181
    return-object p0

    .line 182
    :sswitch_d
    const-string v0, "version"

    .line 183
    .line 184
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-nez p0, :cond_d

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_d
    sget-object p0, Lrj;->d0:Lrj;

    .line 193
    .line 194
    return-object p0

    .line 195
    :sswitch_e
    const-string v0, "maxId"

    .line 196
    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-nez p0, :cond_e

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_e
    sget-object p0, Lrj;->g0:Lrj;

    .line 206
    .line 207
    return-object p0

    .line 208
    :sswitch_f
    const-string v0, "cmpId"

    .line 209
    .line 210
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-nez p0, :cond_f

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_f
    sget-object p0, Lrj;->b:Lrj;

    .line 219
    .line 220
    return-object p0

    .line 221
    :sswitch_10
    const-string v0, "numEntries"

    .line 222
    .line 223
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    if-nez p0, :cond_10

    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_10
    sget-object p0, Lrj;->i0:Lrj;

    .line 232
    .line 233
    return-object p0

    .line 234
    :sswitch_11
    const-string v0, "isServiceSpecific"

    .line 235
    .line 236
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    if-nez p0, :cond_11

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_11
    sget-object p0, Lrj;->i:Lrj;

    .line 245
    .line 246
    return-object p0

    .line 247
    :sswitch_12
    const-string v0, "consentScreen"

    .line 248
    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-nez p0, :cond_12

    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_12
    sget-object p0, Lrj;->e:Lrj;

    .line 258
    .line 259
    return-object p0

    .line 260
    :sswitch_13
    const-string v0, "publisherCountryCode"

    .line 261
    .line 262
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-nez p0, :cond_13

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_13
    sget-object p0, Lrj;->U:Lrj;

    .line 271
    .line 272
    return-object p0

    .line 273
    :sswitch_14
    const-string v0, "encodingType"

    .line 274
    .line 275
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    if-nez p0, :cond_14

    .line 280
    .line 281
    goto :goto_0

    .line 282
    :cond_14
    sget-object p0, Lrj;->f0:Lrj;

    .line 283
    .line 284
    return-object p0

    .line 285
    :sswitch_15
    const-string v0, "purposeConsents"

    .line 286
    .line 287
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    if-nez p0, :cond_15

    .line 292
    .line 293
    goto :goto_0

    .line 294
    :cond_15
    sget-object p0, Lrj;->X:Lrj;

    .line 295
    .line 296
    return-object p0

    .line 297
    :sswitch_16
    const-string v0, "segmentType"

    .line 298
    .line 299
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    if-nez p0, :cond_16

    .line 304
    .line 305
    goto :goto_0

    .line 306
    :cond_16
    sget-object p0, Lrj;->m0:Lrj;

    .line 307
    .line 308
    return-object p0

    .line 309
    :sswitch_17
    const-string v0, "anyBoolean"

    .line 310
    .line 311
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    if-nez p0, :cond_17

    .line 316
    .line 317
    goto :goto_0

    .line 318
    :cond_17
    sget-object p0, Lrj;->e0:Lrj;

    .line 319
    .line 320
    return-object p0

    .line 321
    :sswitch_18
    const-string v0, "purposeId"

    .line 322
    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    if-nez p0, :cond_18

    .line 328
    .line 329
    goto :goto_0

    .line 330
    :cond_18
    sget-object p0, Lrj;->k0:Lrj;

    .line 331
    .line 332
    return-object p0

    .line 333
    :sswitch_19
    const-string v0, "policyVersion"

    .line 334
    .line 335
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    if-nez p0, :cond_19

    .line 340
    .line 341
    goto :goto_0

    .line 342
    :cond_19
    sget-object p0, Lrj;->w:Lrj;

    .line 343
    .line 344
    return-object p0

    .line 345
    :sswitch_1a
    const-string v0, "numCustomPurposes"

    .line 346
    .line 347
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result p0

    .line 351
    if-nez p0, :cond_1a

    .line 352
    .line 353
    goto :goto_0

    .line 354
    :cond_1a
    sget-object p0, Lrj;->h0:Lrj;

    .line 355
    .line 356
    return-object p0

    .line 357
    :sswitch_1b
    const-string v0, "cmpVersion"

    .line 358
    .line 359
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result p0

    .line 363
    if-nez p0, :cond_1b

    .line 364
    .line 365
    goto :goto_0

    .line 366
    :cond_1b
    sget-object p0, Lrj;->c:Lrj;

    .line 367
    .line 368
    return-object p0

    .line 369
    :sswitch_1c
    const-string v0, "vendorId"

    .line 370
    .line 371
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result p0

    .line 375
    if-nez p0, :cond_1c

    .line 376
    .line 377
    :goto_0
    const/4 p0, 0x0

    .line 378
    return-object p0

    .line 379
    :cond_1c
    sget-object p0, Lrj;->o0:Lrj;

    .line 380
    .line 381
    return-object p0

    .line 382
    nop

    .line 383
    :sswitch_data_0
    .sparse-switch
        -0x7df5837d -> :sswitch_1c
        -0x7bc4a74e -> :sswitch_1b
        -0x78169534 -> :sswitch_1a
        -0x65f8ccba -> :sswitch_19
        -0x542ec927 -> :sswitch_18
        -0x3a423764 -> :sswitch_17
        -0x38cc2ef3 -> :sswitch_16
        -0x34705929 -> :sswitch_15
        -0x32a5b0d3 -> :sswitch_14
        -0x2c2610f9 -> :sswitch_13
        -0x8ac8eda -> :sswitch_12
        -0x700ff83 -> :sswitch_11
        -0x5ef71d6 -> :sswitch_10
        0x5a65101 -> :sswitch_f
        0x62de59f -> :sswitch_e
        0x14f51cd8 -> :sswitch_d
        0x1a393d6e -> :sswitch_c
        0x1de6d536 -> :sswitch_b
        0x20155126 -> :sswitch_a
        0x206d8db5 -> :sswitch_9
        0x21df50f0 -> :sswitch_8
        0x2896fd92 -> :sswitch_7
        0x29c84ccd -> :sswitch_6
        0x3385a3b2 -> :sswitch_5
        0x3d4e7ee8 -> :sswitch_4
        0x538a9798 -> :sswitch_3
        0x6254f145 -> :sswitch_2
        0x66a71bf2 -> :sswitch_1
        0x707002b8 -> :sswitch_0
    .end sparse-switch
.end method
