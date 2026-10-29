.class public abstract Lb73;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final A:Lmg2;

.field public static final B:Lmg2;

.field public static final C:Lk9;

.field public static final D:Lz63;

.field public static final E:Lk9;

.field public static final F:Lk9;

.field public static final G:Lk9;

.field public static final H:Lk9;

.field public static final I:Lk9;

.field public static final J:Lk9;

.field public static final K:Lk9;

.field public static final L:Lk9;

.field public static final M:Lk9;

.field public static final N:Lk9;

.field public static final O:Lk9;

.field public static final a:Lk9;

.field public static final b:Lk9;

.field public static final c:Lk9;

.field public static final d:Lk9;

.field public static final e:Lk9;

.field public static final f:Lk9;

.field public static final g:Lk9;

.field public static final h:Lk9;

.field public static final i:Lk9;

.field public static final j:Lk9;

.field public static final k:Lk9;

.field public static final l:Lk9;

.field public static final m:Lk9;

.field public static final n:Lk9;

.field public static final o:Lk9;

.field public static final p:Lk9;

.field public static final q:Lk9;

.field public static final r:Lk9;

.field public static final s:Lk9;

.field public static final t:Lk9;

.field public static final u:Lk9;

.field public static final v:Lk9;

.field public static final w:Lk9;

.field public static final x:Lk9;

.field public static final y:Lk9;

