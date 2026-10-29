.class public Lio/sentry/android/core/SentryUserFeedbackButton;
.super Landroid/widget/Button;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final synthetic b:I


# instance fields
.field public a:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/SentryUserFeedbackButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/android/core/SentryUserFeedbackButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    sget-object v2, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton:[I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-object/from16 v4, p1

    .line 9
    .line 10
    move-object/from16 v5, p2

    .line 11
    .line 12
    move/from16 v6, p3

    .line 13
    .line 14
    invoke-virtual {v4, v5, v2, v6, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v7, 0x1

    .line 19
    :try_start_0
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 28
    .line 29
    sget v9, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_drawablePadding:I

    .line 30
    .line 31
    const/high16 v10, -0x40800000    # -1.0f

    .line 32
    .line 33
    invoke-virtual {v2, v9, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    sget v11, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_drawableStart:I

    .line 38
    .line 39
    const/4 v12, -0x1

    .line 40
    invoke-virtual {v2, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    sget v13, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_textAllCaps:I

    .line 45
    .line 46
    invoke-virtual {v2, v13, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    sget v14, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_background:I

    .line 51
    .line 52
    invoke-virtual {v2, v14, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 53
    .line 54
    .line 55
    move-result v14

    .line 56
    sget v15, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_padding:I

    .line 57
    .line 58
    invoke-virtual {v2, v15, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    move/from16 p2, v10

    .line 63
    .line 64
    sget v10, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_textColor:I

    .line 65
    .line 66
    invoke-virtual {v2, v10, v12}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    sget v5, Lio/sentry/android/core/R$styleable;->SentryUserFeedbackButton_android_text:I

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    cmpl-float v6, v9, p2

    .line 77
    .line 78
    if-nez v6, :cond_0

    .line 79
    .line 80
    const/high16 v6, 0x40800000    # 4.0f

    .line 81
    .line 82
    mul-float/2addr v6, v8

    .line 83
    float-to-int v6, v6

    .line 84
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object v4, v0

    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_0
    :goto_0
    if-ne v11, v12, :cond_1

    .line 93
    .line 94
    sget v6, Lio/sentry/android/core/R$drawable;->sentry_user_feedback_button_logo_24:I

    .line 95
    .line 96
    invoke-virtual {v0, v6, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    .line 97
    .line 98
    .line 99
    :cond_1
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 100
    .line 101
    .line 102
    if-ne v14, v12, :cond_2

    .line 103
    .line 104
    sget v6, Lio/sentry/android/core/R$drawable;->sentry_oval_button_ripple_background:I

    .line 105
    .line 106
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 107
    .line 108
    .line 109
    :cond_2
    cmpl-float v6, v15, p2

    .line 110
    .line 111
    if-nez v6, :cond_3

    .line 112
    .line 113
    const/high16 v6, 0x41400000    # 12.0f

    .line 114
    .line 115
    mul-float/2addr v8, v6

    .line 116
    float-to-int v6, v8

    .line 117
    invoke-virtual {v0, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 118
    .line 119
    .line 120
    :cond_3
    if-ne v10, v12, :cond_4

    .line 121
    .line 122
    new-instance v6, Landroid/util/TypedValue;

    .line 123
    .line 124
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    const v9, 0x1010030

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v9, v6, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v8, v6, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 152
    .line 153
    .line 154
    :cond_4
    if-nez v5, :cond_5

    .line 155
    .line 156
    const-string v4, "Report a Bug"

    .line 157
    .line 158
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    :cond_5
    instance-of v4, v2, Ljava/lang/AutoCloseable;

    .line 162
    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 166
    .line 167
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    instance-of v4, v2, Ljava/util/concurrent/ExecutorService;

    .line 172
    .line 173
    if-eqz v4, :cond_a

    .line 174
    .line 175
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 176
    .line 177
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-ne v2, v4, :cond_7

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_7
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_b

    .line 189
    .line 190
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 191
    .line 192
    .line 193
    :cond_8
    :goto_1
    if-nez v4, :cond_9

    .line 194
    .line 195
    const-wide/16 v5, 0x1

    .line 196
    .line 197
    :try_start_1
    invoke-interface {v2, v5, v6, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 198
    .line 199
    .line 200
    move-result v4
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 201
    goto :goto_1

    .line 202
    :catch_0
    if-nez v3, :cond_8

    .line 203
    .line 204
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move v3, v7

    .line 208
    goto :goto_1

    .line 209
    :cond_9
    if-eqz v3, :cond_b

    .line 210
    .line 211
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 220
    .line 221
    .line 222
    :cond_b
    :goto_2
    iget-object v1, v0, Lio/sentry/android/core/SentryUserFeedbackButton;->a:Landroid/view/View$OnClickListener;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Lio/sentry/android/core/SentryUserFeedbackButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :goto_3
    if-eqz v2, :cond_10

    .line 229
    .line 230
    :try_start_2
    instance-of v0, v2, Ljava/lang/AutoCloseable;

    .line 231
    .line 232
    if-nez v0, :cond_f

    .line 233
    .line 234
    instance-of v0, v2, Ljava/util/concurrent/ExecutorService;

    .line 235
    .line 236
    if-eqz v0, :cond_e

    .line 237
    .line 238
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 239
    .line 240
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    if-eq v2, v0, :cond_10

    .line 245
    .line 246
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_10

    .line 251
    .line 252
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 253
    .line 254
    .line 255
    :cond_c
    :goto_4
    if-nez v0, :cond_d

    .line 256
    .line 257
    const-wide/16 v5, 0x1

    .line 258
    .line 259
    :try_start_3
    invoke-interface {v2, v5, v6, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 260
    .line 261
    .line 262
    move-result v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 263
    goto :goto_4

    .line 264
    :catch_1
    if-nez v3, :cond_c

    .line 265
    .line 266
    :try_start_4
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move v3, v7

    .line 270
    goto :goto_4

    .line 271
    :cond_d
    if-eqz v3, :cond_10

    .line 272
    .line 273
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_e
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_f
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 286
    .line 287
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :catchall_1
    move-exception v0

    .line 292
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 293
    .line 294
    .line 295
    :cond_10
    :goto_5
    throw v4
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lio/sentry/android/core/SentryUserFeedbackButton;->a:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    new-instance p1, Lh51;

    .line 4
    .line 5
    const/4 v0, 0x6

    .line 6
    invoke-direct {p1, p0, v0}, Lh51;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
