.class public Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;
.super Lcom/pichillilorenzo/flutter_inappwebview_android/types/ChannelDelegateImpl;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private tracingControllerManager:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;Lio/flutter/plugin/common/MethodChannel;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/ChannelDelegateImpl;-><init>(Lio/flutter/plugin/common/MethodChannel;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;->tracingControllerManager:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/ChannelDelegateImpl;->dispose()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;->tracingControllerManager:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;

    .line 6
    .line 7
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->init()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->tracingController:Lrq2;

    .line 5
    .line 6
    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, -0x1

    .line 16
    sparse-switch v1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string v1, "start"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x2

    .line 30
    goto :goto_0

    .line 31
    :sswitch_1
    const-string v1, "stop"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x1

    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    const-string v1, "isTracing"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v2, 0x0

    .line 52
    :goto_0
    const-string v0, "TRACING_CONTROLLER_BASIC_USAGE"

    .line 53
    .line 54
    packed-switch v2, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_0
    if-eqz p0, :cond_8

    .line 62
    .line 63
    invoke-static {v0}, Lxe2;->x(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_8

    .line 68
    .line 69
    const-string v0, "settings"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Ljava/util/Map;

    .line 76
    .line 77
    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;

    .line 78
    .line 79
    invoke-direct {v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->buildTracingConfig(Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;)Lpq2;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p0, Lsq2;

    .line 90
    .line 91
    if-eqz p1, :cond_7

    .line 92
    .line 93
    sget-object v0, Lb73;->z:Lk9;

    .line 94
    .line 95
    invoke-virtual {v0}, Lk9;->a()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 102
    .line 103
    if-nez v0, :cond_3

    .line 104
    .line 105
    invoke-static {}, Lt9;->a()Landroid/webkit/TracingController;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 110
    .line 111
    :cond_3
    iget-object p0, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 112
    .line 113
    invoke-static {p0, p1}, Lt9;->f(Landroid/webkit/TracingController;Lpq2;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    invoke-virtual {v0}, Ll9;->b()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    iget-object v0, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 124
    .line 125
    if-nez v0, :cond_5

    .line 126
    .line 127
    sget-object v0, Ld73;->a:Le73;

    .line 128
    .line 129
    invoke-interface {v0}, Le73;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 134
    .line 135
    :cond_5
    iget-object p0, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 136
    .line 137
    iget v0, p1, Lpq2;->a:I

    .line 138
    .line 139
    iget-object v1, p1, Lpq2;->b:Ljava/util/ArrayList;

    .line 140
    .line 141
    iget p1, p1, Lpq2;->c:I

    .line 142
    .line 143
    invoke-interface {p0, v0, v1, p1}, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;->start(ILjava/util/Collection;I)V

    .line 144
    .line 145
    .line 146
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_6
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    throw p0

    .line 157
    :cond_7
    const-string p0, "Tracing config must be non null"

    .line 158
    .line 159
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_8
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_1
    if-eqz p0, :cond_e

    .line 170
    .line 171
    invoke-static {v0}, Lxe2;->x(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_e

    .line 176
    .line 177
    const-string v0, "filePath"

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Ljava/lang/String;

    .line 184
    .line 185
    if-eqz p1, :cond_9

    .line 186
    .line 187
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 188
    .line 189
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :catch_0
    move-exception p0

    .line 194
    goto :goto_4

    .line 195
    :cond_9
    const/4 v0, 0x0

    .line 196
    :goto_2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    check-cast p0, Lsq2;

    .line 201
    .line 202
    sget-object v1, Lb73;->z:Lk9;

    .line 203
    .line 204
    invoke-virtual {v1}, Lk9;->a()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_b

    .line 209
    .line 210
    iget-object v1, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 211
    .line 212
    if-nez v1, :cond_a

    .line 213
    .line 214
    invoke-static {}, Lt9;->a()Landroid/webkit/TracingController;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iput-object v1, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 219
    .line 220
    :cond_a
    iget-object p0, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 221
    .line 222
    invoke-static {p0, v0, p1}, Lt9;->g(Landroid/webkit/TracingController;Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    goto :goto_3

    .line 227
    :cond_b
    invoke-virtual {v1}, Ll9;->b()Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_d

    .line 232
    .line 233
    iget-object v1, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 234
    .line 235
    if-nez v1, :cond_c

    .line 236
    .line 237
    sget-object v1, Ld73;->a:Le73;

    .line 238
    .line 239
    invoke-interface {v1}, Le73;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    iput-object v1, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 244
    .line 245
    :cond_c
    iget-object p0, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 246
    .line 247
    invoke-interface {p0, v0, p1}, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;->stop(Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_d
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    throw p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 265
    .line 266
    .line 267
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_e
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_2
    if-eqz p0, :cond_13

    .line 280
    .line 281
    check-cast p0, Lsq2;

    .line 282
    .line 283
    sget-object p1, Lb73;->z:Lk9;

    .line 284
    .line 285
    invoke-virtual {p1}, Lk9;->a()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_10

    .line 290
    .line 291
    iget-object p1, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 292
    .line 293
    if-nez p1, :cond_f

    .line 294
    .line 295
    invoke-static {}, Lt9;->a()Landroid/webkit/TracingController;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iput-object p1, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 300
    .line 301
    :cond_f
    iget-object p0, p0, Lsq2;->a:Landroid/webkit/TracingController;

    .line 302
    .line 303
    invoke-static {p0}, Lt9;->d(Landroid/webkit/TracingController;)Z

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    goto :goto_5

    .line 308
    :cond_10
    invoke-virtual {p1}, Ll9;->b()Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-eqz p1, :cond_12

    .line 313
    .line 314
    iget-object p1, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 315
    .line 316
    if-nez p1, :cond_11

    .line 317
    .line 318
    sget-object p1, Ld73;->a:Le73;

    .line 319
    .line 320
    invoke-interface {p1}, Le73;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    iput-object p1, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 325
    .line 326
    :cond_11
    iget-object p0, p0, Lsq2;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 327
    .line 328
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;->isTracing()Z

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    :goto_5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :cond_12
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    throw p0

    .line 345
    :cond_13
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 346
    .line 347
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :sswitch_data_0
    .sparse-switch
        -0x622de7c8 -> :sswitch_2
        0x360802 -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