.field public static final z:Lk9;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lk9;

    .line 2
    .line 3
    const-string v1, "VISUAL_STATE_CALLBACK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lk9;

    .line 10
    .line 11
    const-string v1, "OFF_SCREEN_PRERASTER"

    .line 12
    .line 13
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lb73;->a:Lk9;

    .line 17
    .line 18
    new-instance v0, Lk9;

    .line 19
    .line 20
    const-string v1, "SAFE_BROWSING_ENABLE"

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lb73;->b:Lk9;

    .line 27
    .line 28
    new-instance v0, Lk9;

    .line 29
    .line 30
    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lb73;->c:Lk9;

    .line 37
    .line 38
    new-instance v0, Lk9;

    .line 39
    .line 40
    const-string v1, "START_SAFE_BROWSING"

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lb73;->d:Lk9;

    .line 47
    .line 48
    new-instance v0, Lk9;

    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    const-string v2, "SAFE_BROWSING_WHITELIST"

    .line 52
    .line 53
    invoke-direct {v0, v1, v2, v2}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lk9;

    .line 57
    .line 58
    const-string v3, "SAFE_BROWSING_ALLOWLIST"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2, v3}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lk9;

    .line 64
    .line 65
    invoke-direct {v0, v1, v3, v2}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lb73;->e:Lk9;

    .line 69
    .line 70
    new-instance v0, Lk9;

    .line 71
    .line 72
    invoke-direct {v0, v1, v3, v3}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lb73;->f:Lk9;

    .line 76
    .line 77
    new-instance v0, Lk9;

    .line 78
    .line 79
    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Lb73;->g:Lk9;

    .line 86
    .line 87
    new-instance v0, Lk9;

    .line 88
    .line 89
    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lb73;->h:Lk9;

    .line 96
    .line 97
    new-instance v0, Lk9;

    .line 98
    .line 99
    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    .line 100
    .line 101
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sput-object v0, Lb73;->i:Lk9;

    .line 105
    .line 106
    new-instance v0, Lk9;

    .line 107
    .line 108
    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    .line 109
    .line 110
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Lb73;->j:Lk9;

    .line 114
    .line 115
    new-instance v0, Lk9;

    .line 116
    .line 117
    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    .line 118
    .line 119
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sput-object v0, Lb73;->k:Lk9;

    .line 123
    .line 124
    new-instance v0, Lk9;

    .line 125
    .line 126
    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    .line 127
    .line 128
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sput-object v0, Lb73;->l:Lk9;

    .line 132
    .line 133
    new-instance v0, Lk9;

    .line 134
    .line 135
    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    .line 136
    .line 137
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v0, Lk9;

    .line 141
    .line 142
    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Lk9;

    .line 149
    .line 150
    const-string v1, "RECEIVE_HTTP_ERROR"

    .line 151
    .line 152
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Lk9;

    .line 156
    .line 157
    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    .line 158
    .line 159
    const/4 v2, 0x1

    .line 160
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Lk9;

    .line 164
    .line 165
    const-string v1, "SAFE_BROWSING_HIT"

    .line 166
    .line 167
    const/4 v2, 0x4

    .line 168
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Lk9;

    .line 172
    .line 173
    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    .line 174
    .line 175
    const/4 v2, 0x1

    .line 176
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lb73;->m:Lk9;

    .line 180
    .line 181
    new-instance v0, Lk9;

    .line 182
    .line 183
    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    sput-object v0, Lb73;->n:Lk9;

    .line 190
    .line 191
    new-instance v0, Lk9;

    .line 192
    .line 193
    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    .line 194
    .line 195
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    sput-object v0, Lb73;->o:Lk9;

    .line 199
    .line 200
    new-instance v0, Lk9;

    .line 201
    .line 202
    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    .line 203
    .line 204
    const/4 v2, 0x4

    .line 205
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    sput-object v0, Lb73;->p:Lk9;

    .line 209
    .line 210
    new-instance v0, Lk9;

    .line 211
    .line 212
    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    .line 213
    .line 214
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    sput-object v0, Lb73;->q:Lk9;

    .line 218
    .line 219
    new-instance v0, Lk9;

    .line 220
    .line 221
    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    .line 222
    .line 223
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    sput-object v0, Lb73;->r:Lk9;

    .line 227
    .line 228
    new-instance v0, Lk9;

    .line 229
    .line 230
    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    .line 231
    .line 232
    const/4 v2, 0x0

    .line 233
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sput-object v0, Lb73;->s:Lk9;

    .line 237
    .line 238
    new-instance v0, Lk9;

    .line 239
    .line 240
    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    .line 241
    .line 242
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    sput-object v0, Lb73;->t:Lk9;

    .line 246
    .line 247
    new-instance v0, Lk9;

    .line 248
    .line 249
    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    .line 250
    .line 251
    const/4 v2, 0x2

    .line 252
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    sput-object v0, Lb73;->u:Lk9;

    .line 256
    .line 257
    new-instance v0, Lk9;

    .line 258
    .line 259
    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    .line 260
    .line 261
    const/4 v2, 0x0

    .line 262
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    sput-object v0, Lb73;->v:Lk9;

    .line 266
    .line 267
    new-instance v0, Lk9;

    .line 268
    .line 269
    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    .line 270
    .line 271
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    sput-object v0, Lb73;->w:Lk9;

    .line 275
    .line 276
    new-instance v0, Lk9;

    .line 277
    .line 278
    const-string v1, "POST_WEB_MESSAGE"

    .line 279
    .line 280
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    sput-object v0, Lb73;->x:Lk9;

    .line 284
    .line 285
    new-instance v0, Lk9;

    .line 286
    .line 287
    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    .line 288
    .line 289
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    new-instance v0, Lk9;

    .line 293
    .line 294
    const-string v1, "GET_WEB_VIEW_CLIENT"

    .line 295
    .line 296
    const/4 v2, 0x3

    .line 297
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    new-instance v0, Lk9;

    .line 301
    .line 302
    const-string v1, "GET_WEB_CHROME_CLIENT"

    .line 303
    .line 304
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    new-instance v0, Lk9;

    .line 308
    .line 309
    const-string v1, "GET_WEB_VIEW_RENDERER"

    .line 310
    .line 311
    const/4 v2, 0x6

    .line 312
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v0, Lk9;

    .line 316
    .line 317
    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    .line 318
    .line 319
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    sput-object v0, Lb73;->y:Lk9;

    .line 323
    .line 324
    new-instance v0, Lk9;

    .line 325
    .line 326
    const-string v1, "TRACING_CONTROLLER_BASIC_USAGE"

    .line 327
    .line 328
    const/4 v2, 0x5

    .line 329
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    sput-object v0, Lb73;->z:Lk9;

    .line 333
    .line 334
    new-instance v0, Lmg2;

    .line 335
    .line 336
    const-string v1, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX"

    .line 337
    .line 338
    const/4 v2, 0x1

    .line 339
    invoke-direct {v0, v2, v1, v1}, Lmg2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    sput-object v0, Lb73;->A:Lmg2;

    .line 343
    .line 344
    new-instance v0, Lmg2;

    .line 345
    .line 346
    const-string v1, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH"

    .line 347
    .line 348
    const/4 v2, 0x0

    .line 349
    const-string v3, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS"

    .line 350
    .line 351
    invoke-direct {v0, v2, v3, v1}, Lmg2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    sput-object v0, Lb73;->B:Lmg2;

    .line 355
    .line 356
    new-instance v0, Lk9;

    .line 357
    .line 358
    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    .line 359
    .line 360
    const/4 v2, 0x6

    .line 361
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    sput-object v0, Lb73;->C:Lk9;

    .line 365
    .line 366
    new-instance v0, Lz63;

    .line 367
    .line 368
    invoke-direct {v0}, Lz63;-><init>()V

    .line 369
    .line 370
    .line 371
    sput-object v0, Lb73;->D:Lz63;

    .line 372
    .line 373
    new-instance v0, Lk9;

    .line 374
    .line 375
    const-string v1, "PROXY_OVERRIDE:3"

    .line 376
    .line 377
    const/4 v2, 0x2

    .line 378
    const-string v3, "PROXY_OVERRIDE"

    .line 379
    .line 380
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    sput-object v0, Lb73;->E:Lk9;

    .line 384
    .line 385
    new-instance v0, Lk9;

    .line 386
    .line 387
    const-string v1, "MULTI_PROCESS_QUERY"

    .line 388
    .line 389
    const-string v3, "MULTI_PROCESS"

    .line 390
    .line 391
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    sput-object v0, Lb73;->F:Lk9;

    .line 395
    .line 396
    new-instance v0, Lk9;

    .line 397
    .line 398
    const-string v1, "FORCE_DARK"

    .line 399
    .line 400
    const/4 v2, 0x6

    .line 401
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    sput-object v0, Lb73;->G:Lk9;

    .line 405
    .line 406
    new-instance v0, Lk9;

    .line 407
    .line 408
    const-string v1, "FORCE_DARK_BEHAVIOR"

    .line 409
    .line 410
    const/4 v2, 0x2

    .line 411
    const-string v3, "FORCE_DARK_STRATEGY"

    .line 412
    .line 413
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    sput-object v0, Lb73;->H:Lk9;

    .line 417
    .line 418
    new-instance v0, Lk9;

    .line 419
    .line 420
    const-string v1, "WEB_MESSAGE_LISTENER"

    .line 421
    .line 422
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    sput-object v0, Lb73;->I:Lk9;

    .line 426
    .line 427
    new-instance v0, Lk9;

    .line 428
    .line 429
    const-string v1, "DOCUMENT_START_SCRIPT:1"

    .line 430
    .line 431
    const-string v3, "DOCUMENT_START_SCRIPT"

    .line 432
    .line 433
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    sput-object v0, Lb73;->J:Lk9;

    .line 437
    .line 438
    new-instance v0, Lk9;

    .line 439
    .line 440
    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    .line 441
    .line 442
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    sput-object v0, Lb73;->K:Lk9;

    .line 446
    .line 447
    new-instance v0, Lk9;

    .line 448
    .line 449
    const-string v1, "GET_VARIATIONS_HEADER"

    .line 450
    .line 451
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    sput-object v0, Lb73;->L:Lk9;

    .line 455
    .line 456
    new-instance v0, Lk9;

    .line 457
    .line 458
    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    .line 459
    .line 460
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    sput-object v0, Lb73;->M:Lk9;

    .line 464
    .line 465
    new-instance v0, Lk9;

    .line 466
    .line 467
    const-string v1, "GET_COOKIE_INFO"

    .line 468
    .line 469
    invoke-direct {v0, v2, v1, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    sput-object v0, Lb73;->N:Lk9;

    .line 473
    .line 474
    new-instance v0, Lk9;

    .line 475
    .line 476
    const-string v1, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    .line 477
    .line 478
    const-string v3, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    .line 479
    .line 480
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    sput-object v0, Lb73;->O:Lk9;

    .line 484
    .line 485
    new-instance v0, Lk9;

    .line 486
    .line 487
    const-string v1, "USER_AGENT_METADATA"

    .line 488
    .line 489
    const-string v3, "USER_AGENT_METADATA"

    .line 490
    .line 491
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    new-instance v0, La73;

    .line 495
    .line 496
    const-string v1, "MULTI_PROFILE"

    .line 497
    .line 498
    const-string v3, "MULTI_PROFILE"

    .line 499
    .line 500
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    new-instance v0, Lk9;

    .line 504
    .line 505
    const-string v1, "ATTRIBUTION_BEHAVIOR"

    .line 506
    .line 507
    const-string v3, "ATTRIBUTION_REGISTRATION_BEHAVIOR"

    .line 508
    .line 509
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    new-instance v0, Lk9;

    .line 513
    .line 514
    const-string v1, "WEBVIEW_INTEGRITY_API_STATUS"

    .line 515
    .line 516
    const-string v3, "WEBVIEW_MEDIA_INTEGRITY_API_STATUS"

    .line 517
    .line 518
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    new-instance v0, Lk9;

    .line 522
    .line 523
    const-string v1, "MUTE_AUDIO"

    .line 524
    .line 525
    const-string v3, "MUTE_AUDIO"

    .line 526
    .line 527
    invoke-direct {v0, v2, v3, v1}, Lk9;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    return-void
.end method

.method public static a()Ljava/lang/UnsupportedOperationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
