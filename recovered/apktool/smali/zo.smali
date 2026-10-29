.class public final synthetic Lzo;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 17
    iput p1, p0, Lzo;->a:I

    iput-object p2, p0, Lzo;->b:Ljava/lang/Object;

    iput-object p3, p0, Lzo;->c:Ljava/lang/Object;

    iput-object p4, p0, Lzo;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcb0;Lmb0;Lum;)V
    .locals 1

    .line 18
    const/4 v0, 0x6

    iput v0, p0, Lzo;->a:I

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo;->b:Ljava/lang/Object;

    iput-object p2, p0, Lzo;->c:Ljava/lang/Object;

    iput-object p3, p0, Lzo;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ln60;Lyg;Lf42;Lrf;)V
    .locals 0

    .line 16
    const/4 p3, 0x1

    iput p3, p0, Lzo;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo;->b:Ljava/lang/Object;

    iput-object p2, p0, Lzo;->c:Ljava/lang/Object;

    iput-object p4, p0, Lzo;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lx60;Lmb0;Lum;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lzo;->a:I

    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lzo;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lzo;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p3, p0, Lzo;->d:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lzo;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, ".scope-cache"

    .line 9
    .line 10
    iget-object v1, p0, Lzo;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lio/sentry/cache/f;

    .line 13
    .line 14
    iget-object v1, v1, Lio/sentry/cache/f;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 15
    .line 16
    iget-object v3, p0, Lzo;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lio/sentry/b7;

    .line 19
    .line 20
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lio/sentry/b4;

    .line 23
    .line 24
    const-string v4, "trace.json"

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, Lio/sentry/b4;->s:Lio/sentry/t3;

    .line 29
    .line 30
    new-instance v3, Lio/sentry/b7;

    .line 31
    .line 32
    iget-object v5, p0, Lio/sentry/t3;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, Lio/sentry/protocol/w;

    .line 35
    .line 36
    iget-object p0, p0, Lio/sentry/t3;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/sentry/d7;

    .line 39
    .line 40
    const-string v6, "default"

    .line 41
    .line 42
    invoke-direct {v3, v5, p0, v6, v2}, Lio/sentry/b7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Ljava/lang/String;Lio/sentry/d7;)V

    .line 43
    .line 44
    .line 45
    const-string p0, "auto"

    .line 46
    .line 47
    iput-object p0, v3, Lio/sentry/b7;->w:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v1, v3, v0, v4}, Lio/sentry/cache/a;->d(Lio/sentry/m6;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v1, v3, v0, v4}, Lio/sentry/cache/a;->d(Lio/sentry/m6;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :pswitch_0
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lio/sentry/android/ndk/b;

    .line 60
    .line 61
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, [B

    .line 64
    .line 65
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {v1, p0}, Lio/sentry/ndk/NativeScope;->nativeAddAttachmentBytes([BLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_1
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lcom/appsflyer/internal/AFj1sSDK;

    .line 81
    .line 82
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lcom/appsflyer/internal/AFi1aSDK;

    .line 85
    .line 86
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, Ljava/lang/Runnable;

    .line 89
    .line 90
    invoke-static {v0, v1, p0}, Lcom/appsflyer/internal/AFj1sSDK;->c(Lcom/appsflyer/internal/AFj1sSDK;Lcom/appsflyer/internal/AFi1aSDK;Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_2
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lcom/appsflyer/internal/AFd1wSDK;

    .line 97
    .line 98
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Throwable;

    .line 101
    .line 102
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0, v1, p0}, Lcom/appsflyer/internal/AFd1wSDK;->d(Lcom/appsflyer/internal/AFd1wSDK;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_3
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lcom/appsflyer/internal/AFa1ySDK;

    .line 113
    .line 114
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Landroid/content/Context;

    .line 117
    .line 118
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Landroid/content/Intent;

    .line 121
    .line 122
    invoke-static {v0, v1, p0}, Lcom/appsflyer/internal/AFa1ySDK;->h(Lcom/appsflyer/internal/AFa1ySDK;Landroid/content/Context;Landroid/content/Intent;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_4
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 129
    .line 130
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Ljava/lang/String;

    .line 133
    .line 134
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Ljava/lang/String;

    .line 137
    .line 138
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 139
    .line 140
    invoke-virtual {v0, v1, p0}, Lcom/supercell/titan/TitanWebView;->onReceivedError(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_5
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lcom/supercell/titan/TitanWebView;

    .line 147
    .line 148
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, Landroid/webkit/WebView;

    .line 151
    .line 152
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 157
    .line 158
    .line 159
    const-string v1, "Connection timed out"

    .line 160
    .line 161
    invoke-virtual {v0, p0, v1}, Lcom/supercell/titan/TitanWebView;->onReceivedError(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_6
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lcom/supercell/titan/TitanWebView;

    .line 168
    .line 169
    iget-object v2, p0, Lzo;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, [Ljava/lang/String;

    .line 172
    .line 173
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, Ljava/lang/String;

    .line 176
    .line 177
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 178
    .line 179
    if-nez v0, :cond_1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_1
    array-length v3, v2

    .line 183
    if-lez v3, :cond_3

    .line 184
    .line 185
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v3, v1}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v0, v1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 193
    .line 194
    .line 195
    array-length v0, v2

    .line 196
    const/4 v1, 0x0

    .line 197
    :goto_1
    if-ge v1, v0, :cond_2

    .line 198
    .line 199
    aget-object v4, v2, v1

    .line 200
    .line 201
    invoke-virtual {v3, p0, v4}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v1, v1, 0x1

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_2
    invoke-virtual {v3}, Landroid/webkit/CookieManager;->flush()V

    .line 208
    .line 209
    .line 210
    :cond_3
    :goto_2
    return-void

    .line 211
    :pswitch_7
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lac1;

    .line 214
    .line 215
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Llj2;

    .line 218
    .line 219
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, Ljava/util/Map$Entry;

    .line 222
    .line 223
    invoke-virtual {v0, v1, p0}, Lac1;->f(Llj2;Ljava/util/Map$Entry;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_8
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Lzr3;

    .line 230
    .line 231
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, Lhn;

    .line 234
    .line 235
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p0, Ls81;

    .line 238
    .line 239
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    iget-object v0, v0, Lzr3;->c:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Ljava/util/List;

    .line 245
    .line 246
    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_9
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 253
    .line 254
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v1, Landroid/view/WindowInsets;

    .line 257
    .line 258
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, Landroid/view/DisplayCutout;

    .line 261
    .line 262
    sget-object v2, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 263
    .line 264
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 265
    .line 266
    const/16 v3, 0x1e

    .line 267
    .line 268
    if-lt v2, v3, :cond_4

    .line 269
    .line 270
    invoke-static {}, Lw0;->D()I

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    invoke-static {}, Lk83;->n()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    or-int/2addr p0, v2

    .line 279
    invoke-static {v1, p0}, Lw0;->e(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-static {p0}, Lrw0;->A(Landroid/graphics/Insets;)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    iput v1, v0, Lcom/supercell/titan/GameApp;->U:I

    .line 288
    .line 289
    invoke-static {p0}, Lv0;->u(Landroid/graphics/Insets;)I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    iput v1, v0, Lcom/supercell/titan/GameApp;->w:I

    .line 294
    .line 295
    invoke-static {p0}, Ldt1;->b(Landroid/graphics/Insets;)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    iput v1, v0, Lcom/supercell/titan/GameApp;->i:I

    .line 300
    .line 301
    invoke-static {p0}, Lv0;->z(Landroid/graphics/Insets;)I

    .line 302
    .line 303
    .line 304
    move-result p0

    .line 305
    iput p0, v0, Lcom/supercell/titan/GameApp;->v:I

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_4
    if-eqz p0, :cond_5

    .line 309
    .line 310
    invoke-static {p0}, Lsk0;->y(Landroid/view/DisplayCutout;)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    iput v1, v0, Lcom/supercell/titan/GameApp;->U:I

    .line 315
    .line 316
    invoke-static {p0}, Lsk0;->C(Landroid/view/DisplayCutout;)I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    iput v1, v0, Lcom/supercell/titan/GameApp;->w:I

    .line 321
    .line 322
    invoke-static {p0}, Lsk0;->D(Landroid/view/DisplayCutout;)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    iput v1, v0, Lcom/supercell/titan/GameApp;->i:I

    .line 327
    .line 328
    invoke-static {p0}, Lsk0;->b(Landroid/view/DisplayCutout;)I

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    iput p0, v0, Lcom/supercell/titan/GameApp;->v:I

    .line 333
    .line 334
    :cond_5
    :goto_3
    invoke-virtual {v0}, Lcom/supercell/titan/GameApp;->setScaledSafeMargins()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_a
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lcom/google/firebase/messaging/EnhancedIntentService;

    .line 341
    .line 342
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v1, Landroid/content/Intent;

    .line 345
    .line 346
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 349
    .line 350
    sget v3, Lcom/google/firebase/messaging/EnhancedIntentService;->a:I

    .line 351
    .line 352
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/EnhancedIntentService;->handleIntent(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    .line 354
    .line 355
    invoke-virtual {p0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :catchall_0
    move-exception v0

    .line 360
    invoke-virtual {p0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    throw v0

    .line 364
    :pswitch_b
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, Ltd;

    .line 367
    .line 368
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v1, Lk50;

    .line 371
    .line 372
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast p0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 375
    .line 376
    :try_start_1
    iget-object v0, v0, Ltd;->a:Landroid/content/Context;

    .line 377
    .line 378
    invoke-static {v0}, Lpg3;->c(Landroid/content/Context;)Lml0;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    if-eqz v0, :cond_6

    .line 383
    .line 384
    iget-object v2, v0, Lpc0;->b:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v2, Lrc0;

    .line 387
    .line 388
    check-cast v2, Lll0;

    .line 389
    .line 390
    iget-object v3, v2, Lll0;->d:Ljava/lang/Object;

    .line 391
    .line 392
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 393
    :try_start_2
    iput-object p0, v2, Lll0;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 394
    .line 395
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 396
    :try_start_3
    iget-object v0, v0, Lpc0;->b:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v0, Lrc0;

    .line 399
    .line 400
    new-instance v2, Luc0;

    .line 401
    .line 402
    invoke-direct {v2, v1, p0}, Luc0;-><init>(Lk50;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 403
    .line 404
    .line 405
    invoke-interface {v0, v2}, Lrc0;->a(Lk50;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 406
    .line 407
    .line 408
    goto :goto_5

    .line 409
    :catchall_1
    move-exception v0

    .line 410
    goto :goto_4

    .line 411
    :catchall_2
    move-exception v0

    .line 412
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 413
    :try_start_5
    throw v0

    .line 414
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 415
    .line 416
    const-string v2, "EmojiCompat font provider not available on this device."

    .line 417
    .line 418
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 422
    :goto_4
    invoke-virtual {v1, v0}, Lk50;->C(Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 426
    .line 427
    .line 428
    :goto_5
    return-void

    .line 429
    :pswitch_c
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lcb0;

    .line 432
    .line 433
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v1, Ljava/lang/Runnable;

    .line 436
    .line 437
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast p0, Ljava/lang/Runnable;

    .line 440
    .line 441
    iget-boolean v0, v0, Lcb0;->f:Z

    .line 442
    .line 443
    if-eqz v0, :cond_7

    .line 444
    .line 445
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_7
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 450
    .line 451
    .line 452
    :goto_6
    return-void

    .line 453
    :pswitch_d
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lcb0;

    .line 456
    .line 457
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v1, Lmb0;

    .line 460
    .line 461
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 462
    .line 463
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast p0, Lum;

    .line 466
    .line 467
    :try_start_6
    iget-object v0, v0, Lcb0;->a:Lab0;

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Lab0;->e(Lmb0;)Luf;

    .line 470
    .line 471
    .line 472
    invoke-virtual {p0, v2}, Lum;->a(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    .line 473
    .line 474
    .line 475
    goto :goto_7

    .line 476
    :catch_0
    move-exception v0

    .line 477
    invoke-virtual {p0, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 478
    .line 479
    .line 480
    :goto_7
    return-void

    .line 481
    :pswitch_e
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Lx60;

    .line 484
    .line 485
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v1, Ljava/lang/Runnable;

    .line 488
    .line 489
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast p0, Ljava/lang/Runnable;

    .line 492
    .line 493
    iget-boolean v0, v0, Lx60;->j:Z

    .line 494
    .line 495
    if-eqz v0, :cond_8

    .line 496
    .line 497
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 498
    .line 499
    .line 500
    goto :goto_8

    .line 501
    :cond_8
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 502
    .line 503
    .line 504
    :goto_8
    return-void

    .line 505
    :pswitch_f
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Lx60;

    .line 508
    .line 509
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v1, Lmb0;

    .line 512
    .line 513
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 514
    .line 515
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p0, Lum;

    .line 518
    .line 519
    :try_start_7
    iget-object v0, v0, Lx60;->a:Ljq1;

    .line 520
    .line 521
    invoke-virtual {v0, v1}, Ljq1;->e(Lmb0;)Luf;

    .line 522
    .line 523
    .line 524
    invoke-virtual {p0, v2}, Lum;->a(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1

    .line 525
    .line 526
    .line 527
    goto :goto_9

    .line 528
    :catch_1
    move-exception v0

    .line 529
    invoke-virtual {p0, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 530
    .line 531
    .line 532
    :goto_9
    return-void

    .line 533
    :pswitch_10
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Landroidx/fragment/app/c0;

    .line 536
    .line 537
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v1, Landroidx/fragment/app/c0;

    .line 540
    .line 541
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast p0, Landroidx/fragment/app/g;

    .line 544
    .line 545
    iget-object v0, v0, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 546
    .line 547
    iget-object v1, v1, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 548
    .line 549
    iget-boolean p0, p0, Landroidx/fragment/app/g;->o:Z

    .line 550
    .line 551
    sget-object v2, Len0;->a:Ljn0;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    if-eqz p0, :cond_9

    .line 560
    .line 561
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lmd2;

    .line 562
    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lmd2;

    .line 566
    .line 567
    .line 568
    :goto_a
    return-void

    .line 569
    :pswitch_11
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Landroid/view/ViewGroup;

    .line 572
    .line 573
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v1, Landroid/view/View;

    .line 576
    .line 577
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast p0, Landroidx/fragment/app/c;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 585
    .line 586
    .line 587
    iget-object v0, p0, Landroidx/fragment/app/c;->c:Landroidx/fragment/app/d;

    .line 588
    .line 589
    iget-object v0, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 590
    .line 591
    invoke-virtual {v0, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :pswitch_12
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v0, Ln60;

    .line 598
    .line 599
    iget-object v2, p0, Lzo;->c:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v2, Lyg;

    .line 602
    .line 603
    iget-object v3, v2, Lyg;->a:Ljava/lang/String;

    .line 604
    .line 605
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast p0, Lrf;

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    sget-object v4, Ln60;->f:Ljava/util/logging/Logger;

    .line 613
    .line 614
    const-string v5, "Transport backend \'"

    .line 615
    .line 616
    :try_start_8
    iget-object v6, v0, Ln60;->c:Lei1;

    .line 617
    .line 618
    invoke-virtual {v6, v3}, Lei1;->a(Ljava/lang/String;)Lvr2;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    if-nez v6, :cond_a

    .line 623
    .line 624
    new-instance p0, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    invoke-direct {p0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    const-string v0, "\' is not registered"

    .line 633
    .line 634
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object p0

    .line 641
    invoke-virtual {v4, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 645
    .line 646
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    goto :goto_c

    .line 650
    :catch_2
    move-exception p0

    .line 651
    goto :goto_b

    .line 652
    :cond_a
    check-cast v6, Las;

    .line 653
    .line 654
    invoke-virtual {v6, p0}, Las;->a(Lrf;)Lrf;

    .line 655
    .line 656
    .line 657
    move-result-object p0

    .line 658
    iget-object v3, v0, Ln60;->e:Ls52;

    .line 659
    .line 660
    new-instance v5, Lpr;

    .line 661
    .line 662
    invoke-direct {v5, v1, v0, v2, p0}, Lpr;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v3, v5}, Ls52;->k(Lbk2;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 666
    .line 667
    .line 668
    goto :goto_c

    .line 669
    :goto_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 670
    .line 671
    const-string v1, "Error scheduling event "

    .line 672
    .line 673
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object p0

    .line 687
    invoke-virtual {v4, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    :goto_c
    return-void

    .line 691
    :pswitch_13
    iget-object v0, p0, Lzo;->b:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v0, Lap;

    .line 694
    .line 695
    iget-object v1, p0, Lzo;->c:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v1, Landroid/hardware/camera2/CameraCaptureSession;

    .line 698
    .line 699
    iget-object p0, p0, Lzo;->d:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast p0, Landroid/view/Surface;

    .line 702
    .line 703
    iget-object v0, v0, Lap;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 704
    .line 705
    invoke-virtual {v0, v1, p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onSurfacePrepared(Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
