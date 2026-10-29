.class public final Lye;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lye;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lye;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, Lye;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Ly92;

    .line 6
    .line 7
    iget-object v2, v2, Ly92;->a:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, Lye;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ly92;

    .line 16
    .line 17
    iget v4, v0, Ly92;->d:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, Ly92;->e:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, Ly92;->e:J

    .line 41
    .line 42
    iput v5, v0, Ly92;->d:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, Lye;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ly92;

    .line 48
    .line 49
    iget-object v4, v4, Ly92;->a:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    iget-object p0, p0, Lye;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Ly92;

    .line 62
    .line 63
    iput v3, p0, Ly92;->d:I

    .line 64
    .line 65
    monitor-exit v2

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_2
    return-void

    .line 70
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 72
    .line 73
    .line 74
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    or-int/2addr v1, v2

    .line 76
    :try_start_4
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    goto :goto_4

    .line 82
    :catch_0
    move-exception v2

    .line 83
    :try_start_5
    const-string v3, "SequentialExecutor"

    .line 84
    .line 85
    new-instance v5, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v6, "Exception while executing runnable "

    .line 91
    .line 92
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v3, v4, v2}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :goto_3
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 107
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 108
    :goto_4
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 115
    .line 116
    .line 117
    :cond_4
    throw p0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lye;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    const/16 v6, 0x12c

    .line 10
    .line 11
    const/16 v7, 0xc8

    .line 12
    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "input_method"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 35
    .line 36
    invoke-virtual {v1, v0, v11}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 43
    .line 44
    invoke-virtual {v0, v10}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->p()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lj33;

    .line 54
    .line 55
    invoke-virtual {v0, v10}, Lj33;->r(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lnm;

    .line 62
    .line 63
    iget-object v1, v0, Lnm;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Liy;

    .line 66
    .line 67
    invoke-virtual {v1}, Liy;->h()I

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lnm;->p()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget-object v1, v0, Lnm;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Ler0;

    .line 80
    .line 81
    invoke-virtual {v1}, Ler0;->m()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_1

    .line 90
    .line 91
    iget-object v0, v0, Lnm;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lcb;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcb;->K()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    iget-object v2, v0, Lnm;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Lqi1;

    .line 102
    .line 103
    invoke-virtual {v0}, Lnm;->e()Ljava/util/HashMap;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    new-instance v4, Ler0;

    .line 108
    .line 109
    const/16 v5, 0x16

    .line 110
    .line 111
    invoke-direct {v4, v0, v5}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v1, v3, v10, v4}, Lqi1;->i(Ljava/lang/String;Ljava/util/HashMap;ZLer0;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    return-void

    .line 118
    :pswitch_3
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Lxp2;

    .line 121
    .line 122
    iget-object v1, v0, Lxp2;->b:Landroid/view/Window$Callback;

    .line 123
    .line 124
    invoke-virtual {v0}, Lxp2;->v()Landroid/view/Menu;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    instance-of v2, v0, Ljg1;

    .line 129
    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    move-object v2, v0

    .line 133
    check-cast v2, Ljg1;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    move-object v2, v9

    .line 137
    :goto_1
    if-eqz v2, :cond_3

    .line 138
    .line 139
    invoke-virtual {v2}, Ljg1;->y()V

    .line 140
    .line 141
    .line 142
    :cond_3
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 143
    .line 144
    .line 145
    invoke-interface {v1, v10, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_4

    .line 150
    .line 151
    invoke-interface {v1, v10, v9, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_5

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :catchall_0
    move-exception v0

    .line 159
    goto :goto_3

    .line 160
    :cond_4
    :goto_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    .line 163
    :cond_5
    if-eqz v2, :cond_6

    .line 164
    .line 165
    invoke-virtual {v2}, Ljg1;->x()V

    .line 166
    .line 167
    .line 168
    :cond_6
    return-void

    .line 169
    :goto_3
    if-eqz v2, :cond_7

    .line 170
    .line 171
    invoke-virtual {v2}, Ljg1;->x()V

    .line 172
    .line 173
    .line 174
    :cond_7
    throw v0

    .line 175
    :pswitch_4
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_5
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L0()Z

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_6
    :try_start_1
    invoke-virtual {v1}, Lye;->a()V
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :catch_0
    move-exception v0

    .line 196
    iget-object v2, v1, Lye;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Ly92;

    .line 199
    .line 200
    iget-object v2, v2, Ly92;->a:Ljava/util/ArrayDeque;

    .line 201
    .line 202
    monitor-enter v2

    .line 203
    :try_start_2
    iget-object v1, v1, Lye;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, Ly92;

    .line 206
    .line 207
    iput v11, v1, Ly92;->d:I

    .line 208
    .line 209
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 210
    throw v0

    .line 211
    :catchall_1
    move-exception v0

    .line 212
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 213
    throw v0

    .line 214
    :pswitch_7
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lb5;

    .line 217
    .line 218
    :try_start_4
    iget-object v1, v0, Lb5;->c:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Liy;

    .line 221
    .line 222
    invoke-virtual {v1}, Liy;->h()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-lt v1, v7, :cond_8

    .line 227
    .line 228
    if-ge v1, v6, :cond_8

    .line 229
    .line 230
    move v10, v11

    .line 231
    :cond_8
    new-instance v1, Ljava/util/HashMap;

    .line 232
    .line 233
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v2, "count"

    .line 237
    .line 238
    iget-object v3, v0, Lb5;->d:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v3, Lnm;

    .line 241
    .line 242
    invoke-virtual {v3}, Lnm;->i()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    const-string v2, "fromCache"

    .line 254
    .line 255
    xor-int/lit8 v3, v10, 0x1

    .line 256
    .line 257
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    iget-object v0, v0, Lb5;->e:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, Lwc0;

    .line 267
    .line 268
    const-string v2, "receivedUnreadMessageCount"

    .line 269
    .line 270
    invoke-virtual {v0, v2, v1}, Lwc0;->D(Ljava/lang/String;Ljava/util/HashMap;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :catch_1
    move-exception v0

    .line 275
    const-string v1, "rqUnrdCntHdlr"

    .line 276
    .line 277
    const-string v2, "Error in fetching unread count from remote"

    .line 278
    .line 279
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 280
    .line 281
    .line 282
    :goto_4
    return-void

    .line 283
    :pswitch_8
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, Ljava/util/Map;

    .line 286
    .line 287
    invoke-static {v0}, Lhu0;->k0(Ljava/util/Map;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :pswitch_9
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Ljt1;

    .line 294
    .line 295
    iget-object v1, v0, Ljt1;->a:Liy;

    .line 296
    .line 297
    invoke-virtual {v1}, Liy;->h()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-virtual {v0, v1}, Ljt1;->a(I)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_a
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 308
    .line 309
    iget-object v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 310
    .line 311
    invoke-virtual {v0}, Lfk1;->a()V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_b
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, Landroid/view/ViewGroup;

    .line 318
    .line 319
    invoke-virtual {v0, v11}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :pswitch_c
    const-string v0, "domain"

    .line 324
    .line 325
    const-string v2, ""

    .line 326
    .line 327
    const-string v3, "failure_logs"

    .line 328
    .line 329
    iget-object v1, v1, Lye;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, Lwi1;

    .line 332
    .line 333
    iget-object v4, v1, Lwi1;->a:Landroid/content/SharedPreferences;

    .line 334
    .line 335
    iget-object v5, v1, Lwi1;->c:Ler0;

    .line 336
    .line 337
    iget-object v8, v1, Lwi1;->d:Lcb;

    .line 338
    .line 339
    :try_start_5
    sget-object v9, Lwi1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 340
    .line 341
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 342
    .line 343
    .line 344
    move-result v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 345
    if-eqz v12, :cond_9

    .line 346
    .line 347
    :goto_5
    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_9

    .line 351
    .line 352
    :cond_9
    :try_start_6
    invoke-virtual {v9, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v12

    .line 359
    invoke-static {v12}, Lb40;->p(Ljava/lang/String;)Z

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    if-eqz v13, :cond_a

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_a
    new-instance v13, Lorg/json/JSONObject;

    .line 367
    .line 368
    invoke-direct {v13, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    new-instance v12, Lorg/json/JSONArray;

    .line 372
    .line 373
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8}, Lcb;->o()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v13

    .line 383
    invoke-virtual {v8}, Lcb;->p()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    new-instance v15, Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 390
    .line 391
    .line 392
    new-instance v10, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    iget-object v6, v5, Ler0;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v6, Ler0;

    .line 400
    .line 401
    invoke-virtual {v6, v0}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    const-string v6, "."

    .line 409
    .line 410
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string v6, "host"

    .line 414
    .line 415
    iget-object v7, v5, Ler0;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v7, Ler0;

    .line 418
    .line 419
    invoke-virtual {v7, v6}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    new-instance v7, Lorg/json/JSONObject;

    .line 431
    .line 432
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    const-string v0, "dm"

    .line 443
    .line 444
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 448
    .line 449
    new-instance v7, Lorg/json/JSONObject;

    .line 450
    .line 451
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    const-string v0, "did"

    .line 462
    .line 463
    invoke-virtual {v8}, Lcb;->v()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    new-instance v7, Lorg/json/JSONObject;

    .line 468
    .line 469
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    const-string v0, "os"

    .line 480
    .line 481
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 485
    .line 486
    new-instance v7, Lorg/json/JSONObject;

    .line 487
    .line 488
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    invoke-static {v13}, Lb40;->p(Ljava/lang/String;)Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-nez v0, :cond_b

    .line 503
    .line 504
    const-string v0, "an"

    .line 505
    .line 506
    new-instance v6, Lorg/json/JSONObject;

    .line 507
    .line 508
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    goto :goto_6

    .line 519
    :catchall_2
    move-exception v0

    .line 520
    const/4 v1, 0x0

    .line 521
    goto/16 :goto_a

    .line 522
    .line 523
    :catch_2
    move-exception v0

    .line 524
    goto/16 :goto_8

    .line 525
    .line 526
    :cond_b
    :goto_6
    invoke-static {v14}, Lb40;->p(Ljava/lang/String;)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-nez v0, :cond_c

    .line 531
    .line 532
    const-string v0, "av"

    .line 533
    .line 534
    new-instance v6, Lorg/json/JSONObject;

    .line 535
    .line 536
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v6, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    :cond_c
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-nez v0, :cond_d

    .line 551
    .line 552
    new-instance v0, Lorg/json/JSONArray;

    .line 553
    .line 554
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 555
    .line 556
    .line 557
    goto :goto_7

    .line 558
    :cond_d
    new-instance v0, Lorg/json/JSONArray;

    .line 559
    .line 560
    invoke-direct {v0, v15}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 561
    .line 562
    .line 563
    :goto_7
    new-instance v6, Ljava/util/HashMap;

    .line 564
    .line 565
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 566
    .line 567
    .line 568
    const-string v7, "id"

    .line 569
    .line 570
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v10

    .line 578
    invoke-virtual {v6, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    const-string v7, "v"

    .line 582
    .line 583
    const-string v10, "1"

    .line 584
    .line 585
    invoke-virtual {v6, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    new-instance v7, Ljava/text/SimpleDateFormat;

    .line 589
    .line 590
    const-string v10, "dd/MM/yyyy HH:mm:ss"

    .line 591
    .line 592
    sget-object v13, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 593
    .line 594
    invoke-direct {v7, v10, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 595
    .line 596
    .line 597
    const-string v10, "UTC"

    .line 598
    .line 599
    invoke-static {v10}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 600
    .line 601
    .line 602
    move-result-object v10

    .line 603
    invoke-virtual {v7, v10}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 604
    .line 605
    .line 606
    const-string v10, "ctime"

    .line 607
    .line 608
    new-instance v13, Ljava/util/Date;

    .line 609
    .line 610
    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v7, v13}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    invoke-virtual {v6, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    const-string v7, "src"

    .line 621
    .line 622
    const-string v10, "sdkx.android.10.2.0"

    .line 623
    .line 624
    invoke-virtual {v6, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    const-string v7, "logs"

    .line 628
    .line 629
    invoke-virtual {v12}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v10

    .line 633
    invoke-virtual {v6, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    const-string v7, "md"

    .line 637
    .line 638
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v6, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    const-string v0, "platform-id"

    .line 646
    .line 647
    invoke-virtual {v5}, Ler0;->q()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v7

    .line 651
    invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    new-instance v0, Lwc0;

    .line 655
    .line 656
    invoke-virtual {v5}, Ler0;->q()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-static {v8, v5}, Ljb1;->j(Lcb;Ljava/lang/String;)Ljava/util/HashMap;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    const/16 v7, 0xd

    .line 665
    .line 666
    invoke-direct {v0, v7, v5, v6}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    new-instance v5, Llp0;

    .line 670
    .line 671
    iget-object v6, v1, Lwi1;->b:Lec0;

    .line 672
    .line 673
    invoke-static {v1}, Lwi1;->a(Lwi1;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-direct {v5, v6, v1, v11}, Llp0;-><init>(Lec0;Ljava/lang/String;I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5, v0}, Lta;->l(Lwc0;)Ljj;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    iget v0, v0, Ljj;->a:I

    .line 685
    .line 686
    const/16 v1, 0xc8

    .line 687
    .line 688
    if-lt v0, v1, :cond_e

    .line 689
    .line 690
    const/16 v1, 0x12c

    .line 691
    .line 692
    if-ge v0, v1, :cond_e

    .line 693
    .line 694
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    const-string v1, "failure_logs_synced"

    .line 699
    .line 700
    invoke-interface {v0, v1, v11}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 705
    .line 706
    .line 707
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 716
    .line 717
    .line 718
    :cond_e
    const/4 v1, 0x0

    .line 719
    invoke-virtual {v9, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 720
    .line 721
    .line 722
    goto :goto_9

    .line 723
    :goto_8
    :try_start_7
    const-string v1, "MgrFailLog"

    .line 724
    .line 725
    const-string v2, "Migration failure logs synced failed"

    .line 726
    .line 727
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 728
    .line 729
    .line 730
    sget-object v0, Lwi1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 731
    .line 732
    const/4 v1, 0x0

    .line 733
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 734
    .line 735
    .line 736
    :goto_9
    return-void

    .line 737
    :goto_a
    sget-object v2, Lwi1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 738
    .line 739
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 740
    .line 741
    .line 742
    throw v0

    .line 743
    :pswitch_d
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, La91;

    .line 746
    .line 747
    iget-object v2, v0, La91;->a:Ljava/lang/Object;

    .line 748
    .line 749
    monitor-enter v2

    .line 750
    :try_start_8
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v0, La91;

    .line 753
    .line 754
    iget-object v0, v0, La91;->f:Ljava/lang/Object;

    .line 755
    .line 756
    iget-object v3, v1, Lye;->b:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v3, La91;

    .line 759
    .line 760
    sget-object v4, La91;->k:Ljava/lang/Object;

    .line 761
    .line 762
    iput-object v4, v3, La91;->f:Ljava/lang/Object;

    .line 763
    .line 764
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 765
    iget-object v1, v1, Lye;->b:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v1, La91;

    .line 768
    .line 769
    invoke-virtual {v1, v0}, La91;->j(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    return-void

    .line 773
    :catchall_3
    move-exception v0

    .line 774
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 775
    throw v0

    .line 776
    :pswitch_e
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, Lf81;

    .line 779
    .line 780
    iput-object v9, v0, Lf81;->b:Ljava/util/ArrayList;

    .line 781
    .line 782
    iput-object v9, v0, Lf81;->a:Ljava/util/ArrayList;

    .line 783
    .line 784
    return-void

    .line 785
    :pswitch_f
    sget-object v0, Lrs0;->y:Lrs0;

    .line 786
    .line 787
    iget-object v0, v0, Lrs0;->q:Lwc0;

    .line 788
    .line 789
    iget-object v1, v1, Lye;->b:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v1, Lec0;

    .line 792
    .line 793
    iput-object v1, v0, Lwc0;->b:Ljava/lang/Object;

    .line 794
    .line 795
    return-void

    .line 796
    :pswitch_10
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v0, Lrs0;

    .line 799
    .line 800
    iget-object v0, v0, Lrs0;->u:Lb5;

    .line 801
    .line 802
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 806
    .line 807
    .line 808
    move-result-wide v1

    .line 809
    iget-object v3, v0, Lb5;->b:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v3, Ler0;

    .line 812
    .line 813
    const-string v6, "last_unread_count_api_access"

    .line 814
    .line 815
    iget-object v7, v3, Ler0;->b:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v7, Ler0;

    .line 818
    .line 819
    invoke-virtual {v7, v6}, Ler0;->p(Ljava/lang/String;)J

    .line 820
    .line 821
    .line 822
    move-result-wide v7

    .line 823
    iget-object v10, v0, Lb5;->d:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast v10, Lnm;

    .line 826
    .line 827
    invoke-virtual {v10}, Lnm;->p()Z

    .line 828
    .line 829
    .line 830
    move-result v10

    .line 831
    if-eqz v10, :cond_f

    .line 832
    .line 833
    const v10, 0xea60

    .line 834
    .line 835
    .line 836
    goto :goto_b

    .line 837
    :cond_f
    const v10, 0x493e0

    .line 838
    .line 839
    .line 840
    :goto_b
    cmp-long v4, v7, v4

    .line 841
    .line 842
    if-eqz v4, :cond_10

    .line 843
    .line 844
    sub-long v4, v1, v7

    .line 845
    .line 846
    int-to-long v7, v10

    .line 847
    cmp-long v4, v4, v7

    .line 848
    .line 849
    if-gez v4, :cond_10

    .line 850
    .line 851
    const-string v1, "rqUnrdCntHdlr"

    .line 852
    .line 853
    const-string v2, "Serving count from local cache."

    .line 854
    .line 855
    invoke-static {v1, v2, v9}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 856
    .line 857
    .line 858
    new-instance v1, Ljava/util/HashMap;

    .line 859
    .line 860
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 861
    .line 862
    .line 863
    iget-object v2, v0, Lb5;->d:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v2, Lnm;

    .line 866
    .line 867
    invoke-virtual {v2}, Lnm;->i()I

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    const-string v4, "push_unread_count"

    .line 872
    .line 873
    const/16 v16, 0x0

    .line 874
    .line 875
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 876
    .line 877
    .line 878
    move-result-object v5

    .line 879
    invoke-virtual {v2, v5, v4}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    check-cast v2, Ljava/lang/Integer;

    .line 884
    .line 885
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    const-string v3, "count"

    .line 894
    .line 895
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    const-string v2, "fromCache"

    .line 903
    .line 904
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 905
    .line 906
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    iget-object v0, v0, Lb5;->e:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v0, Lwc0;

    .line 912
    .line 913
    const-string v2, "receivedUnreadMessageCount"

    .line 914
    .line 915
    invoke-virtual {v0, v2, v1}, Lwc0;->D(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 916
    .line 917
    .line 918
    goto :goto_c

    .line 919
    :cond_10
    iget-object v3, v3, Ler0;->b:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v3, Ler0;

    .line 922
    .line 923
    iget-object v3, v3, Ler0;->b:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast v3, Landroid/content/SharedPreferences;

    .line 926
    .line 927
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    invoke-interface {v3, v6, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 932
    .line 933
    .line 934
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 935
    .line 936
    .line 937
    move-result v1

    .line 938
    if-nez v1, :cond_11

    .line 939
    .line 940
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 941
    .line 942
    .line 943
    :cond_11
    const-string v1, "rqUnrdCntHdlr"

    .line 944
    .line 945
    const-string v2, "Fetching unread count from remote."

    .line 946
    .line 947
    invoke-static {v1, v2, v9}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 948
    .line 949
    .line 950
    iget-object v1, v0, Lb5;->f:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v1, Lra2;

    .line 953
    .line 954
    iget-object v1, v1, Lra2;->a:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v1, Lfs0;

    .line 957
    .line 958
    new-instance v2, Lye;

    .line 959
    .line 960
    const/16 v3, 0x15

    .line 961
    .line 962
    invoke-direct {v2, v0, v3}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v1, v2}, Lfs0;->w(Ljava/lang/Runnable;)V

    .line 966
    .line 967
    .line 968
    :goto_c
    return-void

    .line 969
    :pswitch_11
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v0, Lec;

    .line 972
    .line 973
    iget-object v1, v0, Lec;->d:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v1, Lmt0;

    .line 976
    .line 977
    iget-object v2, v1, Lmt0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 978
    .line 979
    invoke-virtual {v2, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    if-eqz v2, :cond_12

    .line 984
    .line 985
    iget-object v0, v0, Lec;->b:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v0, Landroid/os/Handler;

    .line 988
    .line 989
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 990
    .line 991
    .line 992
    :cond_12
    return-void

    .line 993
    :pswitch_12
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v0, Ls81;

    .line 996
    .line 997
    invoke-interface {v0, v11}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 998
    .line 999
    .line 1000
    return-void

    .line 1001
    :pswitch_13
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, Landroidx/fragment/app/w;

    .line 1004
    .line 1005
    invoke-virtual {v0, v11}, Landroidx/fragment/app/w;->z(Z)Z

    .line 1006
    .line 1007
    .line 1008
    return-void

    .line 1009
    :pswitch_14
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v0, Landroidx/fragment/app/h;

    .line 1012
    .line 1013
    iget-object v1, v0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 1014
    .line 1015
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    if-nez v1, :cond_13

    .line 1020
    .line 1021
    invoke-virtual {v0}, Landroidx/fragment/app/h;->e()V

    .line 1022
    .line 1023
    .line 1024
    :cond_13
    return-void

    .line 1025
    :pswitch_15
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v0, Lah0;

    .line 1028
    .line 1029
    iget-object v1, v0, Lah0;->z:Landroid/animation/ValueAnimator;

    .line 1030
    .line 1031
    iget v4, v0, Lah0;->A:I

    .line 1032
    .line 1033
    if-eq v4, v11, :cond_14

    .line 1034
    .line 1035
    if-eq v4, v8, :cond_15

    .line 1036
    .line 1037
    goto :goto_d

    .line 1038
    :cond_14
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1039
    .line 1040
    .line 1041
    :cond_15
    iput v3, v0, Lah0;->A:I

    .line 1042
    .line 1043
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    check-cast v0, Ljava/lang/Float;

    .line 1048
    .line 1049
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1050
    .line 1051
    .line 1052
    move-result v0

    .line 1053
    new-array v3, v8, [F

    .line 1054
    .line 1055
    const/16 v16, 0x0

    .line 1056
    .line 1057
    aput v0, v3, v16

    .line 1058
    .line 1059
    aput v2, v3, v11

    .line 1060
    .line 1061
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 1062
    .line 1063
    .line 1064
    const-wide/16 v2, 0x1f4

    .line 1065
    .line 1066
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 1070
    .line 1071
    .line 1072
    :goto_d
    return-void

    .line 1073
    :pswitch_16
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v0, Lra0;

    .line 1076
    .line 1077
    iput-object v9, v0, Lra0;->W:Lye;

    .line 1078
    .line 1079
    invoke-virtual {v0}, Lra0;->drawableStateChanged()V

    .line 1080
    .line 1081
    .line 1082
    return-void

    .line 1083
    :pswitch_17
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v0, Landroidx/drawerlayout/widget/b;

    .line 1086
    .line 1087
    iget-object v1, v0, Landroidx/drawerlayout/widget/b;->h:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 1088
    .line 1089
    iget-object v2, v0, Landroidx/drawerlayout/widget/b;->f:Lj33;

    .line 1090
    .line 1091
    iget v2, v2, Lj33;->o:I

    .line 1092
    .line 1093
    iget v4, v0, Landroidx/drawerlayout/widget/b;->e:I

    .line 1094
    .line 1095
    if-ne v4, v3, :cond_16

    .line 1096
    .line 1097
    move v5, v11

    .line 1098
    goto :goto_e

    .line 1099
    :cond_16
    const/4 v5, 0x0

    .line 1100
    :goto_e
    const/4 v6, 0x5

    .line 1101
    if-eqz v5, :cond_18

    .line 1102
    .line 1103
    invoke-virtual {v1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)Landroid/view/View;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v7

    .line 1107
    if-eqz v7, :cond_17

    .line 1108
    .line 1109
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 1110
    .line 1111
    .line 1112
    move-result v8

    .line 1113
    neg-int v8, v8

    .line 1114
    goto :goto_f

    .line 1115
    :cond_17
    const/4 v8, 0x0

    .line 1116
    :goto_f
    add-int/2addr v8, v2

    .line 1117
    goto :goto_10

    .line 1118
    :cond_18
    invoke-virtual {v1, v6}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)Landroid/view/View;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v7

    .line 1122
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 1123
    .line 1124
    .line 1125
    move-result v8

    .line 1126
    sub-int/2addr v8, v2

    .line 1127
    :goto_10
    if-eqz v7, :cond_1e

    .line 1128
    .line 1129
    if-eqz v5, :cond_19

    .line 1130
    .line 1131
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 1132
    .line 1133
    .line 1134
    move-result v2

    .line 1135
    if-lt v2, v8, :cond_1a

    .line 1136
    .line 1137
    :cond_19
    if-nez v5, :cond_1e

    .line 1138
    .line 1139
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 1140
    .line 1141
    .line 1142
    move-result v2

    .line 1143
    if-le v2, v8, :cond_1e

    .line 1144
    .line 1145
    :cond_1a
    invoke-virtual {v1, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->f(Landroid/view/View;)I

    .line 1146
    .line 1147
    .line 1148
    move-result v2

    .line 1149
    if-nez v2, :cond_1e

    .line 1150
    .line 1151
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    check-cast v2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1156
    .line 1157
    iget-object v0, v0, Landroidx/drawerlayout/widget/b;->f:Lj33;

    .line 1158
    .line 1159
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 1160
    .line 1161
    .line 1162
    move-result v5

    .line 1163
    invoke-virtual {v0, v7, v8, v5}, Lj33;->u(Landroid/view/View;II)Z

    .line 1164
    .line 1165
    .line 1166
    iput-boolean v11, v2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->c:Z

    .line 1167
    .line 1168
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 1169
    .line 1170
    .line 1171
    if-ne v4, v3, :cond_1b

    .line 1172
    .line 1173
    move v3, v6

    .line 1174
    :cond_1b
    invoke-virtual {v1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)Landroid/view/View;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    if-eqz v0, :cond_1c

    .line 1179
    .line 1180
    invoke-virtual {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->b(Landroid/view/View;)V

    .line 1181
    .line 1182
    .line 1183
    :cond_1c
    iget-boolean v0, v1, Landroidx/drawerlayout/widget/DrawerLayout;->e0:Z

    .line 1184
    .line 1185
    if-nez v0, :cond_1e

    .line 1186
    .line 1187
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1188
    .line 1189
    .line 1190
    move-result-wide v2

    .line 1191
    const/4 v8, 0x0

    .line 1192
    const/4 v9, 0x0

    .line 1193
    const/4 v6, 0x3

    .line 1194
    const/4 v7, 0x0

    .line 1195
    move-wide v4, v2

    .line 1196
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1201
    .line 1202
    .line 1203
    move-result v2

    .line 1204
    const/4 v10, 0x0

    .line 1205
    :goto_11
    if-ge v10, v2, :cond_1d

    .line 1206
    .line 1207
    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v3

    .line 1211
    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1212
    .line 1213
    .line 1214
    add-int/lit8 v10, v10, 0x1

    .line 1215
    .line 1216
    goto :goto_11

    .line 1217
    :cond_1d
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 1218
    .line 1219
    .line 1220
    iput-boolean v11, v1, Landroidx/drawerlayout/widget/DrawerLayout;->e0:Z

    .line 1221
    .line 1222
    :cond_1e
    return-void

    .line 1223
    :pswitch_18
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v0, Landroidx/fragment/app/i;

    .line 1226
    .line 1227
    iget-object v1, v0, Landroidx/fragment/app/i;->d:Lk80;

    .line 1228
    .line 1229
    iget-object v0, v0, Landroidx/fragment/app/i;->W:Landroid/app/Dialog;

    .line 1230
    .line 1231
    invoke-virtual {v1, v0}, Lk80;->onDismiss(Landroid/content/DialogInterface;)V

    .line 1232
    .line 1233
    .line 1234
    return-void

    .line 1235
    :pswitch_19
    :try_start_a
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 1238
    .line 1239
    invoke-static {v0}, Landroidx/activity/ComponentActivity;->access$001(Landroidx/activity/ComponentActivity;)V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_a .. :try_end_a} :catch_3

    .line 1240
    .line 1241
    .line 1242
    goto :goto_14

    .line 1243
    :catch_3
    move-exception v0

    .line 1244
    goto :goto_12

    .line 1245
    :catch_4
    move-exception v0

    .line 1246
    goto :goto_13

    .line 1247
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v1

    .line 1251
    const-string v2, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    .line 1252
    .line 1253
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v1

    .line 1257
    if-eqz v1, :cond_1f

    .line 1258
    .line 1259
    goto :goto_14

    .line 1260
    :cond_1f
    throw v0

    .line 1261
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v1

    .line 1265
    const-string v2, "Can not perform this action after onSaveInstanceState"

    .line 1266
    .line 1267
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v1

    .line 1271
    if-eqz v1, :cond_20

    .line 1272
    .line 1273
    :goto_14
    return-void

    .line 1274
    :cond_20
    throw v0

    .line 1275
    :pswitch_1a
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast v0, Landroidx/constraintlayout/helper/widget/Carousel;

    .line 1278
    .line 1279
    iget-object v0, v0, Landroidx/constraintlayout/helper/widget/Carousel;->c0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1280
    .line 1281
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 1282
    .line 1283
    .line 1284
    throw v9

    .line 1285
    :pswitch_1b
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1286
    .line 1287
    check-cast v0, Luk;

    .line 1288
    .line 1289
    const/4 v1, 0x0

    .line 1290
    iput-boolean v1, v0, Luk;->b:Z

    .line 1291
    .line 1292
    iget-object v1, v0, Luk;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1293
    .line 1294
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Lj33;

    .line 1295
    .line 1296
    if-eqz v2, :cond_21

    .line 1297
    .line 1298
    invoke-virtual {v2}, Lj33;->h()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v2

    .line 1302
    if-eqz v2, :cond_21

    .line 1303
    .line 1304
    iget v1, v0, Luk;->a:I

    .line 1305
    .line 1306
    invoke-virtual {v0, v1}, Luk;->a(I)V

    .line 1307
    .line 1308
    .line 1309
    goto :goto_15

    .line 1310
    :cond_21
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:I

    .line 1311
    .line 1312
    if-ne v2, v8, :cond_22

    .line 1313
    .line 1314
    iget v0, v0, Luk;->a:I

    .line 1315
    .line 1316
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    .line 1317
    .line 1318
    .line 1319
    :cond_22
    :goto_15
    return-void

    .line 1320
    :pswitch_1c
    iget-object v0, v1, Lye;->b:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v0, Lr81;

    .line 1323
    .line 1324
    iget-object v2, v0, Lr81;->c:Lra0;

    .line 1325
    .line 1326
    iget-object v3, v0, Lr81;->a:Lxe;

    .line 1327
    .line 1328
    iget-boolean v6, v0, Lr81;->Z:Z

    .line 1329
    .line 1330
    if-nez v6, :cond_23

    .line 1331
    .line 1332
    goto/16 :goto_18

    .line 1333
    .line 1334
    :cond_23
    iget-boolean v6, v0, Lr81;->X:Z

    .line 1335
    .line 1336
    if-eqz v6, :cond_24

    .line 1337
    .line 1338
    const/4 v6, 0x0

    .line 1339
    iput-boolean v6, v0, Lr81;->X:Z

    .line 1340
    .line 1341
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1342
    .line 1343
    .line 1344
    move-result-wide v6

    .line 1345
    iput-wide v6, v3, Lxe;->e:J

    .line 1346
    .line 1347
    const-wide/16 v8, -0x1

    .line 1348
    .line 1349
    iput-wide v8, v3, Lxe;->g:J

    .line 1350
    .line 1351
    iput-wide v6, v3, Lxe;->f:J

    .line 1352
    .line 1353
    const/high16 v6, 0x3f000000    # 0.5f

    .line 1354
    .line 1355
    iput v6, v3, Lxe;->h:F

    .line 1356
    .line 1357
    :cond_24
    iget-wide v6, v3, Lxe;->g:J

    .line 1358
    .line 1359
    cmp-long v6, v6, v4

    .line 1360
    .line 1361
    if-lez v6, :cond_25

    .line 1362
    .line 1363
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1364
    .line 1365
    .line 1366
    move-result-wide v6

    .line 1367
    iget-wide v8, v3, Lxe;->g:J

    .line 1368
    .line 1369
    iget v10, v3, Lxe;->i:I

    .line 1370
    .line 1371
    int-to-long v10, v10

    .line 1372
    add-long/2addr v8, v10

    .line 1373
    cmp-long v6, v6, v8

    .line 1374
    .line 1375
    if-lez v6, :cond_25

    .line 1376
    .line 1377
    :goto_16
    const/4 v6, 0x0

    .line 1378
    goto :goto_17

    .line 1379
    :cond_25
    invoke-virtual {v0}, Lr81;->e()Z

    .line 1380
    .line 1381
    .line 1382
    move-result v6

    .line 1383
    if-nez v6, :cond_26

    .line 1384
    .line 1385
    goto :goto_16

    .line 1386
    :goto_17
    iput-boolean v6, v0, Lr81;->Z:Z

    .line 1387
    .line 1388
    goto :goto_18

    .line 1389
    :cond_26
    const/4 v6, 0x0

    .line 1390
    iget-boolean v7, v0, Lr81;->Y:Z

    .line 1391
    .line 1392
    if-eqz v7, :cond_27

    .line 1393
    .line 1394
    iput-boolean v6, v0, Lr81;->Y:Z

    .line 1395
    .line 1396
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v8

    .line 1400
    const/4 v14, 0x0

    .line 1401
    const/4 v15, 0x0

    .line 1402
    const/4 v12, 0x3

    .line 1403
    const/4 v13, 0x0

    .line 1404
    move-wide v10, v8

    .line 1405
    invoke-static/range {v8 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v6

    .line 1409
    invoke-virtual {v2, v6}, Lra0;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    .line 1413
    .line 1414
    .line 1415
    :cond_27
    iget-wide v6, v3, Lxe;->f:J

    .line 1416
    .line 1417
    cmp-long v4, v6, v4

    .line 1418
    .line 1419
    if-eqz v4, :cond_28

    .line 1420
    .line 1421
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1422
    .line 1423
    .line 1424
    move-result-wide v4

    .line 1425
    invoke-virtual {v3, v4, v5}, Lxe;->a(J)F

    .line 1426
    .line 1427
    .line 1428
    move-result v6

    .line 1429
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1430
    .line 1431
    mul-float/2addr v7, v6

    .line 1432
    mul-float/2addr v7, v6

    .line 1433
    const/high16 v8, 0x40800000    # 4.0f

    .line 1434
    .line 1435
    mul-float/2addr v6, v8

    .line 1436
    add-float/2addr v6, v7

    .line 1437
    iget-wide v7, v3, Lxe;->f:J

    .line 1438
    .line 1439
    sub-long v7, v4, v7

    .line 1440
    .line 1441
    iput-wide v4, v3, Lxe;->f:J

    .line 1442
    .line 1443
    long-to-float v4, v7

    .line 1444
    mul-float/2addr v4, v6

    .line 1445
    iget v3, v3, Lxe;->d:F

    .line 1446
    .line 1447
    mul-float/2addr v4, v3

    .line 1448
    float-to-int v3, v4

    .line 1449
    iget-object v0, v0, Lr81;->b0:Lra0;

    .line 1450
    .line 1451
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1452
    .line 1453
    .line 1454
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 1455
    .line 1456
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1457
    .line 1458
    .line 1459
    goto :goto_18

    .line 1460
    :cond_28
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1461
    .line 1462
    invoke-static {v0}, Lf42;->s(Ljava/lang/String;)V

    .line 1463
    .line 1464
    .line 1465
    :goto_18
    return-void

    .line 1466
    nop

    .line 1467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
