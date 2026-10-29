.class public final Lcq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static V:Lcq2;

.field public static W:Lcq2;


# instance fields
.field public U:Z

.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/CharSequence;

.field public final c:I

.field public final d:Lbq2;

.field public final e:Lbq2;

.field public f:I

.field public i:I

.field public v:Leq2;

.field public w:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbq2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lbq2;-><init>(Lcq2;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcq2;->d:Lbq2;

    .line 11
    .line 12
    new-instance v0, Lbq2;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lbq2;-><init>(Lcq2;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcq2;->e:Lbq2;

    .line 19
    .line 20
    iput-object p1, p0, Lcq2;->a:Landroid/view/View;

    .line 21
    .line 22
    iput-object p2, p0, Lcq2;->b:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget-object v0, Li33;->a:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1c

    .line 37
    .line 38
    if-lt v0, v2, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, Lg33;->a(Landroid/view/ViewConfiguration;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    div-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    :goto_0
    iput p2, p0, Lcq2;->c:I

    .line 52
    .line 53
    iput-boolean v1, p0, Lcq2;->U:Z

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static b(Lcq2;)V
    .locals 3

    .line 1
    sget-object v0, Lcq2;->V:Lcq2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lcq2;->a:Landroid/view/View;

    .line 6
    .line 7
    iget-object v0, v0, Lcq2;->d:Lbq2;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    sput-object p0, Lcq2;->V:Lcq2;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcq2;->a:Landroid/view/View;

    .line 17
    .line 18
    iget-object p0, p0, Lcq2;->d:Lbq2;

    .line 19
    .line 20
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-long v1, v1

    .line 25
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    sget-object v0, Lcq2;->W:Lcq2;

    .line 2
    .line 3
    iget-object v1, p0, Lcq2;->a:Landroid/view/View;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, p0, :cond_2

    .line 7
    .line 8
    sput-object v2, Lcq2;->W:Lcq2;

    .line 9
    .line 10
    iget-object v0, p0, Lcq2;->v:Leq2;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Leq2;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Leq2;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/content/Context;

    .line 27
    .line 28
    const-string v4, "window"

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/WindowManager;

    .line 35
    .line 36
    invoke-interface {v0, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iput-object v2, p0, Lcq2;->v:Leq2;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lcq2;->U:Z

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v0, "TooltipCompatHandler"

    .line 49
    .line 50
    const-string v3, "sActiveHandler.mPopup == null"

    .line 51
    .line 52
    invoke-static {v0, v3}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    sget-object v0, Lcq2;->V:Lcq2;

    .line 56
    .line 57
    if-ne v0, p0, :cond_3

    .line 58
    .line 59
    invoke-static {v2}, Lcq2;->b(Lcq2;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    iget-object p0, p0, Lcq2;->e:Lbq2;

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final c(Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcq2;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    invoke-static {v2}, Lcq2;->b(Lcq2;)V

    .line 14
    .line 15
    .line 16
    sget-object v3, Lcq2;->W:Lcq2;

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v3}, Lcq2;->a()V

    .line 21
    .line 22
    .line 23
    :cond_1
    sput-object v0, Lcq2;->W:Lcq2;

    .line 24
    .line 25
    move/from16 v3, p1

    .line 26
    .line 27
    iput-boolean v3, v0, Lcq2;->w:Z

    .line 28
    .line 29
    new-instance v3, Leq2;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v5, Landroid/view/WindowManager$LayoutParams;

    .line 39
    .line 40
    invoke-direct {v5}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v5, v3, Leq2;->d:Ljava/lang/Object;

    .line 44
    .line 45
    new-instance v6, Landroid/graphics/Rect;

    .line 46
    .line 47
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v6, v3, Leq2;->e:Ljava/lang/Object;

    .line 51
    .line 52
    const/4 v6, 0x2

    .line 53
    new-array v7, v6, [I

    .line 54
    .line 55
    iput-object v7, v3, Leq2;->f:Ljava/lang/Object;

    .line 56
    .line 57
    new-array v7, v6, [I

    .line 58
    .line 59
    iput-object v7, v3, Leq2;->i:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v4, v3, Leq2;->a:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    sget v8, Landroidx/appcompat/R$layout;->abc_tooltip:I

    .line 68
    .line 69
    invoke-virtual {v7, v8, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-object v2, v3, Leq2;->b:Ljava/lang/Object;

    .line 74
    .line 75
    sget v7, Landroidx/appcompat/R$id;->message:I

    .line 76
    .line 77
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Landroid/widget/TextView;

    .line 82
    .line 83
    iput-object v2, v3, Leq2;->c:Ljava/lang/Object;

    .line 84
    .line 85
    const-class v2, Leq2;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v5, v2}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iput-object v2, v5, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 99
    .line 100
    const/16 v2, 0x3ea

    .line 101
    .line 102
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 103
    .line 104
    const/4 v2, -0x2

    .line 105
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 106
    .line 107
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 108
    .line 109
    const/4 v2, -0x3

    .line 110
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 111
    .line 112
    sget v2, Landroidx/appcompat/R$style;->Animation_AppCompat_Tooltip:I

    .line 113
    .line 114
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 115
    .line 116
    const/16 v2, 0x18

    .line 117
    .line 118
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 119
    .line 120
    iget-object v2, v3, Leq2;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Landroid/view/View;

    .line 123
    .line 124
    iget-object v4, v3, Leq2;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v4, Landroid/content/Context;

    .line 127
    .line 128
    iput-object v3, v0, Lcq2;->v:Leq2;

    .line 129
    .line 130
    iget v5, v0, Lcq2;->f:I

    .line 131
    .line 132
    iget v7, v0, Lcq2;->i:I

    .line 133
    .line 134
    iget-boolean v8, v0, Lcq2;->w:Z

    .line 135
    .line 136
    iget-object v9, v3, Leq2;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v9, Landroid/view/WindowManager$LayoutParams;

    .line 139
    .line 140
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    const-string v11, "window"

    .line 145
    .line 146
    if-eqz v10, :cond_2

    .line 147
    .line 148
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    if-eqz v10, :cond_2

    .line 153
    .line 154
    invoke-virtual {v4, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    check-cast v10, Landroid/view/WindowManager;

    .line 159
    .line 160
    invoke-interface {v10, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    iget-object v10, v3, Leq2;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v10, Landroid/widget/TextView;

    .line 166
    .line 167
    iget-object v12, v0, Lcq2;->b:Ljava/lang/CharSequence;

    .line 168
    .line 169
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    iget-object v10, v3, Leq2;->i:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v10, [I

    .line 175
    .line 176
    iget-object v12, v3, Leq2;->f:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v12, [I

    .line 179
    .line 180
    iget-object v3, v3, Leq2;->e:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v3, Landroid/graphics/Rect;

    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    iput-object v13, v9, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 189
    .line 190
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    sget v14, Landroidx/appcompat/R$dimen;->tooltip_precise_anchor_threshold:I

    .line 195
    .line 196
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-lt v14, v13, :cond_3

    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    div-int/2addr v5, v6

    .line 212
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-lt v14, v13, :cond_4

    .line 217
    .line 218
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    sget v14, Landroidx/appcompat/R$dimen;->tooltip_precise_anchor_extra_offset:I

    .line 223
    .line 224
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    add-int v14, v7, v13

    .line 229
    .line 230
    sub-int/2addr v7, v13

    .line 231
    goto :goto_1

    .line 232
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 233
    .line 234
    .line 235
    move-result v14

    .line 236
    const/4 v7, 0x0

    .line 237
    :goto_1
    const/16 v13, 0x31

    .line 238
    .line 239
    iput v13, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 240
    .line 241
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    if-eqz v8, :cond_5

    .line 246
    .line 247
    sget v16, Landroidx/appcompat/R$dimen;->tooltip_y_offset_touch:I

    .line 248
    .line 249
    :goto_2
    move/from16 v15, v16

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_5
    sget v16, Landroidx/appcompat/R$dimen;->tooltip_y_offset_non_touch:I

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :goto_3
    invoke-virtual {v13, v15}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v15

    .line 263
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    move/from16 v17, v5

    .line 268
    .line 269
    instance-of v5, v6, Landroid/view/WindowManager$LayoutParams;

    .line 270
    .line 271
    if-eqz v5, :cond_6

    .line 272
    .line 273
    check-cast v6, Landroid/view/WindowManager$LayoutParams;

    .line 274
    .line 275
    iget v5, v6, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 276
    .line 277
    const/4 v6, 0x2

    .line 278
    if-ne v5, v6, :cond_6

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    :goto_4
    instance-of v6, v5, Landroid/content/ContextWrapper;

    .line 286
    .line 287
    if-eqz v6, :cond_8

    .line 288
    .line 289
    instance-of v6, v5, Landroid/app/Activity;

    .line 290
    .line 291
    if-eqz v6, :cond_7

    .line 292
    .line 293
    check-cast v5, Landroid/app/Activity;

    .line 294
    .line 295
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v15

    .line 303
    goto :goto_5

    .line 304
    :cond_7
    check-cast v5, Landroid/content/ContextWrapper;

    .line 305
    .line 306
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    goto :goto_4

    .line 311
    :cond_8
    :goto_5
    if-nez v15, :cond_9

    .line 312
    .line 313
    const-string v3, "TooltipPopup"

    .line 314
    .line 315
    const-string v6, "Cannot find app view"

    .line 316
    .line 317
    invoke-static {v3, v6}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    const/16 v18, 0x1

    .line 321
    .line 322
    goto/16 :goto_8

    .line 323
    .line 324
    :cond_9
    invoke-virtual {v15, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 325
    .line 326
    .line 327
    iget v6, v3, Landroid/graphics/Rect;->left:I

    .line 328
    .line 329
    if-gez v6, :cond_b

    .line 330
    .line 331
    iget v6, v3, Landroid/graphics/Rect;->top:I

    .line 332
    .line 333
    if-gez v6, :cond_b

    .line 334
    .line 335
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    const/16 v18, 0x1

    .line 340
    .line 341
    const-string v5, "dimen"

    .line 342
    .line 343
    move/from16 v19, v7

    .line 344
    .line 345
    const-string v7, "android"

    .line 346
    .line 347
    move/from16 v20, v8

    .line 348
    .line 349
    const-string v8, "status_bar_height"

    .line 350
    .line 351
    invoke-virtual {v6, v8, v5, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-eqz v5, :cond_a

    .line 356
    .line 357
    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    goto :goto_6

    .line 362
    :cond_a
    const/4 v5, 0x0

    .line 363
    :goto_6
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 368
    .line 369
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 370
    .line 371
    const/4 v8, 0x0

    .line 372
    invoke-virtual {v3, v8, v5, v7, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 373
    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_b
    move/from16 v19, v7

    .line 377
    .line 378
    move/from16 v20, v8

    .line 379
    .line 380
    const/4 v8, 0x0

    .line 381
    const/16 v18, 0x1

    .line 382
    .line 383
    :goto_7
    invoke-virtual {v15, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v12}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 387
    .line 388
    .line 389
    aget v5, v12, v8

    .line 390
    .line 391
    aget v6, v10, v8

    .line 392
    .line 393
    sub-int/2addr v5, v6

    .line 394
    aput v5, v12, v8

    .line 395
    .line 396
    aget v6, v12, v18

    .line 397
    .line 398
    aget v7, v10, v18

    .line 399
    .line 400
    sub-int/2addr v6, v7

    .line 401
    aput v6, v12, v18

    .line 402
    .line 403
    add-int v5, v5, v17

    .line 404
    .line 405
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    const/16 v16, 0x2

    .line 410
    .line 411
    div-int/lit8 v6, v6, 0x2

    .line 412
    .line 413
    sub-int/2addr v5, v6

    .line 414
    iput v5, v9, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 415
    .line 416
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    invoke-virtual {v2, v5, v5}, Landroid/view/View;->measure(II)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    aget v6, v12, v18

    .line 428
    .line 429
    add-int v7, v6, v19

    .line 430
    .line 431
    sub-int/2addr v7, v13

    .line 432
    sub-int/2addr v7, v5

    .line 433
    add-int/2addr v6, v14

    .line 434
    add-int/2addr v6, v13

    .line 435
    if-eqz v20, :cond_d

    .line 436
    .line 437
    if-ltz v7, :cond_c

    .line 438
    .line 439
    iput v7, v9, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_c
    iput v6, v9, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_d
    add-int/2addr v5, v6

    .line 446
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-gt v5, v3, :cond_e

    .line 451
    .line 452
    iput v6, v9, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_e
    iput v7, v9, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 456
    .line 457
    :goto_8
    invoke-virtual {v4, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    check-cast v3, Landroid/view/WindowManager;

    .line 462
    .line 463
    invoke-interface {v3, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 467
    .line 468
    .line 469
    iget-boolean v2, v0, Lcq2;->w:Z

    .line 470
    .line 471
    if-eqz v2, :cond_f

    .line 472
    .line 473
    const-wide/16 v2, 0x9c4

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_f
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 477
    .line 478
    invoke-virtual {v1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    and-int/lit8 v2, v2, 0x1

    .line 483
    .line 484
    move/from16 v3, v18

    .line 485
    .line 486
    if-ne v2, v3, :cond_10

    .line 487
    .line 488
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    int-to-long v2, v2

    .line 493
    const-wide/16 v4, 0xbb8

    .line 494
    .line 495
    :goto_9
    sub-long v2, v4, v2

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_10
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    int-to-long v2, v2

    .line 503
    const-wide/16 v4, 0x3a98

    .line 504
    .line 505
    goto :goto_9

    .line 506
    :goto_a
    iget-object v0, v0, Lcq2;->e:Lbq2;

    .line 507
    .line 508
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 512
    .line 513
    .line 514
    return-void
.end method

.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lcq2;->v:Leq2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-boolean p1, p0, Lcq2;->w:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcq2;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "accessibility"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x7

    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    const/16 p1, 0xa

    .line 46
    .line 47
    if-eq v1, p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lcq2;->U:Z

    .line 52
    .line 53
    invoke-virtual {p0}, Lcq2;->a()V

    .line 54
    .line 55
    .line 56
    return v0

    .line 57
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Lcq2;->v:Leq2;

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    float-to-int p1, p1

    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    float-to-int p2, p2

    .line 77
    iget-boolean v1, p0, Lcq2;->U:Z

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget v1, p0, Lcq2;->f:I

    .line 82
    .line 83
    sub-int v1, p1, v1

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget v2, p0, Lcq2;->c:I

    .line 90
    .line 91
    if-gt v1, v2, :cond_4

    .line 92
    .line 93
    iget v1, p0, Lcq2;->i:I

    .line 94
    .line 95
    sub-int v1, p2, v1

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-le v1, v2, :cond_5

    .line 102
    .line 103
    :cond_4
    iput p1, p0, Lcq2;->f:I

    .line 104
    .line 105
    iput p2, p0, Lcq2;->i:I

    .line 106
    .line 107
    iput-boolean v0, p0, Lcq2;->U:Z

    .line 108
    .line 109
    invoke-static {p0}, Lcq2;->b(Lcq2;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_0
    return v0
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iput v0, p0, Lcq2;->f:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    div-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    iput p1, p0, Lcq2;->i:I

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lcq2;->c(Z)V

    .line 19
    .line 20
    .line 21
    return p1
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcq2;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
