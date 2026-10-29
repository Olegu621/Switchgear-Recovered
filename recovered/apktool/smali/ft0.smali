.class public final Lft0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lft0;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lft0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lft0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lft0;->e:Ljava/lang/Object;

    iput-boolean p4, p0, Lft0;->b:Z

    iput-object p5, p0, Lft0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcu;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lft0;->a:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lft0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lft0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lft0;->e:Ljava/lang/Object;

    iput-boolean p5, p0, Lft0;->b:Z

    iput-object p1, p0, Lft0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldh0;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lft0;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lft0;->b:Z

    iput-object p3, p0, Lft0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lft0;->d:Ljava/lang/Object;

    iput-object p5, p0, Lft0;->e:Ljava/lang/Object;

    iput-object p1, p0, Lft0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzbe;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lft0;->a:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lft0;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lft0;->b:Z

    iput-object p4, p0, Lft0;->d:Ljava/lang/Object;

    iput-object p5, p0, Lft0;->e:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lft0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqi1;Ld52;Lwc0;ZLer0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lft0;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lft0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lft0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lft0;->d:Ljava/lang/Object;

    iput-boolean p4, p0, Lft0;->b:Z

    iput-object p5, p0, Lft0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lft0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lft0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lft0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lft0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p5, p0, Lft0;->b:Z

    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lft0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lft0;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    const-string v1, "Failed to send default event parameters to service"

    .line 12
    .line 13
    iget-object v2, v0, Lft0;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lpn3;

    .line 16
    .line 17
    iget-object v4, v2, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 18
    .line 19
    iget-object v5, v2, Lsq3;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Lij3;

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    iget-object v0, v5, Lij3;->f:Luh3;

    .line 26
    .line 27
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-object v6, v5, Lij3;->d:Lpd3;

    .line 37
    .line 38
    sget-object v7, Lvg3;->c1:Lug3;

    .line 39
    .line 40
    invoke-virtual {v6, v3, v7}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    iget-object v7, v0, Lft0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Lcom/google/android/gms/measurement/internal/zzr;

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    iget-boolean v1, v0, Lft0;->b:Z

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, v0, Lft0;->d:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 59
    .line 60
    :goto_0
    invoke-virtual {v2, v4, v3, v7}, Lpn3;->R(Lcom/google/android/gms/measurement/internal/zzga;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :try_start_0
    iget-object v0, v0, Lft0;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-interface {v4, v0, v7}, Lcom/google/android/gms/measurement/internal/zzga;->Q(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lpn3;->M()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    move-exception v0

    .line 76
    iget-object v2, v5, Lij3;->f:Luh3;

    .line 77
    .line 78
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 82
    .line 83
    invoke-virtual {v2, v0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    return-void

    .line 87
    :pswitch_0
    const-string v1, "_cmp"

    .line 88
    .line 89
    const-string v2, "_cis"

    .line 90
    .line 91
    const-string v3, "Activity created with data \'referrer\' without required params"

    .line 92
    .line 93
    const-string v4, "utm_medium"

    .line 94
    .line 95
    const-string v5, "utm_source"

    .line 96
    .line 97
    const-string v6, "utm_campaign"

    .line 98
    .line 99
    const-string v7, "gclid"

    .line 100
    .line 101
    const-string v8, "gclid="

    .line 102
    .line 103
    iget-object v9, v0, Lft0;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v9, Ldh0;

    .line 106
    .line 107
    iget-object v10, v9, Ldh0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v11, v10

    .line 110
    check-cast v11, Lsl3;

    .line 111
    .line 112
    invoke-virtual {v11}, Leg3;->y()V

    .line 113
    .line 114
    .line 115
    iget-object v10, v11, Lsq3;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v10, Lij3;

    .line 118
    .line 119
    iget-object v12, v11, Lsl3;->c0:Loi3;

    .line 120
    .line 121
    iget-object v13, v0, Lft0;->e:Ljava/lang/Object;

    .line 122
    .line 123
    move-object v14, v13

    .line 124
    check-cast v14, Ljava/lang/String;

    .line 125
    .line 126
    iget-object v13, v0, Lft0;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v13, Landroid/net/Uri;

    .line 129
    .line 130
    :try_start_1
    iget-object v15, v10, Lij3;->w:Lup3;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 131
    .line 132
    move-object/from16 v18, v9

    .line 133
    .line 134
    :try_start_2
    iget-object v9, v10, Lij3;->f:Luh3;

    .line 135
    .line 136
    invoke-static {v15}, Lij3;->j(Lsq3;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v16, v9

    .line 140
    .line 141
    const-string v9, "https://google.com/search?"

    .line 142
    .line 143
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v17

    .line 147
    move-object/from16 v19, v12

    .line 148
    .line 149
    if-eqz v17, :cond_3

    .line 150
    .line 151
    :goto_2
    const/4 v9, 0x0

    .line 152
    goto :goto_4

    .line 153
    :cond_3
    invoke-virtual {v14, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v17

    .line 157
    if-nez v17, :cond_4

    .line 158
    .line 159
    const-string v12, "gbraid"

    .line 160
    .line 161
    invoke-virtual {v14, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-nez v12, :cond_4

    .line 166
    .line 167
    invoke-virtual {v14, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-nez v12, :cond_4

    .line 172
    .line 173
    invoke-virtual {v14, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-nez v12, :cond_4

    .line 178
    .line 179
    invoke-virtual {v14, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-nez v12, :cond_4

    .line 184
    .line 185
    const-string v12, "utm_id"

    .line 186
    .line 187
    invoke-virtual {v14, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-nez v12, :cond_4

    .line 192
    .line 193
    const-string v12, "dclid"

    .line 194
    .line 195
    invoke-virtual {v14, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    if-nez v12, :cond_4

    .line 200
    .line 201
    const-string v12, "srsltid"

    .line 202
    .line 203
    invoke-virtual {v14, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-nez v12, :cond_4

    .line 208
    .line 209
    const-string v12, "sfmc_id"

    .line 210
    .line 211
    invoke-virtual {v14, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-nez v12, :cond_4

    .line 216
    .line 217
    iget-object v9, v15, Lsq3;->a:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v9, Lij3;

    .line 220
    .line 221
    iget-object v9, v9, Lij3;->f:Luh3;

    .line 222
    .line 223
    invoke-static {v9}, Lij3;->l(Lhk3;)V

    .line 224
    .line 225
    .line 226
    iget-object v9, v9, Luh3;->X:Lsh3;

    .line 227
    .line 228
    invoke-virtual {v9, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :catch_1
    move-exception v0

    .line 233
    :goto_3
    move-object/from16 v9, v18

    .line 234
    .line 235
    goto/16 :goto_7

    .line 236
    .line 237
    :cond_4
    invoke-virtual {v9, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-virtual {v15, v9}, Lup3;->y0(Landroid/net/Uri;)Landroid/os/Bundle;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    if-eqz v9, :cond_5

    .line 250
    .line 251
    const-string v12, "referrer"

    .line 252
    .line 253
    invoke-virtual {v9, v2, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 254
    .line 255
    .line 256
    :cond_5
    :goto_4
    iget-object v12, v0, Lft0;->d:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v12, Ljava/lang/String;

    .line 259
    .line 260
    iget-boolean v0, v0, Lft0;->b:Z

    .line 261
    .line 262
    if-eqz v0, :cond_7

    .line 263
    .line 264
    :try_start_3
    iget-object v0, v10, Lij3;->w:Lup3;

    .line 265
    .line 266
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v13}, Lup3;->y0(Landroid/net/Uri;)Landroid/os/Bundle;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    if-eqz v0, :cond_7

    .line 274
    .line 275
    const-string v13, "intent"

    .line 276
    .line 277
    invoke-virtual {v0, v2, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-nez v2, :cond_6

    .line 285
    .line 286
    if-eqz v9, :cond_6

    .line 287
    .line 288
    invoke-virtual {v9, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_6

    .line 293
    .line 294
    const-string v2, "_cer"

    .line 295
    .line 296
    invoke-virtual {v9, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v13

    .line 300
    new-instance v15, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {v15, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :cond_6
    invoke-virtual {v11, v12, v1, v0}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 316
    .line 317
    .line 318
    move-object/from16 v2, v19

    .line 319
    .line 320
    invoke-virtual {v2, v12, v0}, Loi3;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 321
    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_7
    move-object/from16 v2, v19

    .line 325
    .line 326
    :goto_5
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_8

    .line 331
    .line 332
    goto/16 :goto_8

    .line 333
    .line 334
    :cond_8
    invoke-static/range {v16 .. v16}, Lij3;->l(Lhk3;)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v0, v16

    .line 338
    .line 339
    iget-object v8, v0, Luh3;->X:Lsh3;

    .line 340
    .line 341
    const-string v13, "Activity created with referrer"

    .line 342
    .line 343
    invoke-virtual {v8, v14, v13}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    iget-object v13, v10, Lij3;->d:Lpd3;

    .line 347
    .line 348
    sget-object v15, Lvg3;->G0:Lug3;

    .line 349
    .line 350
    move-object/from16 v16, v0

    .line 351
    .line 352
    const/4 v0, 0x0

    .line 353
    invoke-virtual {v13, v0, v15}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 354
    .line 355
    .line 356
    move-result v13

    .line 357
    if-eqz v13, :cond_a

    .line 358
    .line 359
    if-eqz v9, :cond_9

    .line 360
    .line 361
    invoke-virtual {v11, v12, v1, v9}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v12, v9}, Loi3;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_9
    invoke-static/range {v16 .. v16}, Lij3;->l(Lhk3;)V

    .line 369
    .line 370
    .line 371
    const-string v1, "Referrer does not contain valid parameters"

    .line 372
    .line 373
    invoke-virtual {v8, v14, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    :goto_6
    iget-object v1, v10, Lij3;->V:Lxt0;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 382
    .line 383
    .line 384
    move-result-wide v16

    .line 385
    const-string v12, "auto"

    .line 386
    .line 387
    const-string v13, "_ldl"

    .line 388
    .line 389
    const/4 v15, 0x1

    .line 390
    move-object v14, v0

    .line 391
    invoke-virtual/range {v11 .. v17}, Lsl3;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 392
    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_a
    invoke-virtual {v14, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_c

    .line 400
    .line 401
    invoke-virtual {v14, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-nez v0, :cond_b

    .line 406
    .line 407
    invoke-virtual {v14, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-nez v0, :cond_b

    .line 412
    .line 413
    invoke-virtual {v14, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-nez v0, :cond_b

    .line 418
    .line 419
    const-string v0, "utm_term"

    .line 420
    .line 421
    invoke-virtual {v14, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-nez v0, :cond_b

    .line 426
    .line 427
    const-string v0, "utm_content"

    .line 428
    .line 429
    invoke-virtual {v14, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_c

    .line 434
    .line 435
    :cond_b
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_d

    .line 440
    .line 441
    iget-object v0, v10, Lij3;->V:Lxt0;

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 447
    .line 448
    .line 449
    move-result-wide v16

    .line 450
    const-string v12, "auto"

    .line 451
    .line 452
    const-string v13, "_ldl"

    .line 453
    .line 454
    const/4 v15, 0x1

    .line 455
    invoke-virtual/range {v11 .. v17}, Lsl3;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 456
    .line 457
    .line 458
    goto :goto_8

    .line 459
    :cond_c
    invoke-static/range {v16 .. v16}, Lij3;->l(Lhk3;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v8, v3}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 463
    .line 464
    .line 465
    goto :goto_8

    .line 466
    :catch_2
    move-exception v0

    .line 467
    move-object/from16 v18, v9

    .line 468
    .line 469
    goto/16 :goto_3

    .line 470
    .line 471
    :goto_7
    iget-object v1, v9, Ldh0;->b:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v1, Lsl3;

    .line 474
    .line 475
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v1, Lij3;

    .line 478
    .line 479
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 480
    .line 481
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 482
    .line 483
    .line 484
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 485
    .line 486
    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    .line 487
    .line 488
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    :cond_d
    :goto_8
    return-void

    .line 492
    :pswitch_1
    iget-object v1, v0, Lft0;->d:Ljava/lang/Object;

    .line 493
    .line 494
    move-object v8, v1

    .line 495
    check-cast v8, Ljava/lang/String;

    .line 496
    .line 497
    iget-object v1, v0, Lft0;->e:Ljava/lang/Object;

    .line 498
    .line 499
    move-object v9, v1

    .line 500
    check-cast v9, Ljava/lang/String;

    .line 501
    .line 502
    iget-boolean v11, v0, Lft0;->b:Z

    .line 503
    .line 504
    iget-object v1, v0, Lft0;->f:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v1, Lsl3;

    .line 507
    .line 508
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v1, Lij3;

    .line 511
    .line 512
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    iget-object v0, v0, Lft0;->c:Ljava/lang/Object;

    .line 517
    .line 518
    move-object v7, v0

    .line 519
    check-cast v7, Ljava/util/concurrent/atomic/AtomicReference;

    .line 520
    .line 521
    invoke-virtual {v6}, Leg3;->y()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v6}, Lwg3;->A()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v6, v4}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    new-instance v5, Lmm3;

    .line 532
    .line 533
    invoke-direct/range {v5 .. v11}, Lmm3;-><init>(Lpn3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;Z)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v6, v5}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :pswitch_2
    iget-object v1, v0, Lft0;->f:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 543
    .line 544
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 545
    .line 546
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    iget-object v1, v0, Lft0;->c:Ljava/lang/Object;

    .line 551
    .line 552
    move-object v11, v1

    .line 553
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 554
    .line 555
    iget-object v1, v0, Lft0;->d:Ljava/lang/Object;

    .line 556
    .line 557
    move-object v7, v1

    .line 558
    check-cast v7, Ljava/lang/String;

    .line 559
    .line 560
    iget-object v1, v0, Lft0;->e:Ljava/lang/Object;

    .line 561
    .line 562
    move-object v8, v1

    .line 563
    check-cast v8, Ljava/lang/String;

    .line 564
    .line 565
    iget-boolean v10, v0, Lft0;->b:Z

    .line 566
    .line 567
    invoke-virtual {v6}, Leg3;->y()V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v6}, Lwg3;->A()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v6, v4}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    new-instance v5, Lmm3;

    .line 578
    .line 579
    invoke-direct/range {v5 .. v11}, Lmm3;-><init>(Lpn3;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/internal/measurement/zzcu;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6, v5}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_3
    iget-object v1, v0, Lft0;->c:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v1, Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;

    .line 589
    .line 590
    iget-object v4, v0, Lft0;->d:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v4, Landroid/content/Intent;

    .line 593
    .line 594
    iget-object v5, v0, Lft0;->e:Ljava/lang/Object;

    .line 595
    .line 596
    move-object v7, v5

    .line 597
    check-cast v7, Landroid/content/Context;

    .line 598
    .line 599
    iget-boolean v5, v0, Lft0;->b:Z

    .line 600
    .line 601
    iget-object v0, v0, Lft0;->f:Ljava/lang/Object;

    .line 602
    .line 603
    move-object v12, v0

    .line 604
    check-cast v12, Landroid/content/BroadcastReceiver$PendingResult;

    .line 605
    .line 606
    :try_start_4
    const-string v0, "wrapped_intent"

    .line 607
    .line 608
    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    instance-of v6, v0, Landroid/content/Intent;

    .line 613
    .line 614
    if-eqz v6, :cond_e

    .line 615
    .line 616
    check-cast v0, Landroid/content/Intent;

    .line 617
    .line 618
    goto :goto_9

    .line 619
    :catchall_0
    move-exception v0

    .line 620
    goto/16 :goto_e

    .line 621
    .line 622
    :cond_e
    move-object v0, v3

    .line 623
    :goto_9
    if-eqz v0, :cond_f

    .line 624
    .line 625
    invoke-virtual {v1, v7, v0}, Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;->c(Landroid/content/Context;Landroid/content/Intent;)I

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    goto/16 :goto_c

    .line 630
    .line 631
    :cond_f
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    if-nez v0, :cond_10

    .line 636
    .line 637
    const/16 v0, 0x1f4

    .line 638
    .line 639
    goto/16 :goto_c

    .line 640
    .line 641
    :cond_10
    new-instance v8, Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 642
    .line 643
    invoke-direct {v8, v4}, Lcom/google/android/gms/cloudmessaging/CloudMessage;-><init>(Landroid/content/Intent;)V

    .line 644
    .line 645
    .line 646
    new-instance v9, Ljava/util/concurrent/CountDownLatch;

    .line 647
    .line 648
    invoke-direct {v9, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 649
    .line 650
    .line 651
    const-class v4, Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;

    .line 652
    .line 653
    monitor-enter v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 654
    :try_start_5
    sget-object v0, Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;->b:Ljava/lang/ref/SoftReference;

    .line 655
    .line 656
    if-eqz v0, :cond_11

    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    move-object v3, v0

    .line 663
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 664
    .line 665
    goto :goto_a

    .line 666
    :catchall_1
    move-exception v0

    .line 667
    goto :goto_d

    .line 668
    :cond_11
    :goto_a
    if-nez v3, :cond_12

    .line 669
    .line 670
    invoke-static {}, Lcom/google/android/gms/internal/cloudmessaging/zze;->zza()Lcom/google/android/gms/internal/cloudmessaging/zzb;

    .line 671
    .line 672
    .line 673
    new-instance v0, Lhl1;

    .line 674
    .line 675
    const-string v3, "pscm-ack-executor"

    .line 676
    .line 677
    invoke-direct {v0, v3}, Lhl1;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    new-instance v13, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 681
    .line 682
    sget-object v18, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 683
    .line 684
    new-instance v19, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 685
    .line 686
    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 687
    .line 688
    .line 689
    const/4 v14, 0x1

    .line 690
    const/4 v15, 0x1

    .line 691
    const-wide/16 v16, 0x3c

    .line 692
    .line 693
    move-object/from16 v20, v0

    .line 694
    .line 695
    invoke-direct/range {v13 .. v20}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v13, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 699
    .line 700
    .line 701
    invoke-static {v13}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    new-instance v0, Ljava/lang/ref/SoftReference;

    .line 706
    .line 707
    invoke-direct {v0, v3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    sput-object v0, Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;->b:Ljava/lang/ref/SoftReference;

    .line 711
    .line 712
    :cond_12
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 713
    :try_start_6
    new-instance v6, Ljs0;

    .line 714
    .line 715
    const/16 v10, 0x9

    .line 716
    .line 717
    const/4 v11, 0x0

    .line 718
    invoke-direct/range {v6 .. v11}, Ljs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 719
    .line 720
    .line 721
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/cloudmessaging/CloudMessagingReceiver;->a(Landroid/content/Context;Lcom/google/android/gms/cloudmessaging/CloudMessage;)I

    .line 725
    .line 726
    .line 727
    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 728
    :try_start_7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 729
    .line 730
    const-wide/16 v2, 0x3e8

    .line 731
    .line 732
    invoke-virtual {v9, v2, v3, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-nez v0, :cond_13

    .line 737
    .line 738
    const-string v0, "CloudMessagingReceiver"

    .line 739
    .line 740
    const-string v2, "Message ack timed out"

    .line 741
    .line 742
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 743
    .line 744
    .line 745
    goto :goto_b

    .line 746
    :catch_3
    move-exception v0

    .line 747
    :try_start_8
    const-string v2, "CloudMessagingReceiver"

    .line 748
    .line 749
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    const-string v3, "Message ack failed: "

    .line 754
    .line 755
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 760
    .line 761
    .line 762
    :cond_13
    :goto_b
    move v0, v1

    .line 763
    :goto_c
    if-eqz v5, :cond_14

    .line 764
    .line 765
    if-eqz v12, :cond_14

    .line 766
    .line 767
    invoke-virtual {v12, v0}, Landroid/content/BroadcastReceiver$PendingResult;->setResultCode(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 768
    .line 769
    .line 770
    :cond_14
    if-eqz v12, :cond_15

    .line 771
    .line 772
    invoke-virtual {v12}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 773
    .line 774
    .line 775
    :cond_15
    return-void

    .line 776
    :goto_d
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 777
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 778
    :goto_e
    if-eqz v12, :cond_16

    .line 779
    .line 780
    invoke-virtual {v12}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 781
    .line 782
    .line 783
    :cond_16
    throw v0

    .line 784
    :pswitch_4
    const-string v1, "push_token_synced"

    .line 785
    .line 786
    iget-object v3, v0, Lft0;->f:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v3, Lqi1;

    .line 789
    .line 790
    iget-object v3, v3, Lqi1;->e:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v3, Lwc0;

    .line 793
    .line 794
    iget-object v5, v0, Lft0;->e:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v5, Ler0;

    .line 797
    .line 798
    iget-object v5, v5, Ler0;->b:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v5, Lnm;

    .line 801
    .line 802
    iget-boolean v6, v0, Lft0;->b:Z

    .line 803
    .line 804
    :try_start_b
    iget-object v7, v0, Lft0;->c:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v7, Ld52;

    .line 807
    .line 808
    iget-object v0, v0, Lft0;->d:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v0, Lwc0;

    .line 811
    .line 812
    invoke-virtual {v7, v0}, Ld52;->E(Lwc0;)Ljj;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    if-eqz v6, :cond_17

    .line 817
    .line 818
    goto :goto_10

    .line 819
    :cond_17
    iget v0, v0, Ljj;->a:I

    .line 820
    .line 821
    const/16 v7, 0xc8

    .line 822
    .line 823
    if-lt v0, v7, :cond_18

    .line 824
    .line 825
    const/16 v7, 0x12c

    .line 826
    .line 827
    if-ge v0, v7, :cond_18

    .line 828
    .line 829
    goto :goto_f

    .line 830
    :cond_18
    move v2, v4

    .line 831
    :goto_f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-virtual {v5, v0, v1}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_b
    .catch Lgt0; {:try_start_b .. :try_end_b} :catch_4

    .line 836
    .line 837
    .line 838
    goto :goto_10

    .line 839
    :catch_4
    move-exception v0

    .line 840
    if-nez v6, :cond_1a

    .line 841
    .line 842
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 843
    .line 844
    invoke-virtual {v5, v2, v1}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    iget-object v0, v0, Lgt0;->c:Lym1;

    .line 848
    .line 849
    sget-object v1, Lym1;->v:Lym1;

    .line 850
    .line 851
    if-ne v0, v1, :cond_19

    .line 852
    .line 853
    const-string v0, "invalid user auth token"

    .line 854
    .line 855
    invoke-virtual {v3, v0}, Lwc0;->C(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    goto :goto_10

    .line 859
    :cond_19
    sget-object v1, Lym1;->i:Lym1;

    .line 860
    .line 861
    if-ne v0, v1, :cond_1b

    .line 862
    .line 863
    const-string v0, "missing user auth token"

    .line 864
    .line 865
    invoke-virtual {v3, v0}, Lwc0;->C(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    goto :goto_10

    .line 869
    :cond_1a
    const-string v1, "pshTknManagr"

    .line 870
    .line 871
    const-string v2, "Network error for deregister push token request"

    .line 872
    .line 873
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 874
    .line 875
    .line 876
    :cond_1b
    :goto_10
    return-void

    .line 877
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
