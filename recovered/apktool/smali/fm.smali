.class public final Lfm;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lay1;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lfm;->b:Z

    .line 6
    .line 7
    iput-object p2, p0, Lfm;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lfm;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lfm;->a:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, Lfm;->f:Ljava/lang/Object;

    .line 14
    .line 15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 p2, 0x22

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    if-le p1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_0
    sget-object p3, Lqj3;->b:[B

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_1
    sget-object p3, Lqj3;->c:[B

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_2
    sget-object p3, Lqj3;->d:[B

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_3
    sget-object p3, Lqj3;->e:[B

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_4
    sget-object p3, Lqj3;->f:[B

    .line 40
    .line 41
    :goto_0
    iput-object p3, p0, Lfm;->e:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Lec;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lfm;->c:Ljava/lang/Object;

    .line 47
    iput-object p2, p0, Lfm;->d:Ljava/lang/Object;

    .line 48
    iput-object p3, p0, Lfm;->e:Ljava/lang/Object;

    .line 49
    iput-object p4, p0, Lfm;->a:Ljava/lang/String;

    .line 50
    iput-object p5, p0, Lfm;->f:Ljava/lang/Object;

    .line 51
    iput-object p6, p0, Lfm;->g:Ljava/lang/Object;

    .line 52
    iput-boolean p7, p0, Lfm;->b:Z

    .line 53
    iput-object p8, p0, Lfm;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ldw1;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ldw1;

    .line 4
    .line 5
    iget-object v2, v0, Lfm;->d:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v5, v2

    .line 8
    check-cast v5, Lur3;

    .line 9
    .line 10
    new-instance v2, Lra2;

    .line 11
    .line 12
    iget-object v3, v0, Lfm;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lec;

    .line 15
    .line 16
    iget-object v4, v3, Lec;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Leq2;

    .line 19
    .line 20
    iget-object v6, v3, Lec;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, Lnv1;

    .line 23
    .line 24
    new-instance v7, Lec0;

    .line 25
    .line 26
    iget-object v8, v4, Leq2;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v8, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v9, v4, Leq2;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v9, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v10, v0, Lfm;->c:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v11, v10

    .line 37
    check-cast v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 38
    .line 39
    iget-object v12, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 40
    .line 41
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v12, v12, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v13, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 47
    .line 48
    iget-object v14, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v7, v8, v9, v12, v14}, Lec0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, v3, Lec;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lau1;

    .line 56
    .line 57
    invoke-direct {v2, v4, v6, v7, v3}, Lra2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lam;

    .line 61
    .line 62
    iget-boolean v4, v0, Lfm;->b:Z

    .line 63
    .line 64
    invoke-direct {v3, v11, v5, v4}, Lam;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Z)V

    .line 65
    .line 66
    .line 67
    new-instance v12, Ljw2;

    .line 68
    .line 69
    if-eqz v13, :cond_0

    .line 70
    .line 71
    iget-object v4, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    .line 72
    .line 73
    if-nez v4, :cond_1

    .line 74
    .line 75
    :cond_0
    sget-object v4, Ljw2;->Companion:Liw2;

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object v4, Ljw2;->e:Lfj0;

    .line 81
    .line 82
    :cond_1
    iget-object v6, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 83
    .line 84
    iget-object v7, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 85
    .line 86
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-boolean v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    .line 90
    .line 91
    if-eqz v8, :cond_2

    .line 92
    .line 93
    iget-object v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    .line 94
    .line 95
    move-object/from16 v17, v8

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/16 v17, 0x0

    .line 99
    .line 100
    :goto_0
    iget-object v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v8, :cond_3

    .line 103
    .line 104
    const-string v8, ""

    .line 105
    .line 106
    :cond_3
    move-object/from16 v18, v8

    .line 107
    .line 108
    iget-object v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    iget-object v9, v6, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->b:Lej0;

    .line 113
    .line 114
    if-nez v9, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    :goto_1
    move-object/from16 v20, v9

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_2
    sget-object v9, Lam;->c:Lej0;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :goto_3
    iget-object v9, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 124
    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    iget-object v9, v9, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->a:Ljava/lang/String;

    .line 128
    .line 129
    move-object/from16 v21, v9

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_6
    const/16 v21, 0x0

    .line 133
    .line 134
    :goto_4
    sget-object v9, Lev1;->Companion:Ldv1;

    .line 135
    .line 136
    iget-object v15, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v14, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 139
    .line 140
    move-object/from16 v25, v5

    .line 141
    .line 142
    sget-object v5, Lez2;->V:Lez2;

    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-static {v15, v14, v5}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    iget-object v9, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->C:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v14, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 154
    .line 155
    sget-object v15, Lez2;->w:Lez2;

    .line 156
    .line 157
    invoke-static {v9, v14, v15}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    filled-new-array {v5, v9}, [Lev1;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v5}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    new-instance v9, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    :cond_7
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_8

    .line 183
    .line 184
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    move-object v15, v14

    .line 189
    check-cast v15, Lev1;

    .line 190
    .line 191
    invoke-virtual {v15}, Lev1;->a()Z

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    if-nez v15, :cond_7

    .line 196
    .line 197
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    if-eqz v6, :cond_9

    .line 202
    .line 203
    iget-object v5, v6, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->d:Ldj0;

    .line 204
    .line 205
    if-eqz v5, :cond_9

    .line 206
    .line 207
    sget-object v6, Ldj0;->b:Ldj0;

    .line 208
    .line 209
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    move-object/from16 v23, v5

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_9
    const/16 v23, 0x0

    .line 221
    .line 222
    :goto_6
    iget-object v5, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->h0:Ljava/lang/String;

    .line 223
    .line 224
    new-instance v15, Lf31;

    .line 225
    .line 226
    const/16 v22, 0x0

    .line 227
    .line 228
    move-object/from16 v24, v5

    .line 229
    .line 230
    move-object/from16 v16, v8

    .line 231
    .line 232
    move-object/from16 v19, v9

    .line 233
    .line 234
    invoke-direct/range {v15 .. v24}, Lf31;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lej0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-object v5, v3, Lam;->a:Lur3;

    .line 238
    .line 239
    iget-object v6, v5, Lur3;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v6, Lju1;

    .line 242
    .line 243
    iget-boolean v7, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 244
    .line 245
    if-nez v7, :cond_a

    .line 246
    .line 247
    new-instance v7, Lr4;

    .line 248
    .line 249
    iget-object v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

    .line 250
    .line 251
    invoke-direct {v7, v8}, Lr4;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v18, v7

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_a
    const/16 v18, 0x0

    .line 258
    .line 259
    :goto_7
    iget-boolean v7, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 260
    .line 261
    new-instance v26, Lxy1;

    .line 262
    .line 263
    iget-object v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 264
    .line 265
    iget-object v9, v6, Lju1;->e:Lbx0;

    .line 266
    .line 267
    sget-object v11, Lbu1;->c:Lbu1;

    .line 268
    .line 269
    new-instance v14, Luu1;

    .line 270
    .line 271
    invoke-direct {v14, v8, v11, v9}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 272
    .line 273
    .line 274
    iget-object v8, v13, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    .line 275
    .line 276
    iget-object v6, v6, Lju1;->f:Lbx0;

    .line 277
    .line 278
    sget-object v9, Lbu1;->e:Lbu1;

    .line 279
    .line 280
    new-instance v11, Luu1;

    .line 281
    .line 282
    invoke-direct {v11, v8, v9, v6}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 283
    .line 284
    .line 285
    iget-object v5, v5, Lur3;->d:Ljava/lang/Object;

    .line 286
    .line 287
    move-object/from16 v32, v5

    .line 288
    .line 289
    check-cast v32, Lgl;

    .line 290
    .line 291
    const/16 v33, 0x7

    .line 292
    .line 293
    const/16 v27, 0x0

    .line 294
    .line 295
    const/16 v28, 0x0

    .line 296
    .line 297
    const/16 v29, 0x0

    .line 298
    .line 299
    move-object/from16 v31, v11

    .line 300
    .line 301
    move-object/from16 v30, v14

    .line 302
    .line 303
    invoke-direct/range {v26 .. v33}, Lxy1;-><init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V

    .line 304
    .line 305
    .line 306
    new-instance v16, Lij;

    .line 307
    .line 308
    const-string v11, "Powered by Usercentrics Consent Management"

    .line 309
    .line 310
    if-eqz v7, :cond_b

    .line 311
    .line 312
    new-instance v5, Lr4;

    .line 313
    .line 314
    invoke-direct {v5, v11}, Lr4;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    move-object/from16 v17, v5

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_b
    const/16 v17, 0x0

    .line 321
    .line 322
    :goto_8
    invoke-virtual/range {v26 .. v26}, Lxy1;->h()Ljava/util/ArrayList;

    .line 323
    .line 324
    .line 325
    move-result-object v20

    .line 326
    invoke-virtual/range {v26 .. v26}, Lxy1;->i()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v21

    .line 330
    iget-boolean v3, v3, Lam;->b:Z

    .line 331
    .line 332
    move/from16 v19, v3

    .line 333
    .line 334
    invoke-direct/range {v16 .. v21}, Lij;-><init>(Lr4;Lr4;ZLjava/util/ArrayList;Ljava/util/List;)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v3, v16

    .line 338
    .line 339
    sget-object v5, Lnd0;->a:Lnd0;

    .line 340
    .line 341
    invoke-direct {v12, v4, v15, v3, v5}, Ljw2;-><init>(Lfj0;Lf31;Lij;Ljava/util/List;)V

    .line 342
    .line 343
    .line 344
    new-instance v3, Ldm;

    .line 345
    .line 346
    move-object v4, v10

    .line 347
    check-cast v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 348
    .line 349
    iget-object v5, v0, Lfm;->f:Ljava/lang/Object;

    .line 350
    .line 351
    move-object v7, v5

    .line 352
    check-cast v7, Ljava/util/List;

    .line 353
    .line 354
    iget-object v5, v0, Lfm;->g:Ljava/lang/Object;

    .line 355
    .line 356
    move-object v8, v5

    .line 357
    check-cast v8, Ljava/util/List;

    .line 358
    .line 359
    iget-boolean v9, v0, Lfm;->b:Z

    .line 360
    .line 361
    iget-object v5, v0, Lfm;->h:Ljava/lang/Object;

    .line 362
    .line 363
    move-object v10, v5

    .line 364
    check-cast v10, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 365
    .line 366
    iget-object v6, v0, Lfm;->a:Ljava/lang/String;

    .line 367
    .line 368
    move-object/from16 v5, v25

    .line 369
    .line 370
    invoke-direct/range {v3 .. v10}, Ldm;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)V

    .line 371
    .line 372
    .line 373
    new-instance v0, Lac1;

    .line 374
    .line 375
    iget-object v4, v3, Ldm;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 376
    .line 377
    iget-object v6, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 378
    .line 379
    iget-object v7, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 380
    .line 381
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 382
    .line 383
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    iget-object v15, v6, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

    .line 387
    .line 388
    iget-object v14, v6, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

    .line 389
    .line 390
    sget-object v17, Ldm;->w:Lej0;

    .line 391
    .line 392
    iget-object v9, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 393
    .line 394
    new-instance v10, Ljava/util/ArrayList;

    .line 395
    .line 396
    const/16 v13, 0xa

    .line 397
    .line 398
    move-object/from16 v16, v14

    .line 399
    .line 400
    invoke-static {v9, v13}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 401
    .line 402
    .line 403
    move-result v14

    .line 404
    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v14

    .line 415
    if-eqz v14, :cond_c

    .line 416
    .line 417
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v14

    .line 421
    check-cast v14, Ljava/lang/String;

    .line 422
    .line 423
    new-instance v13, Lbv1;

    .line 424
    .line 425
    invoke-direct {v13, v14}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    const/16 v13, 0xa

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_c
    new-instance v9, Lwa3;

    .line 435
    .line 436
    const/4 v13, 0x2

    .line 437
    invoke-direct {v9, v13}, Lwa3;-><init>(I)V

    .line 438
    .line 439
    .line 440
    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    iget-boolean v10, v6, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    .line 445
    .line 446
    if-nez v10, :cond_f

    .line 447
    .line 448
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 452
    .line 453
    .line 454
    move-result v10

    .line 455
    const/4 v13, 0x1

    .line 456
    if-le v10, v13, :cond_d

    .line 457
    .line 458
    goto :goto_a

    .line 459
    :cond_d
    const/4 v13, 0x0

    .line 460
    :goto_a
    if-nez v13, :cond_e

    .line 461
    .line 462
    goto :goto_b

    .line 463
    :cond_e
    new-instance v10, Lcv1;

    .line 464
    .line 465
    new-instance v13, Lbv1;

    .line 466
    .line 467
    iget-object v14, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 468
    .line 469
    invoke-direct {v13, v14}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-direct {v10, v9, v13}, Lcv1;-><init>(Ljava/util/List;Lbv1;)V

    .line 473
    .line 474
    .line 475
    move-object/from16 v19, v10

    .line 476
    .line 477
    goto :goto_c

    .line 478
    :cond_f
    :goto_b
    const/16 v19, 0x0

    .line 479
    .line 480
    :goto_c
    iget-object v9, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 481
    .line 482
    if-eqz v9, :cond_10

    .line 483
    .line 484
    iget-object v9, v9, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->a:Ljava/lang/String;

    .line 485
    .line 486
    move-object/from16 v18, v9

    .line 487
    .line 488
    goto :goto_d

    .line 489
    :cond_10
    const/16 v18, 0x0

    .line 490
    .line 491
    :goto_d
    sget-object v9, Lev1;->Companion:Ldv1;

    .line 492
    .line 493
    iget-object v10, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 494
    .line 495
    iget-object v13, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 496
    .line 497
    sget-object v14, Lez2;->V:Lez2;

    .line 498
    .line 499
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    invoke-static {v10, v13, v14}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    iget-object v8, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->C:Ljava/lang/String;

    .line 507
    .line 508
    iget-object v10, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 509
    .line 510
    sget-object v13, Lez2;->w:Lez2;

    .line 511
    .line 512
    invoke-static {v8, v10, v13}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    filled-new-array {v9, v8}, [Lev1;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    invoke-static {v8}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v8

    .line 524
    new-instance v9, Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 527
    .line 528
    .line 529
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    :cond_11
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 534
    .line 535
    .line 536
    move-result v10

    .line 537
    if-eqz v10, :cond_12

    .line 538
    .line 539
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    move-object v13, v10

    .line 544
    check-cast v13, Lev1;

    .line 545
    .line 546
    invoke-virtual {v13}, Lev1;->a()Z

    .line 547
    .line 548
    .line 549
    move-result v13

    .line 550
    if-nez v13, :cond_11

    .line 551
    .line 552
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    goto :goto_e

    .line 556
    :cond_12
    new-instance v13, Lqi1;

    .line 557
    .line 558
    move-object/from16 v14, v16

    .line 559
    .line 560
    const/16 v8, 0xa

    .line 561
    .line 562
    move-object/from16 v16, v9

    .line 563
    .line 564
    invoke-direct/range {v13 .. v19}, Lqi1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lej0;Ljava/lang/String;Lcv1;)V

    .line 565
    .line 566
    .line 567
    iget-boolean v9, v6, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 568
    .line 569
    if-nez v9, :cond_13

    .line 570
    .line 571
    new-instance v9, Lr4;

    .line 572
    .line 573
    iget-object v10, v6, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

    .line 574
    .line 575
    invoke-direct {v9, v10}, Lr4;-><init>(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v16, v9

    .line 579
    .line 580
    goto :goto_f

    .line 581
    :cond_13
    const/16 v16, 0x0

    .line 582
    .line 583
    :goto_f
    iget-boolean v9, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 584
    .line 585
    new-instance v17, Lxy1;

    .line 586
    .line 587
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 588
    .line 589
    iget-object v10, v3, Ldm;->c:Lur3;

    .line 590
    .line 591
    iget-object v14, v10, Lur3;->b:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v14, Lju1;

    .line 594
    .line 595
    iget-object v14, v14, Lju1;->e:Lbx0;

    .line 596
    .line 597
    sget-object v15, Lbu1;->c:Lbu1;

    .line 598
    .line 599
    new-instance v8, Luu1;

    .line 600
    .line 601
    invoke-direct {v8, v6, v15, v14}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 602
    .line 603
    .line 604
    iget-object v6, v10, Lur3;->d:Ljava/lang/Object;

    .line 605
    .line 606
    move-object/from16 v23, v6

    .line 607
    .line 608
    check-cast v23, Lgl;

    .line 609
    .line 610
    const/16 v24, 0x17

    .line 611
    .line 612
    const/16 v18, 0x0

    .line 613
    .line 614
    const/16 v19, 0x0

    .line 615
    .line 616
    const/16 v20, 0x0

    .line 617
    .line 618
    const/16 v22, 0x0

    .line 619
    .line 620
    move-object/from16 v21, v8

    .line 621
    .line 622
    invoke-direct/range {v17 .. v24}, Lxy1;-><init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V

    .line 623
    .line 624
    .line 625
    new-instance v14, Lij;

    .line 626
    .line 627
    if-eqz v9, :cond_14

    .line 628
    .line 629
    new-instance v6, Lr4;

    .line 630
    .line 631
    invoke-direct {v6, v11}, Lr4;-><init>(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    move-object v15, v6

    .line 635
    goto :goto_10

    .line 636
    :cond_14
    const/4 v15, 0x0

    .line 637
    :goto_10
    invoke-virtual/range {v17 .. v17}, Lxy1;->h()Ljava/util/ArrayList;

    .line 638
    .line 639
    .line 640
    move-result-object v18

    .line 641
    invoke-virtual/range {v17 .. v17}, Lxy1;->i()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v19

    .line 645
    iget-boolean v6, v3, Ldm;->i:Z

    .line 646
    .line 647
    move/from16 v17, v6

    .line 648
    .line 649
    invoke-direct/range {v14 .. v19}, Lij;-><init>(Lr4;Lr4;ZLjava/util/ArrayList;Ljava/util/List;)V

    .line 650
    .line 651
    .line 652
    new-instance v6, Lxv1;

    .line 653
    .line 654
    iget-object v8, v7, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->a:Ljava/lang/String;

    .line 655
    .line 656
    new-instance v9, Leu1;

    .line 657
    .line 658
    sget-object v10, Ln03;->Companion:Lm03;

    .line 659
    .line 660
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    iget-object v10, v3, Ldm;->e:Ljava/util/List;

    .line 664
    .line 665
    iget-object v11, v3, Ldm;->f:Ljava/util/List;

    .line 666
    .line 667
    invoke-static {v10, v11}, Lm03;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 668
    .line 669
    .line 670
    move-result-object v10

    .line 671
    new-instance v15, Ljava/util/ArrayList;

    .line 672
    .line 673
    move-object/from16 v17, v1

    .line 674
    .line 675
    move-object/from16 v16, v11

    .line 676
    .line 677
    const/16 v11, 0xa

    .line 678
    .line 679
    invoke-static {v10, v11}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v10

    .line 694
    if-eqz v10, :cond_16

    .line 695
    .line 696
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v10

    .line 700
    check-cast v10, Lxr;

    .line 701
    .line 702
    move-object/from16 v24, v1

    .line 703
    .line 704
    iget-object v1, v10, Lxr;->c:Ljava/util/ArrayList;

    .line 705
    .line 706
    move-object/from16 v25, v2

    .line 707
    .line 708
    new-instance v2, Ljava/util/ArrayList;

    .line 709
    .line 710
    move-object/from16 v26, v5

    .line 711
    .line 712
    invoke-static {v1, v11}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 724
    .line 725
    .line 726
    move-result v5

    .line 727
    if-eqz v5, :cond_15

    .line 728
    .line 729
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    check-cast v5, Lm61;

    .line 734
    .line 735
    new-instance v18, Lmv1;

    .line 736
    .line 737
    iget-object v11, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 738
    .line 739
    move-object/from16 v27, v1

    .line 740
    .line 741
    iget-object v1, v5, Lm61;->p:Li61;

    .line 742
    .line 743
    invoke-virtual {v3, v1}, Lsq3;->l(Li61;)Lkv1;

    .line 744
    .line 745
    .line 746
    move-result-object v23

    .line 747
    const/16 v21, 0x0

    .line 748
    .line 749
    const/16 v20, 0x0

    .line 750
    .line 751
    move-object/from16 v19, v5

    .line 752
    .line 753
    move-object/from16 v22, v11

    .line 754
    .line 755
    invoke-direct/range {v18 .. v23}, Lmv1;-><init>(Lm61;Lvv1;Llv1;Lq90;Lkv1;)V

    .line 756
    .line 757
    .line 758
    move-object/from16 v1, v18

    .line 759
    .line 760
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-object/from16 v1, v27

    .line 764
    .line 765
    goto :goto_12

    .line 766
    :cond_15
    new-instance v1, Lov1;

    .line 767
    .line 768
    invoke-direct {v1, v2}, Lov1;-><init>(Ljava/util/ArrayList;)V

    .line 769
    .line 770
    .line 771
    iget-object v2, v10, Lxr;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 772
    .line 773
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->c:Ljava/lang/String;

    .line 774
    .line 775
    new-instance v18, Lcu1;

    .line 776
    .line 777
    const/16 v23, 0x0

    .line 778
    .line 779
    const/16 v20, 0x0

    .line 780
    .line 781
    move-object/from16 v21, v1

    .line 782
    .line 783
    move-object/from16 v22, v2

    .line 784
    .line 785
    move-object/from16 v19, v10

    .line 786
    .line 787
    invoke-direct/range {v18 .. v23}, Lcu1;-><init>(Lxr;Lvv1;Lpg3;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 788
    .line 789
    .line 790
    move-object/from16 v1, v18

    .line 791
    .line 792
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-object/from16 v1, v24

    .line 796
    .line 797
    move-object/from16 v2, v25

    .line 798
    .line 799
    move-object/from16 v5, v26

    .line 800
    .line 801
    const/16 v11, 0xa

    .line 802
    .line 803
    goto :goto_11

    .line 804
    :cond_16
    move-object/from16 v25, v2

    .line 805
    .line 806
    move-object/from16 v26, v5

    .line 807
    .line 808
    new-instance v1, Ldu1;

    .line 809
    .line 810
    const/4 v2, 0x0

    .line 811
    invoke-direct {v1, v2, v15, v2}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 812
    .line 813
    .line 814
    invoke-static {v1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    invoke-direct {v9, v1}, Leu1;-><init>(Ljava/util/List;)V

    .line 819
    .line 820
    .line 821
    invoke-direct {v6, v8, v9}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 822
    .line 823
    .line 824
    new-instance v1, Lxv1;

    .line 825
    .line 826
    iget-object v2, v7, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->b:Ljava/lang/String;

    .line 827
    .line 828
    new-instance v5, Lpv1;

    .line 829
    .line 830
    new-instance v7, Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 833
    .line 834
    .line 835
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object v8

    .line 839
    :cond_17
    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v9

    .line 843
    if-eqz v9, :cond_18

    .line 844
    .line 845
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v9

    .line 849
    move-object v10, v9

    .line 850
    check-cast v10, Lm61;

    .line 851
    .line 852
    iget-boolean v10, v10, Lm61;->y:Z

    .line 853
    .line 854
    if-nez v10, :cond_17

    .line 855
    .line 856
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    goto :goto_13

    .line 860
    :cond_18
    new-instance v8, Ljava/util/ArrayList;

    .line 861
    .line 862
    const/16 v11, 0xa

    .line 863
    .line 864
    invoke-static {v7, v11}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 865
    .line 866
    .line 867
    move-result v9

    .line 868
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 872
    .line 873
    .line 874
    move-result-object v7

    .line 875
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 876
    .line 877
    .line 878
    move-result v9

    .line 879
    if-eqz v9, :cond_19

    .line 880
    .line 881
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v9

    .line 885
    check-cast v9, Lm61;

    .line 886
    .line 887
    new-instance v10, Lsv1;

    .line 888
    .line 889
    new-instance v18, Lmv1;

    .line 890
    .line 891
    iget-object v11, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 892
    .line 893
    iget-object v15, v9, Lm61;->p:Li61;

    .line 894
    .line 895
    invoke-virtual {v3, v15}, Lsq3;->l(Li61;)Lkv1;

    .line 896
    .line 897
    .line 898
    move-result-object v23

    .line 899
    const/16 v21, 0x0

    .line 900
    .line 901
    const/16 v20, 0x0

    .line 902
    .line 903
    move-object/from16 v19, v9

    .line 904
    .line 905
    move-object/from16 v22, v11

    .line 906
    .line 907
    invoke-direct/range {v18 .. v23}, Lmv1;-><init>(Lm61;Lvv1;Llv1;Lq90;Lkv1;)V

    .line 908
    .line 909
    .line 910
    move-object/from16 v11, v18

    .line 911
    .line 912
    invoke-direct {v10, v11}, Lsv1;-><init>(Lmv1;)V

    .line 913
    .line 914
    .line 915
    new-instance v11, Lcu1;

    .line 916
    .line 917
    const/4 v15, 0x0

    .line 918
    invoke-direct {v11, v9, v15, v10}, Lcu1;-><init>(Lm61;Lvv1;Lsv1;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    goto :goto_14

    .line 925
    :cond_19
    const/4 v15, 0x0

    .line 926
    new-instance v4, Lfu1;

    .line 927
    .line 928
    iget-object v7, v3, Ldm;->v:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 929
    .line 930
    iget-object v7, v7, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 931
    .line 932
    iget-object v7, v7, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 933
    .line 934
    iget-object v3, v3, Ldm;->d:Ljava/lang/String;

    .line 935
    .line 936
    invoke-direct {v4, v7, v3}, Lfu1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    new-instance v3, Ldu1;

    .line 940
    .line 941
    invoke-direct {v3, v15, v8, v4}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 942
    .line 943
    .line 944
    invoke-static {v3}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    invoke-direct {v5, v3}, Lpv1;-><init>(Ljava/util/List;)V

    .line 949
    .line 950
    .line 951
    invoke-direct {v1, v2, v5}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 952
    .line 953
    .line 954
    filled-new-array {v6, v1}, [Lxv1;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    invoke-static {v1}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    invoke-direct {v0, v13, v14, v1}, Lac1;-><init>(Lqi1;Lij;Ljava/util/List;)V

    .line 963
    .line 964
    .line 965
    move-object/from16 v1, v17

    .line 966
    .line 967
    move-object/from16 v2, v25

    .line 968
    .line 969
    move-object/from16 v5, v26

    .line 970
    .line 971
    invoke-direct {v1, v5, v2, v12, v0}, Ldw1;-><init>(Lur3;Lra2;Ljw2;Lac1;)V

    .line 972
    .line 973
    .line 974
    return-object v1
.end method

.method public b(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const-string p1, "compressed"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public c(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfm;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lz6;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lz6;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
