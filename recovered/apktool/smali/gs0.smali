.class public final Lgs0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Leq2;


# direct methods
.method public synthetic constructor <init>(Leq2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgs0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgs0;->b:Leq2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lgs0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "HSChatFragment"

    .line 8
    .line 9
    iget-object p0, p0, Lgs0;->b:Leq2;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Leq2;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lls0;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const-string v0, "Received onWebchatError event"

    .line 27
    .line 28
    invoke-static {v4, v0, v3}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lls0;->i:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lls0;->f:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object p0, p0, Leq2;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lls0;

    .line 55
    .line 56
    if-eqz p0, :cond_8

    .line 57
    .line 58
    const-string v5, "onWebchatLoaded"

    .line 59
    .line 60
    invoke-static {v4, v5, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lls0;->f:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Lls0;->i:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    const-string v4, "AppUtil"

    .line 80
    .line 81
    const-string v5, "Cancelling notification"

    .line 82
    .line 83
    invoke-static {v4, v5, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Lb40;->n(Landroid/content/Context;)Landroid/app/NotificationManager;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    const-string v4, "hsft_notification_tag"

    .line 93
    .line 94
    const/16 v5, 0x79

    .line 95
    .line 96
    invoke-virtual {v1, v4, v5}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    :cond_1
    sget-object v1, Lrs0;->y:Lrs0;

    .line 100
    .line 101
    iget-object v1, v1, Lrs0;->f:Lnm;

    .line 102
    .line 103
    const-string v4, "unread_count"

    .line 104
    .line 105
    invoke-virtual {v1, v0, v4}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object v1, Lrs0;->y:Lrs0;

    .line 109
    .line 110
    iget-object v1, v1, Lrs0;->f:Lnm;

    .line 111
    .line 112
    const-string v4, "push_unread_count"

    .line 113
    .line 114
    invoke-virtual {v1, v0, v4}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lrs0;->y:Lrs0;

    .line 118
    .line 119
    iget-object v0, v0, Lrs0;->w:Lll1;

    .line 120
    .line 121
    iget-object v1, v0, Lll1;->a:Landroid/content/SharedPreferences;

    .line 122
    .line 123
    const-string v4, "mig_log_synced_with_webchat"

    .line 124
    .line 125
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    const-string v5, ""

    .line 130
    .line 131
    if-eqz v4, :cond_2

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    const-string v4, "migration_state"

    .line 135
    .line 136
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    const/4 v6, 0x1

    .line 141
    if-eq v2, v6, :cond_5

    .line 142
    .line 143
    if-nez v2, :cond_3

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_3
    :try_start_0
    const-string v2, "error_logs"

    .line 147
    .line 148
    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_4

    .line 157
    .line 158
    const-string v1, "[]"

    .line 159
    .line 160
    :cond_4
    new-instance v2, Lorg/json/JSONArray;

    .line 161
    .line 162
    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v1, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v6, "FAILED"

    .line 171
    .line 172
    invoke-virtual {v1, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    const-string v4, "did"

    .line 176
    .line 177
    iget-object v0, v0, Lll1;->c:Ler0;

    .line 178
    .line 179
    const-string v6, "hs_did"

    .line 180
    .line 181
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Ler0;

    .line 184
    .line 185
    invoke-virtual {v0, v6}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    const-string v0, "logs"

    .line 193
    .line 194
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    goto :goto_0

    .line 202
    :catch_0
    const-string v0, "Helpshift_Migrator"

    .line 203
    .line 204
    const-string v1, "Error getting error logs for migration"

    .line 205
    .line 206
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    :cond_5
    :goto_0
    invoke-static {v5}, Lb40;->r(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_6

    .line 214
    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v1, "Helpshift(\'sdkxMigrationLog\', \'"

    .line 218
    .line 219
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v1, "\' ) "

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {p0, v0, v3}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 235
    .line 236
    .line 237
    :cond_6
    iget-boolean v0, p0, Lls0;->V:Z

    .line 238
    .line 239
    invoke-virtual {p0, v0}, Lls0;->h(Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 251
    .line 252
    invoke-virtual {p0, v0}, Lls0;->j(I)V

    .line 253
    .line 254
    .line 255
    sget-object v0, Lrs0;->y:Lrs0;

    .line 256
    .line 257
    iget-object v0, v0, Lrs0;->r:Lcb;

    .line 258
    .line 259
    invoke-virtual {v0}, Lcb;->A()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_7

    .line 264
    .line 265
    const-string v0, "online"

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_7
    const-string v0, "offline"

    .line 269
    .line 270
    :goto_1
    invoke-virtual {p0, v0}, Lls0;->i(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lls0;->U:Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {v0}, Lb40;->r(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_8

    .line 280
    .line 281
    iget-object v0, p0, Lls0;->U:Ljava/lang/String;

    .line 282
    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v2, "Helpshift(\'nativeLoadTime\',\'"

    .line 286
    .line 287
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string v0, "\');"

    .line 294
    .line 295
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {p0, v0, v3}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 303
    .line 304
    .line 305
    :cond_8
    return-void

    .line 306
    :pswitch_1
    iget-object p0, p0, Leq2;->i:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 309
    .line 310
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    check-cast p0, Lls0;

    .line 315
    .line 316
    if-eqz p0, :cond_9

    .line 317
    .line 318
    const-string v0, "onWebchatClosed"

    .line 319
    .line 320
    invoke-static {v4, v0, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 321
    .line 322
    .line 323
    iget-object p0, p0, Lls0;->w:Lcom/helpshift/activities/HSMainActivity;

    .line 324
    .line 325
    if-eqz p0, :cond_9

    .line 326
    .line 327
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->onBackPressed()V

    .line 328
    .line 329
    .line 330
    :cond_9
    return-void

    .line 331
    :pswitch_2
    iget-object p0, p0, Leq2;->c:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast p0, Lnm;

    .line 334
    .line 335
    iget-object p0, p0, Lnm;->a:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast p0, Ler0;

    .line 338
    .line 339
    iget-object v0, p0, Ler0;->b:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Ler0;

    .line 342
    .line 343
    const-string v1, "anon_user_id_map"

    .line 344
    .line 345
    invoke-virtual {v0, v1}, Ler0;->z(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-string v0, "anon_user_data"

    .line 349
    .line 350
    const-string v1, "{}"

    .line 351
    .line 352
    invoke-virtual {p0, v0, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_3
    iget-object p0, p0, Leq2;->c:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p0, Lnm;

    .line 359
    .line 360
    const-string v0, "push_token_synced"

    .line 361
    .line 362
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {p0, v1, v0}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :pswitch_4
    iget-object p0, p0, Leq2;->d:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast p0, Lnm;

    .line 371
    .line 372
    invoke-virtual {p0}, Lnm;->h()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {v0}, Lyy1;->m(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    iget-object v0, p0, Lnm;->f:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, Ler0;

    .line 382
    .line 383
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Landroid/content/SharedPreferences;

    .line 386
    .line 387
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 396
    .line 397
    .line 398
    iget-object p0, p0, Lnm;->h:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast p0, Ljava/util/HashMap;

    .line 401
    .line 402
    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :pswitch_5
    iget-object p0, p0, Leq2;->i:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 409
    .line 410
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    check-cast p0, Lls0;

    .line 415
    .line 416
    if-eqz p0, :cond_a

    .line 417
    .line 418
    const-string v0, "Received onUserAuthenticationFailure event"

    .line 419
    .line 420
    invoke-static {v4, v0, v3}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    iget-object v0, p0, Lls0;->i:Landroid/view/View;

    .line 424
    .line 425
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 426
    .line 427
    .line 428
    iget-object p0, p0, Lls0;->f:Landroid/view/View;

    .line 429
    .line 430
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 431
    .line 432
    .line 433
    :cond_a
    return-void

    .line 434
    nop

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
