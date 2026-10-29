.class public final Lts0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lxo0;
.implements Lvm;
.implements Lj53;
.implements Lfj;
.implements Lfk0;
.implements Lsg0;
.implements Ly82;
.implements Lh2;
.implements Lhg1;
.implements Lq1;
.implements Lorg/chromium/support_lib_boundary/WebMessageListenerBoundaryInterface;
.implements Le73;
.implements Lw73;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "data"

    .line 15
    .line 16
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lts0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Lgz;Ljava/util/List;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)Lh61;
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    move-object v3, v2

    .line 18
    check-cast v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 19
    .line 20
    invoke-interface {v0}, Lgz;->b()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v5, v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Lgz;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v2, 0x0

    .line 46
    :goto_0
    check-cast v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Lgz;->getDescription()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v39

    .line 54
    invoke-interface {v0}, Lgz;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v0}, Lgz;->e()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {v0}, Lgz;->a()Z

    .line 63
    .line 64
    .line 65
    move-result v45

    .line 66
    invoke-interface {v0}, Lgz;->c()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v30

    .line 70
    invoke-interface {v0}, Lgz;->d()Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v47

    .line 74
    new-instance v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 75
    .line 76
    sget-object v9, Lnd0;->a:Lnd0;

    .line 77
    .line 78
    new-instance v43, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 79
    .line 80
    invoke-direct/range {v43 .. v43}, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;-><init>()V

    .line 81
    .line 82
    .line 83
    const/16 v50, 0x0

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const-string v8, ""

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x0

    .line 95
    .line 96
    const/16 v25, 0x0

    .line 97
    .line 98
    const/16 v31, 0x0

    .line 99
    .line 100
    const/16 v37, 0x0

    .line 101
    .line 102
    const/16 v40, 0x0

    .line 103
    .line 104
    const/16 v41, 0x0

    .line 105
    .line 106
    const/16 v42, 0x0

    .line 107
    .line 108
    const/16 v44, 0x0

    .line 109
    .line 110
    const/16 v46, 0x0

    .line 111
    .line 112
    const/16 v48, 0x0

    .line 113
    .line 114
    const/16 v49, 0x0

    .line 115
    .line 116
    move-object v11, v8

    .line 117
    move-object v12, v8

    .line 118
    move-object v13, v8

    .line 119
    move-object v14, v9

    .line 120
    move-object v15, v9

    .line 121
    move-object/from16 v16, v9

    .line 122
    .line 123
    move-object/from16 v17, v9

    .line 124
    .line 125
    move-object/from16 v18, v9

    .line 126
    .line 127
    move-object/from16 v19, v9

    .line 128
    .line 129
    move-object/from16 v20, v9

    .line 130
    .line 131
    move-object/from16 v22, v8

    .line 132
    .line 133
    move-object/from16 v26, v8

    .line 134
    .line 135
    move-object/from16 v27, v8

    .line 136
    .line 137
    move-object/from16 v28, v8

    .line 138
    .line 139
    move-object/from16 v29, v8

    .line 140
    .line 141
    move-object/from16 v32, v8

    .line 142
    .line 143
    move-object/from16 v33, v8

    .line 144
    .line 145
    move-object/from16 v34, v8

    .line 146
    .line 147
    move-object/from16 v35, v8

    .line 148
    .line 149
    move-object/from16 v36, v8

    .line 150
    .line 151
    move-object/from16 v38, v8

    .line 152
    .line 153
    invoke-direct/range {v3 .. v50}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    .line 154
    .line 155
    .line 156
    move-object v2, v3

    .line 157
    :cond_2
    iget-object v1, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    .line 160
    .line 161
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 162
    .line 163
    new-instance v6, Lmu1;

    .line 164
    .line 165
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v7, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v6, v4, v7}, Lmu1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_3

    .line 179
    .line 180
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 181
    .line 182
    :cond_3
    move-object v7, v4

    .line 183
    iget-object v8, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    .line 184
    .line 185
    iget-object v9, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 186
    .line 187
    invoke-interface {v0}, Lgz;->b()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    instance-of v4, v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 192
    .line 193
    if-eqz v4, :cond_7

    .line 194
    .line 195
    move-object v11, v0

    .line 196
    check-cast v11, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 197
    .line 198
    iget-object v11, v11, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 199
    .line 200
    if-eqz v11, :cond_7

    .line 201
    .line 202
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    const/4 v13, 0x1

    .line 207
    xor-int/2addr v12, v13

    .line 208
    if-ne v12, v13, :cond_7

    .line 209
    .line 210
    new-instance v3, Ljava/util/ArrayList;

    .line 211
    .line 212
    const/16 v12, 0xa

    .line 213
    .line 214
    invoke-static {v11, v12}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eqz v12, :cond_6

    .line 230
    .line 231
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    check-cast v12, Ljava/lang/String;

    .line 236
    .line 237
    move-object/from16 v13, p2

    .line 238
    .line 239
    iget-object v14, v13, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->c:Ljava/util/Map;

    .line 240
    .line 241
    if-eqz v14, :cond_5

    .line 242
    .line 243
    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v14

    .line 247
    check-cast v14, Ljava/lang/String;

    .line 248
    .line 249
    if-nez v14, :cond_4

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_4
    move-object v12, v14

    .line 253
    :cond_5
    :goto_2
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_6
    :goto_3
    move-object v11, v3

    .line 258
    goto :goto_4

    .line 259
    :cond_7
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    if-nez v11, :cond_8

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_8
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    .line 267
    .line 268
    invoke-static {v3}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    goto :goto_3

    .line 273
    :goto_4
    if-eqz v1, :cond_a

    .line 274
    .line 275
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_9

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_9
    :goto_5
    move-object v12, v1

    .line 283
    goto :goto_7

    .line 284
    :cond_a
    :goto_6
    const-string v1, ""

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :goto_7
    new-instance v14, Lhv1;

    .line 288
    .line 289
    iget-object v1, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 290
    .line 291
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    .line 292
    .line 293
    iget-object v13, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 294
    .line 295
    invoke-direct {v14, v1, v3, v13}, Lhv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v15, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    .line 299
    .line 300
    iget-object v1, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 301
    .line 302
    new-instance v3, Law1;

    .line 303
    .line 304
    iget-object v13, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    .line 305
    .line 306
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    .line 307
    .line 308
    move-object/from16 v16, v1

    .line 309
    .line 310
    iget-object v1, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    .line 311
    .line 312
    move/from16 v17, v4

    .line 313
    .line 314
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    .line 315
    .line 316
    invoke-direct {v3, v13, v0, v1, v4}, Law1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-interface/range {p0 .. p0}, Lgz;->e()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v18

    .line 323
    if-eqz v17, :cond_b

    .line 324
    .line 325
    move-object/from16 v0, p0

    .line 326
    .line 327
    check-cast v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 328
    .line 329
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 330
    .line 331
    :goto_8
    move-object v13, v0

    .line 332
    goto :goto_9

    .line 333
    :cond_b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :goto_9
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    .line 337
    .line 338
    iget-object v1, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    .line 339
    .line 340
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    .line 341
    .line 342
    move-object/from16 v19, v0

    .line 343
    .line 344
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 345
    .line 346
    move-object/from16 v22, v0

    .line 347
    .line 348
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    .line 349
    .line 350
    iget-boolean v2, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    .line 351
    .line 352
    move-object/from16 v21, v4

    .line 353
    .line 354
    new-instance v4, Lh61;

    .line 355
    .line 356
    move-object/from16 v23, v0

    .line 357
    .line 358
    move-object/from16 v20, v1

    .line 359
    .line 360
    move/from16 v24, v2

    .line 361
    .line 362
    move-object/from16 v17, v3

    .line 363
    .line 364
    invoke-direct/range {v4 .. v24}, Lh61;-><init>(Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    return-object v4
.end method

.method public static H(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "gcm.n."

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    return-object p0
.end method

.method public static f(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p1

    .line 7
    const-string v0, "Error in reading the json value for key "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "genricDataMngr"

    .line 14
    .line 15
    invoke-static {v0, p0, p1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static z(Landroid/os/Bundle;)Z
    .locals 4

    .line 1
    const-string v0, "gcm.n.e"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "1"

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const-string v1, "gcm.n."

    .line 16
    .line 17
    const-string v3, "gcm.notification."

    .line 18
    .line 19
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method


# virtual methods
.method public B()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "google.c.a."

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    const-string v2, "from"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
.end method

.method public declared-synchronized C(Ljava/lang/String;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lts0;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/HashSet;

    .line 11
    .line 12
    iget-object v2, p0, Lts0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/content/SharedPreferences;

    .line 15
    .line 16
    new-instance v3, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    iget-object v2, p0, Lts0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Landroid/content/SharedPreferences;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    :try_start_2
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    :goto_0
    monitor-exit p0

    .line 67
    return-void

    .line 68
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    throw p1
.end method

.method public D(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->o(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public declared-synchronized E(J)Z
    .locals 6

    .line 1
    const-string v0, "fire-global"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lts0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/content/SharedPreferences;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object v2, p0, Lts0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/content/SharedPreferences;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-wide/16 v4, -0x1

    .line 20
    .line 21
    :try_start_1
    invoke-interface {v2, v0, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :try_start_2
    invoke-virtual {p0, v1, v2}, Lts0;->k(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p0, p1, p2}, Lts0;->k(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    :try_start_3
    monitor-exit p0

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    iget-object v1, p0, Lts0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/content/SharedPreferences;

    .line 44
    .line 45
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return v3

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    monitor-exit p0

    .line 61
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 65
    :try_start_5
    throw p1

    .line 66
    :cond_1
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 75
    .line 76
    .line 77
    monitor-exit p0

    .line 78
    return v3

    .line 79
    :goto_0
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 80
    throw p1
.end method

.method public declared-synchronized F(Ljava/lang/String;J)V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lts0;->k(J)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    iget-object p3, p0, Lts0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p3, Landroid/content/SharedPreferences;

    .line 9
    .line 10
    const-string v0, "last-used-date"

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-interface {p3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lts0;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :cond_0
    :try_start_1
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :cond_1
    :try_start_2
    invoke-virtual {p0, p1, p2}, Lts0;->G(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :try_start_3
    iget-object p3, p0, Lts0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p3, Landroid/content/SharedPreferences;

    .line 50
    .line 51
    const-string v0, "fire-count"

    .line 52
    .line 53
    const-wide/16 v1, 0x0

    .line 54
    .line 55
    invoke-interface {p3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    const-wide/16 v5, 0x1

    .line 60
    .line 61
    add-long v7, v3, v5

    .line 62
    .line 63
    const-wide/16 v9, 0x1e

    .line 64
    .line 65
    cmp-long p3, v7, v9

    .line 66
    .line 67
    if-nez p3, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0}, Lts0;->b()V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, Lts0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p3, Landroid/content/SharedPreferences;

    .line 75
    .line 76
    const-string v0, "fire-count"

    .line 77
    .line 78
    invoke-interface {p3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    :cond_3
    new-instance p3, Ljava/util/HashSet;

    .line 83
    .line 84
    iget-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Landroid/content/SharedPreferences;

    .line 87
    .line 88
    new-instance v1, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-direct {p3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-long/2addr v3, v5

    .line 104
    iget-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroid/content/SharedPreferences;

    .line 107
    .line 108
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0, p1, p3}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p3, "fire-count"

    .line 117
    .line 118
    invoke-interface {p1, p3, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string p3, "last-used-date"

    .line 123
    .line 124
    invoke-interface {p1, p3, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    .line 130
    .line 131
    monitor-exit p0

    .line 132
    return-void

    .line 133
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 134
    throw p1
.end method

.method public declared-synchronized G(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p2}, Lts0;->C(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    iget-object v1, p0, Lts0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/content/SharedPreferences;

    .line 10
    .line 11
    new-instance v2, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lts0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Landroid/content/SharedPreferences;

    .line 29
    .line 30
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public I(Landroid/app/Activity;)Lfk0;
    .locals 4

    .line 1
    new-instance v0, Lzs;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v2, v1}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 7
    .line 8
    .line 9
    new-instance p0, Lrm;

    .line 10
    .line 11
    sget-object p1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 12
    .line 13
    const/4 v1, -0x2

    .line 14
    sget-object v3, Lxk;->a:Lxk;

    .line 15
    .line 16
    invoke-direct {p0, v0, p1, v1, v3}, Lrm;-><init>(Lzs;Lkotlin/coroutines/CoroutineContext;ILxk;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lz80;->a:Lm60;

    .line 20
    .line 21
    sget-object v0, Lgb1;->a:Lkt0;

    .line 22
    .line 23
    sget-object v1, Lxt0;->w:Lxt0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ls10;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lkt0;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-static {p0, v0, p1, v2, v1}, Lb40;->l(Lrm;Lkt0;ILxk;I)Lfk0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    const-string p0, "Flow context cannot contain job in it. Had "

    .line 46
    .line 47
    invoke-static {v0, p0}, Ln4;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v2
.end method

.method public a()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public declared-synchronized b()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/content/SharedPreferences;

    .line 5
    .line 6
    const-string v1, "fire-count"

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-string v2, ""

    .line 15
    .line 16
    iget-object v3, p0, Lts0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroid/content/SharedPreferences;

    .line 19
    .line 20
    invoke-interface {v3}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    instance-of v6, v6, Ljava/util/Set;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Ljava/util/Set;

    .line 58
    .line 59
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_0

    .line 68
    .line 69
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-lez v8, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/lang/String;

    .line 91
    .line 92
    move-object v4, v7

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance v3, Ljava/util/HashSet;

    .line 95
    .line 96
    iget-object v5, p0, Lts0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v5, Landroid/content/SharedPreferences;

    .line 99
    .line 100
    new-instance v6, Ljava/util/HashSet;

    .line 101
    .line 102
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v5, v2, v6}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, Lts0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Landroid/content/SharedPreferences;

    .line 118
    .line 119
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-string v3, "fire-count"

    .line 128
    .line 129
    const-wide/16 v4, 0x1

    .line 130
    .line 131
    sub-long/2addr v0, v4

    .line 132
    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return-void

    .line 141
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw v0
.end method

.method public c(Ljg1;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public collect(Lhk0;Lc10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Ll;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ll;

    .line 7
    .line 8
    iget v1, v0, Ll;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ll;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ll;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ll;-><init>(Lts0;Lc10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ll;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Ll;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Ll;->a:Lw52;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lw52;

    .line 55
    .line 56
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {p2, p1, v2}, Lw52;-><init>(Lhk0;Lkotlin/coroutines/CoroutineContext;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iput-object p2, v0, Ll;->a:Lw52;

    .line 64
    .line 65
    iput v3, v0, Ll;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 66
    .line 67
    :try_start_2
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 70
    .line 71
    invoke-interface {p0, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, v1, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    .line 80
    :goto_1
    if-ne p0, v1, :cond_4

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_4
    move-object p0, p2

    .line 84
    :goto_2
    invoke-virtual {p0}, Ld10;->releaseIntercepted()V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    move-object p1, p0

    .line 92
    :goto_3
    move-object p0, p2

    .line 93
    goto :goto_4

    .line 94
    :catchall_2
    move-exception p1

    .line 95
    goto :goto_3

    .line 96
    :goto_4
    invoke-virtual {p0}, Ld10;->releaseIntercepted()V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 0

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->createWebView(Landroid/webkit/WebView;)Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class p1, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 10
    .line 11
    invoke-static {p1, p0}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public d([II)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, Lts0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lwq0;

    .line 10
    .line 11
    array-length v3, v0

    .line 12
    if-eqz v3, :cond_26

    .line 13
    .line 14
    array-length v3, v0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    if-le v3, v5, :cond_2

    .line 18
    .line 19
    aget v6, v0, v4

    .line 20
    .line 21
    if-nez v6, :cond_2

    .line 22
    .line 23
    move v6, v5

    .line 24
    :goto_0
    if-ge v6, v3, :cond_0

    .line 25
    .line 26
    aget v7, v0, v6

    .line 27
    .line 28
    if-nez v7, :cond_0

    .line 29
    .line 30
    add-int/lit8 v6, v6, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-ne v6, v3, :cond_1

    .line 34
    .line 35
    filled-new-array {v4}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    sub-int/2addr v3, v6

    .line 41
    new-array v7, v3, [I

    .line 42
    .line 43
    invoke-static {v0, v6, v7, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    move-object v3, v7

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object v3, v0

    .line 49
    :goto_1
    new-array v6, v2, [I

    .line 50
    .line 51
    move v7, v4

    .line 52
    move v8, v5

    .line 53
    :goto_2
    if-ge v7, v2, :cond_7

    .line 54
    .line 55
    iget v9, v1, Lwq0;->g:I

    .line 56
    .line 57
    add-int/2addr v9, v7

    .line 58
    iget-object v10, v1, Lwq0;->a:[I

    .line 59
    .line 60
    aget v9, v10, v9

    .line 61
    .line 62
    if-nez v9, :cond_3

    .line 63
    .line 64
    array-length v9, v3

    .line 65
    sub-int/2addr v9, v5

    .line 66
    aget v9, v3, v9

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_3
    if-ne v9, v5, :cond_5

    .line 70
    .line 71
    array-length v9, v3

    .line 72
    move v10, v4

    .line 73
    move v11, v10

    .line 74
    :goto_3
    if-ge v11, v9, :cond_4

    .line 75
    .line 76
    aget v12, v3, v11

    .line 77
    .line 78
    sget-object v13, Lwq0;->h:Lwq0;

    .line 79
    .line 80
    xor-int/2addr v10, v12

    .line 81
    add-int/lit8 v11, v11, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    move v9, v10

    .line 85
    goto :goto_5

    .line 86
    :cond_5
    aget v10, v3, v4

    .line 87
    .line 88
    array-length v11, v3

    .line 89
    move v12, v5

    .line 90
    :goto_4
    if-ge v12, v11, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1, v9, v10}, Lwq0;->b(II)I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    aget v13, v3, v12

    .line 97
    .line 98
    xor-int/2addr v10, v13

    .line 99
    add-int/lit8 v12, v12, 0x1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :goto_5
    add-int/lit8 v10, v2, -0x1

    .line 103
    .line 104
    sub-int/2addr v10, v7

    .line 105
    aput v9, v6, v10

    .line 106
    .line 107
    if-eqz v9, :cond_6

    .line 108
    .line 109
    move v8, v4

    .line 110
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    if-eqz v8, :cond_8

    .line 114
    .line 115
    goto/16 :goto_16

    .line 116
    .line 117
    :cond_8
    new-instance v3, Lwc0;

    .line 118
    .line 119
    invoke-direct {v3, v1, v6}, Lwc0;-><init>(Lwq0;[I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v6, v1, Lwq0;->c:Lwc0;

    .line 126
    .line 127
    if-ltz v2, :cond_25

    .line 128
    .line 129
    add-int/lit8 v7, v2, 0x1

    .line 130
    .line 131
    new-array v7, v7, [I

    .line 132
    .line 133
    aput v5, v7, v4

    .line 134
    .line 135
    new-instance v8, Lwc0;

    .line 136
    .line 137
    invoke-direct {v8, v1, v7}, Lwc0;-><init>(Lwq0;[I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Lwc0;->w()I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    invoke-virtual {v3}, Lwc0;->w()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-ge v7, v9, :cond_9

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_9
    move-object/from16 v19, v8

    .line 152
    .line 153
    move-object v8, v3

    .line 154
    move-object/from16 v3, v19

    .line 155
    .line 156
    :goto_6
    iget-object v7, v1, Lwq0;->d:Lwc0;

    .line 157
    .line 158
    move-object v9, v7

    .line 159
    move-object v7, v3

    .line 160
    move-object v3, v8

    .line 161
    move-object v8, v9

    .line 162
    move-object v9, v6

    .line 163
    :goto_7
    invoke-virtual {v3}, Lwc0;->w()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    div-int/lit8 v11, v2, 0x2

    .line 168
    .line 169
    if-lt v10, v11, :cond_17

    .line 170
    .line 171
    invoke-virtual {v3}, Lwc0;->z()Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-nez v10, :cond_16

    .line 176
    .line 177
    invoke-virtual {v3}, Lwc0;->w()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    invoke-virtual {v3, v10}, Lwc0;->v(I)I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual {v1, v10}, Lwq0;->a(I)I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    move-object v11, v6

    .line 190
    :goto_8
    invoke-virtual {v7}, Lwc0;->w()I

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    invoke-virtual {v3}, Lwc0;->w()I

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-lt v12, v13, :cond_f

    .line 199
    .line 200
    invoke-virtual {v7}, Lwc0;->z()Z

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    if-nez v12, :cond_f

    .line 205
    .line 206
    invoke-virtual {v7}, Lwc0;->w()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    invoke-virtual {v3}, Lwc0;->w()I

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    sub-int/2addr v12, v13

    .line 215
    invoke-virtual {v7}, Lwc0;->w()I

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    invoke-virtual {v7, v13}, Lwc0;->v(I)I

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    invoke-virtual {v1, v13, v10}, Lwq0;->b(II)I

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-ltz v12, :cond_e

    .line 228
    .line 229
    if-nez v13, :cond_a

    .line 230
    .line 231
    move-object v15, v6

    .line 232
    goto :goto_9

    .line 233
    :cond_a
    add-int/lit8 v14, v12, 0x1

    .line 234
    .line 235
    new-array v14, v14, [I

    .line 236
    .line 237
    aput v13, v14, v4

    .line 238
    .line 239
    new-instance v15, Lwc0;

    .line 240
    .line 241
    invoke-direct {v15, v1, v14}, Lwc0;-><init>(Lwq0;[I)V

    .line 242
    .line 243
    .line 244
    :goto_9
    invoke-virtual {v11, v15}, Lwc0;->e(Lwc0;)Lwc0;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    iget-object v14, v3, Lwc0;->c:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v14, [I

    .line 251
    .line 252
    iget-object v15, v3, Lwc0;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v15, Lwq0;

    .line 255
    .line 256
    if-ltz v12, :cond_d

    .line 257
    .line 258
    if-nez v13, :cond_b

    .line 259
    .line 260
    iget-object v12, v15, Lwq0;->c:Lwc0;

    .line 261
    .line 262
    move/from16 p0, v5

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_b
    move/from16 p0, v5

    .line 266
    .line 267
    array-length v5, v14

    .line 268
    add-int/2addr v12, v5

    .line 269
    new-array v12, v12, [I

    .line 270
    .line 271
    :goto_a
    if-ge v4, v5, :cond_c

    .line 272
    .line 273
    aget v2, v14, v4

    .line 274
    .line 275
    invoke-virtual {v15, v2, v13}, Lwq0;->b(II)I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    aput v2, v12, v4

    .line 280
    .line 281
    add-int/lit8 v4, v4, 0x1

    .line 282
    .line 283
    move/from16 v2, p2

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_c
    new-instance v2, Lwc0;

    .line 287
    .line 288
    invoke-direct {v2, v15, v12}, Lwc0;-><init>(Lwq0;[I)V

    .line 289
    .line 290
    .line 291
    move-object v12, v2

    .line 292
    :goto_b
    invoke-virtual {v7, v12}, Lwc0;->e(Lwc0;)Lwc0;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    const/4 v4, 0x0

    .line 297
    move/from16 v5, p0

    .line 298
    .line 299
    move/from16 v2, p2

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_d
    invoke-static {}, Lf42;->e()V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_e
    invoke-static {}, Lf42;->e()V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_f
    move/from16 p0, v5

    .line 311
    .line 312
    iget-object v2, v11, Lwc0;->b:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v2, Lwq0;

    .line 315
    .line 316
    iget-object v4, v8, Lwc0;->b:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v4, Lwq0;

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-eqz v4, :cond_15

    .line 325
    .line 326
    invoke-virtual {v11}, Lwc0;->z()Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-nez v4, :cond_13

    .line 331
    .line 332
    invoke-virtual {v8}, Lwc0;->z()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_10

    .line 337
    .line 338
    goto :goto_e

    .line 339
    :cond_10
    iget-object v4, v11, Lwc0;->c:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v4, [I

    .line 342
    .line 343
    array-length v5, v4

    .line 344
    iget-object v10, v8, Lwc0;->c:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v10, [I

    .line 347
    .line 348
    array-length v11, v10

    .line 349
    add-int v12, v5, v11

    .line 350
    .line 351
    add-int/lit8 v12, v12, -0x1

    .line 352
    .line 353
    new-array v12, v12, [I

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    :goto_c
    if-ge v13, v5, :cond_12

    .line 357
    .line 358
    aget v14, v4, v13

    .line 359
    .line 360
    const/4 v15, 0x0

    .line 361
    :goto_d
    if-ge v15, v11, :cond_11

    .line 362
    .line 363
    add-int v16, v13, v15

    .line 364
    .line 365
    aget v17, v12, v16

    .line 366
    .line 367
    move-object/from16 v18, v4

    .line 368
    .line 369
    aget v4, v10, v15

    .line 370
    .line 371
    invoke-virtual {v2, v14, v4}, Lwq0;->b(II)I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    xor-int v4, v17, v4

    .line 376
    .line 377
    aput v4, v12, v16

    .line 378
    .line 379
    add-int/lit8 v15, v15, 0x1

    .line 380
    .line 381
    move-object/from16 v4, v18

    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_11
    move-object/from16 v18, v4

    .line 385
    .line 386
    add-int/lit8 v13, v13, 0x1

    .line 387
    .line 388
    goto :goto_c

    .line 389
    :cond_12
    new-instance v4, Lwc0;

    .line 390
    .line 391
    invoke-direct {v4, v2, v12}, Lwc0;-><init>(Lwq0;[I)V

    .line 392
    .line 393
    .line 394
    goto :goto_f

    .line 395
    :cond_13
    :goto_e
    iget-object v4, v2, Lwq0;->c:Lwc0;

    .line 396
    .line 397
    :goto_f
    invoke-virtual {v4, v9}, Lwc0;->e(Lwc0;)Lwc0;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-virtual {v7}, Lwc0;->w()I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    invoke-virtual {v3}, Lwc0;->w()I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    if-ge v4, v5, :cond_14

    .line 410
    .line 411
    move-object v4, v7

    .line 412
    move-object v7, v3

    .line 413
    move-object v3, v4

    .line 414
    const/4 v4, 0x0

    .line 415
    move/from16 v5, p0

    .line 416
    .line 417
    move-object v9, v8

    .line 418
    move-object v8, v2

    .line 419
    move/from16 v2, p2

    .line 420
    .line 421
    goto/16 :goto_7

    .line 422
    .line 423
    :cond_14
    const-string v0, "Division algorithm failed to reduce polynomial?"

    .line 424
    .line 425
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :cond_15
    const-string v0, "GenericGFPolys do not have same GenericGF field"

    .line 430
    .line 431
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :cond_16
    new-instance v0, Ld22;

    .line 436
    .line 437
    const-string v1, "r_{i-1} was zero"

    .line 438
    .line 439
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :cond_17
    move v2, v4

    .line 444
    move/from16 p0, v5

    .line 445
    .line 446
    invoke-virtual {v8, v2}, Lwc0;->v(I)I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    if-eqz v4, :cond_24

    .line 451
    .line 452
    invoke-virtual {v1, v4}, Lwq0;->a(I)I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    invoke-virtual {v8, v4}, Lwc0;->A(I)Lwc0;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-virtual {v3, v4}, Lwc0;->A(I)Lwc0;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    filled-new-array {v5, v3}, [Lwc0;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    aget-object v4, v3, v2

    .line 469
    .line 470
    aget-object v3, v3, p0

    .line 471
    .line 472
    invoke-virtual {v4}, Lwc0;->w()I

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    move/from16 v6, p0

    .line 477
    .line 478
    if-ne v5, v6, :cond_18

    .line 479
    .line 480
    invoke-virtual {v4, v6}, Lwc0;->v(I)I

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    filled-new-array {v4}, [I

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    goto :goto_11

    .line 489
    :cond_18
    new-array v6, v5, [I

    .line 490
    .line 491
    move v8, v2

    .line 492
    const/4 v7, 0x1

    .line 493
    :goto_10
    iget v9, v1, Lwq0;->e:I

    .line 494
    .line 495
    if-ge v7, v9, :cond_1a

    .line 496
    .line 497
    if-ge v8, v5, :cond_1a

    .line 498
    .line 499
    invoke-virtual {v4, v7}, Lwc0;->t(I)I

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    if-nez v9, :cond_19

    .line 504
    .line 505
    invoke-virtual {v1, v7}, Lwq0;->a(I)I

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    aput v9, v6, v8

    .line 510
    .line 511
    add-int/lit8 v8, v8, 0x1

    .line 512
    .line 513
    :cond_19
    add-int/lit8 v7, v7, 0x1

    .line 514
    .line 515
    goto :goto_10

    .line 516
    :cond_1a
    if-ne v8, v5, :cond_23

    .line 517
    .line 518
    move-object v4, v6

    .line 519
    :goto_11
    array-length v5, v4

    .line 520
    new-array v6, v5, [I

    .line 521
    .line 522
    move v7, v2

    .line 523
    :goto_12
    if-ge v7, v5, :cond_1f

    .line 524
    .line 525
    aget v8, v4, v7

    .line 526
    .line 527
    invoke-virtual {v1, v8}, Lwq0;->a(I)I

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    move v10, v2

    .line 532
    const/4 v9, 0x1

    .line 533
    :goto_13
    if-ge v10, v5, :cond_1d

    .line 534
    .line 535
    if-eq v7, v10, :cond_1c

    .line 536
    .line 537
    aget v11, v4, v10

    .line 538
    .line 539
    invoke-virtual {v1, v11, v8}, Lwq0;->b(II)I

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    and-int/lit8 v12, v11, 0x1

    .line 544
    .line 545
    if-nez v12, :cond_1b

    .line 546
    .line 547
    or-int/lit8 v11, v11, 0x1

    .line 548
    .line 549
    goto :goto_14

    .line 550
    :cond_1b
    and-int/lit8 v11, v11, -0x2

    .line 551
    .line 552
    :goto_14
    invoke-virtual {v1, v9, v11}, Lwq0;->b(II)I

    .line 553
    .line 554
    .line 555
    move-result v9

    .line 556
    :cond_1c
    add-int/lit8 v10, v10, 0x1

    .line 557
    .line 558
    goto :goto_13

    .line 559
    :cond_1d
    invoke-virtual {v3, v8}, Lwc0;->t(I)I

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    invoke-virtual {v1, v9}, Lwq0;->a(I)I

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    invoke-virtual {v1, v10, v9}, Lwq0;->b(II)I

    .line 568
    .line 569
    .line 570
    move-result v9

    .line 571
    aput v9, v6, v7

    .line 572
    .line 573
    iget v10, v1, Lwq0;->g:I

    .line 574
    .line 575
    if-eqz v10, :cond_1e

    .line 576
    .line 577
    invoke-virtual {v1, v9, v8}, Lwq0;->b(II)I

    .line 578
    .line 579
    .line 580
    move-result v8

    .line 581
    aput v8, v6, v7

    .line 582
    .line 583
    :cond_1e
    add-int/lit8 v7, v7, 0x1

    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_1f
    :goto_15
    array-length v3, v4

    .line 587
    if-ge v2, v3, :cond_22

    .line 588
    .line 589
    array-length v3, v0

    .line 590
    const/4 v5, 0x1

    .line 591
    sub-int/2addr v3, v5

    .line 592
    aget v7, v4, v2

    .line 593
    .line 594
    if-eqz v7, :cond_21

    .line 595
    .line 596
    iget-object v8, v1, Lwq0;->b:[I

    .line 597
    .line 598
    aget v7, v8, v7

    .line 599
    .line 600
    sub-int/2addr v3, v7

    .line 601
    if-ltz v3, :cond_20

    .line 602
    .line 603
    aget v7, v0, v3

    .line 604
    .line 605
    aget v8, v6, v2

    .line 606
    .line 607
    xor-int/2addr v7, v8

    .line 608
    aput v7, v0, v3

    .line 609
    .line 610
    add-int/lit8 v2, v2, 0x1

    .line 611
    .line 612
    goto :goto_15

    .line 613
    :cond_20
    new-instance v0, Ld22;

    .line 614
    .line 615
    const-string v1, "Bad error location"

    .line 616
    .line 617
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    throw v0

    .line 621
    :cond_21
    invoke-static {}, Lf42;->e()V

    .line 622
    .line 623
    .line 624
    :cond_22
    :goto_16
    return-void

    .line 625
    :cond_23
    new-instance v0, Ld22;

    .line 626
    .line 627
    const-string v1, "Error locator degree does not match number of roots"

    .line 628
    .line 629
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    throw v0

    .line 633
    :cond_24
    new-instance v0, Ld22;

    .line 634
    .line 635
    const-string v1, "sigmaTilde(0) was zero"

    .line 636
    .line 637
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    throw v0

    .line 641
    :cond_25
    invoke-static {}, Lf42;->e()V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :cond_26
    invoke-static {}, Lf42;->e()V

    .line 646
    .line 647
    .line 648
    return-void
.end method

.method public declared-synchronized e()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lts0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/content/SharedPreferences;

    .line 13
    .line 14
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    instance-of v4, v4, Ljava/util/Set;

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljava/util/Set;

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    invoke-virtual {p0, v5, v6}, Lts0;->k(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    new-instance v4, Ljava/util/HashSet;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_2

    .line 89
    :cond_1
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    if-nez v2, :cond_3

    .line 94
    .line 95
    const-string v1, "fire-count"

    .line 96
    .line 97
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const-string v1, "fire-count"

    .line 102
    .line 103
    int-to-long v2, v2

    .line 104
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    monitor-exit p0

    .line 111
    return-void

    .line 112
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    throw v0
.end method

.method public g(Lnz2;)V
    .locals 9

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lra2;

    .line 4
    .line 5
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ls03;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls03;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lra2;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Lra2;->b:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, Lrz2;

    .line 21
    .line 22
    if-eqz v3, :cond_6

    .line 23
    .line 24
    iget-object v0, v3, Lrz2;->i:Lys2;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, v0, Lys2;->d:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    new-instance v1, Lm33;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lm33;-><init>(Landroid/widget/FrameLayout;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lm33;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ln33;

    .line 40
    .line 41
    invoke-virtual {v0}, Ln33;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Ln33;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/view/View;

    .line 52
    .line 53
    instance-of v1, v0, Lqu2;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    check-cast v0, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 58
    .line 59
    sget v1, Lcom/usercentrics/sdk/ui/R$id;->ucFirstLayerHeaderLogo:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    iget-object v0, v0, Lcom/usercentrics/sdk/ui/components/UCImageView;->c:Lig2;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lz01;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    instance-of v1, v0, Lwv2;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    check-cast v0, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 82
    .line 83
    sget v1, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLogo:I

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    iget-object v0, v0, Lcom/usercentrics/sdk/ui/components/UCImageView;->c:Lig2;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Lz01;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 102
    .line 103
    const-string p1, "Sequence is empty."

    .line 104
    .line 105
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_3
    :goto_0
    iget-object v0, v3, Lrz2;->j:Lbt2;

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    new-instance v1, Lv11;

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v8, 0x7

    .line 117
    const/4 v2, 0x0

    .line 118
    const-class v4, Lrz2;

    .line 119
    .line 120
    const-string v5, "dismissDialogEffectively"

    .line 121
    .line 122
    const-string v6, "dismissDialogEffectively()V"

    .line 123
    .line 124
    invoke-direct/range {v1 .. v8}, Lv11;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 125
    .line 126
    .line 127
    iget-boolean v2, v0, Lbt2;->e:Z

    .line 128
    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    new-instance v2, Landroidx/transition/Slide;

    .line 132
    .line 133
    invoke-direct {v2}, Landroidx/transition/Visibility;-><init>()V

    .line 134
    .line 135
    .line 136
    sget-object v4, Landroidx/transition/Slide;->t0:Lye2;

    .line 137
    .line 138
    iput-object v4, v2, Landroidx/transition/Slide;->l0:Lze2;

    .line 139
    .line 140
    const/16 v4, 0x50

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/transition/Slide;->M(I)V

    .line 143
    .line 144
    .line 145
    const-wide/16 v4, 0x12c

    .line 146
    .line 147
    iput-wide v4, v2, Landroidx/transition/Transition;->c:J

    .line 148
    .line 149
    iget-object v6, v0, Lbt2;->d:Lys2;

    .line 150
    .line 151
    invoke-virtual {v2, v6}, Landroidx/transition/Transition;->b(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v6, v2}, Llr2;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    .line 155
    .line 156
    .line 157
    const/4 v2, 0x4

    .line 158
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    new-instance v6, Landroidx/transition/Fade;

    .line 162
    .line 163
    const/4 v7, 0x2

    .line 164
    invoke-direct {v6, v7}, Landroidx/transition/Fade;-><init>(I)V

    .line 165
    .line 166
    .line 167
    iput-wide v4, v6, Landroidx/transition/Transition;->c:J

    .line 168
    .line 169
    invoke-virtual {v0}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v6, v4}, Landroidx/transition/Transition;->b(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Lpn0;

    .line 177
    .line 178
    const/4 v5, 0x1

    .line 179
    invoke-direct {v4, v1, v5}, Lpn0;-><init>(Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v4}, Landroidx/transition/Transition;->a(Lir2;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1, v6}, Llr2;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_4
    invoke-virtual {v1}, Lv11;->invoke()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_5
    move-object v0, p1

    .line 207
    :goto_2
    if-nez v0, :cond_6

    .line 208
    .line 209
    invoke-virtual {v3}, Lrz2;->b()V

    .line 210
    .line 211
    .line 212
    :cond_6
    iput-object p1, p0, Lra2;->b:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object p1, p0, Lra2;->c:Ljava/lang/Object;

    .line 215
    .line 216
    sput-object p1, Lqu1;->b:Loz2;

    .line 217
    .line 218
    sget-object p0, Lyh;->e0:Lyh;

    .line 219
    .line 220
    invoke-static {p0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    sput-object p0, Lqu1;->e:Lhk2;

    .line 225
    .line 226
    sput-object p1, Lqu1;->c:Lfs0;

    .line 227
    .line 228
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljavax/inject/Provider;

    .line 4
    .line 5
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/content/Context;

    .line 10
    .line 11
    sget v0, Lk72;->d:I

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v1, Lk72;

    .line 22
    .line 23
    const-string v2, "com.google.android.datatransport.events"

    .line 24
    .line 25
    invoke-direct {v1, p0, v2, v0}, Lk72;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public getDropDataProvider()Lorg/chromium/support_lib_boundary/DropDataContentProviderBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getDropDataProvider()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/DropDataContentProviderBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/DropDataContentProviderBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public getProxyController()Lorg/chromium/support_lib_boundary/ProxyControllerBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getProxyController()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/ProxyControllerBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/ProxyControllerBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    .line 1
    const-string p0, "WEB_MESSAGE_LISTENER"

    .line 2
    .line 3
    const-string v0, "WEB_MESSAGE_ARRAY_BUFFER"

    .line 4
    .line 5
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getTracingController()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getWebkitToCompatConverter()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public declared-synchronized h()Ljava/util/ArrayList;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lts0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/content/SharedPreferences;

    .line 10
    .line 11
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    instance-of v3, v3, Ljava/util/Set;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    new-instance v3, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/util/Set;

    .line 50
    .line 51
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-virtual {p0, v4, v5}, Lts0;->k(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_0

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    new-instance v4, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 80
    .line 81
    .line 82
    new-instance v3, Lvf;

    .line 83
    .line 84
    invoke-direct {v3, v2, v4}, Lvf;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :try_start_1
    iget-object v3, p0, Lts0;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Landroid/content/SharedPreferences;

    .line 101
    .line 102
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v4, "fire-global"

    .line 107
    .line 108
    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    .line 115
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    monitor-exit p0

    .line 117
    return-object v0

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    :try_start_4
    throw v0

    .line 121
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    throw v0
.end method

.method public i(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "1"

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public j(Landroid/view/View;)Z
    .locals 2

    .line 1
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lra2;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr p1, v0

    .line 13
    iget-object p0, p0, Lra2;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->f0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->c(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return v0
.end method

.method public declared-synchronized k(J)Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x1a

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/Date;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lwt0;->k(Ljava/util/Date;)Ljava/time/Instant;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lwt0;->n()Ljava/time/ZoneOffset;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lwt0;->m(Ljava/time/Instant;)Ljava/time/OffsetDateTime;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lwt0;->l(Ljava/time/OffsetDateTime;)Ljava/time/LocalDateTime;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Lwt0;->o()Ljava/time/format/DateTimeFormatter;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lwt0;->h(Ljava/time/LocalDateTime;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit p0

    .line 36
    return-object p1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    :try_start_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 40
    .line 41
    const-string v1, "yyyy-MM-dd"

    .line 42
    .line 43
    sget-object v2, Ljava/util/Locale;->UK:Ljava/util/Locale;

    .line 44
    .line 45
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Ljava/util/Date;

    .line 49
    .line 50
    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    monitor-exit p0

    .line 58
    return-object p1

    .line 59
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    throw p1
.end method

.method public l(Ljg1;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxp2;

    .line 4
    .line 5
    iget-object v0, p0, Lxp2;->a:Landroidx/appcompat/widget/m;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/appcompat/widget/m;->a:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, Lxp2;->b:Landroid/view/Window$Callback;

    .line 14
    .line 15
    const/16 v1, 0x6c

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {p0, v0, v2, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public m(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p0

    .line 20
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "Couldn\'t parse value of "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lts0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, "("

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, ") into an int"

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "NotificationParams"

    .line 52
    .line 53
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method

.method public n(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "Malformed JSON for key "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lts0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, ": "

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ", falling back to default"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string p1, "NotificationParams"

    .line 49
    .line 50
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method

.method public o()[I
    .locals 8

    .line 1
    const-string v0, ". Skipping setting LightSettings"

    .line 2
    .line 3
    const-string v1, "LightSettings is invalid: "

    .line 4
    .line 5
    const-string v2, "NotificationParams"

    .line 6
    .line 7
    const-string v3, "gcm.n.light_settings"

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Lts0;->n(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    const/4 v4, 0x3

    .line 18
    new-array v5, v4, [I

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v6, v4, :cond_2

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/high16 v7, -0x1000000

    .line 36
    .line 37
    if-eq v6, v7, :cond_1

    .line 38
    .line 39
    aput v6, v5, v4

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optInt(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    aput v6, v5, v4

    .line 47
    .line 48
    const/4 v4, 0x2

    .line 49
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    aput v6, v5, v4

    .line 54
    .line 55
    return-object v5

    .line 56
    :catch_0
    move-exception v4

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    const-string v5, "Transparent color is invalid"

    .line 61
    .line 62
    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v4

    .line 66
    :cond_2
    new-instance v4, Lorg/json/JSONException;

    .line 67
    .line 68
    const-string v5, "lightSettings don\'t have all three fields"

    .line 69
    .line 70
    invoke-direct {v4, v5}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p0, ". "

    .line 83
    .line 84
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {v2, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catch_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {v2, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :goto_1
    return-object v3
.end method

.method public onBillingServiceDisconnected()V
    .locals 2

    .line 1
    const-string v0, "PurchaseManagerGoogle"

    .line 2
    .line 3
    const-string v1, "->onBillingServiceDisconnected()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 11
    .line 12
    invoke-static {}, Lkj;->a()Ljj;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x3

    .line 17
    iput v1, v0, Ljj;->a:I

    .line 18
    .line 19
    const-string v1, "onBillingServiceDisconnected"

    .line 20
    .line 21
    iput-object v1, v0, Ljj;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljj;->a()Lkj;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 28
    .line 29
    return-void
.end method

.method public onBillingSetupFinished(Lkj;)V
    .locals 3

    .line 1
    const-string v0, "->onBillingSetupFinished()"

    .line 2
    .line 3
    const-string v1, "PurchaseManagerGoogle"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget v0, p1, Lkj;->a:I

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "billing init is not ok: "

    .line 15
    .line 16
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget v2, p1, Lkj;->a:I

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " ; debug message :"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v2, p1, Lkj;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->v:Z

    .line 47
    .line 48
    iput-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/supercell/titan/PurchaseManagerGoogle;->b(Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmw0;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onPostMessage(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;ZLjava/lang/reflect/InvocationHandler;)V
    .locals 6

    .line 1
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 2
    .line 3
    invoke-static {v0, p2}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 8
    .line 9
    invoke-static {p2}, Lh63;->a(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Li63;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-class p2, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 16
    .line 17
    invoke-static {p2, p5}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 22
    .line 23
    new-instance p5, Lrc;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p5, p2, v0}, Lrc;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p5}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    move-object v5, p2

    .line 34
    check-cast v5, Le01;

    .line 35
    .line 36
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v0, p0

    .line 39
    check-cast v0, Lx63;

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    move-object v3, p3

    .line 43
    move v4, p4

    .line 44
    invoke-interface/range {v0 .. v5}, Lx63;->onPostMessage(Landroid/webkit/WebView;Li63;Landroid/net/Uri;ZLd01;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    return-void
.end method

.method public p(Landroid/view/View;Lm83;Lk53;)Lm83;
    .locals 4

    .line 1
    iget-object v0, p2, Lm83;->a:Lj83;

    .line 2
    .line 3
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/material/navigationrail/NavigationRailView;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/material/navigationrail/NavigationRailView;->v:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :goto_0
    const/4 v2, 0x7

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget v1, p3, Lk53;->b:I

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lj83;->f(I)Lly0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget v3, v3, Lly0;->b:I

    .line 32
    .line 33
    add-int/2addr v1, v3

    .line 34
    iput v1, p3, Lk53;->b:I

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/navigationrail/NavigationRailView;->w:Ljava/lang/Boolean;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    :goto_1
    if-eqz p0, :cond_3

    .line 52
    .line 53
    iget p0, p3, Lk53;->d:I

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Lj83;->f(I)Lly0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v0, v0, Lly0;->d:I

    .line 60
    .line 61
    add-int/2addr p0, v0

    .line 62
    iput p0, p3, Lk53;->d:I

    .line 63
    .line 64
    :cond_3
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    const/4 v0, 0x1

    .line 71
    if-ne p0, v0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    const/4 v0, 0x0

    .line 75
    :goto_2
    invoke-virtual {p2}, Lm83;->b()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-virtual {p2}, Lm83;->c()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iget v2, p3, Lk53;->a:I

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    move p0, v1

    .line 88
    :cond_5
    add-int/2addr v2, p0

    .line 89
    iput v2, p3, Lk53;->a:I

    .line 90
    .line 91
    iget p0, p3, Lk53;->b:I

    .line 92
    .line 93
    iget v0, p3, Lk53;->c:I

    .line 94
    .line 95
    iget p3, p3, Lk53;->d:I

    .line 96
    .line 97
    invoke-virtual {p1, v2, p0, v0, p3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 98
    .line 99
    .line 100
    return-object p2
.end method

.method public q(Ljava/lang/String;)[Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "_loc_args"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lts0;->n(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    new-array v0, p1, [Ljava/lang/String;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    if-ge v1, p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v0
.end method

.method public r(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "_loc_key"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public s()Ljava/lang/Long;
    .locals 3

    .line 1
    const-string v0, "gcm.n.event_time"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p0

    .line 22
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "Couldn\'t parse value of "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lts0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, "("

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ") into a long"

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "NotificationParams"

    .line 54
    .line 55
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_0
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method public t(ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler0;

    .line 4
    .line 5
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ler0;

    .line 8
    .line 9
    const-string v0, "notification_content"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lb40;->p(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v1, "genricDataMngr"

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    move-object v2, v0

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p0

    .line 33
    const-string v0, "Error in reading unread count notification content"

    .line 34
    .line 35
    invoke-static {v1, v0, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    const-string p0, "You have new messages"

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    :try_start_1
    invoke-virtual {v2, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string v0, "placeholder"

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p2, v0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    return-object p0

    .line 62
    :catch_1
    move-exception p1

    .line 63
    const-string p2, "Error in constructing unread count string"

    .line 64
    .line 65
    invoke-static {v1, p2, p1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public u(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0, p3}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0, p3}, Lts0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_1
    const-string v1, "string"

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const-string v0, " Default value will be used."

    .line 31
    .line 32
    const-string v1, "NotificationParams"

    .line 33
    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    new-instance p0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string p1, "_loc_key"

    .line 42
    .line 43
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lts0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " resource not found: "

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {v1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_2
    invoke-virtual {p0, p3}, Lts0;->q(Ljava/lang/String;)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-nez p0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_3
    :try_start_0
    invoke-virtual {p1, p2, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_0
    .catch Ljava/util/MissingFormatArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    return-object p0

    .line 89
    :catch_0
    move-exception p1

    .line 90
    new-instance p2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v3, "Missing format argument for "

    .line 93
    .line 94
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p3}, Lts0;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p3, ": "

    .line 105
    .line 106
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {v1, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    return-object v2
.end method

.method public declared-synchronized v(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    instance-of v2, v2, Ljava/util/Set;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    monitor-exit p0

    .line 73
    return-object p1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    monitor-exit p0

    .line 77
    const/4 p0, 0x0

    .line 78
    return-object p0

    .line 79
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p1
.end method

.method public w(Lum;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf81;

    .line 4
    .line 5
    iget-object v1, v0, Lf81;->f:Lum;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    const-string v2, "The result can only set once!"

    .line 13
    .line 14
    invoke-static {v2, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lf81;->f:Lum;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, "ListFuture["

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, "]"

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public x(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "gcm.n."

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move-object v0, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "gcm.notification."

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    move-object p1, v0

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public y()[J
    .locals 6

    .line 1
    const-string v0, "gcm.n.vibrate_timings"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lts0;->n(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-le v1, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-array v2, v1, [J

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v3, v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optLong(I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    aput-wide v4, v2, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v2

    .line 37
    :cond_2
    new-instance v1, Lorg/json/JSONException;

    .line 38
    .line 39
    const-string v2, "vibrateTimings have invalid length"

    .line 40
    .line 41
    invoke-direct {v1, v2}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "User defined vibrateTimings is invalid: "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ". Skipping setting vibrateTimings."

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v1, "NotificationParams"

    .line 65
    .line 66
    invoke-static {v1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    return-object v0
.end method
