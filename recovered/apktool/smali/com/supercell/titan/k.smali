.class public final Lcom/supercell/titan/k;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lcom/supercell/titan/ScInfoBox;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/ScInfoBox;Lcom/supercell/titan/GameApp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/supercell/titan/k;->b:Lcom/supercell/titan/ScInfoBox;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/supercell/titan/k;->a:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/k;->b:Lcom/supercell/titan/ScInfoBox;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/supercell/titan/ScInfoBox;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/supercell/titan/ScInfoBox;->a:Ljava/lang/String;

    .line 6
    .line 7
    sget v3, Lcom/supercell/titan/ScInfoBox;->f:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/supercell/titan/k;->a:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v4, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 21
    .line 22
    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-direct {v3, v6, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    .line 29
    .line 30
    sget v6, Lcom/supercell/titan/ScInfoBox;->f:I

    .line 31
    .line 32
    invoke-virtual {v3, v6}, Landroid/view/View;->setId(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 36
    .line 37
    .line 38
    new-instance v6, Landroidx/coordinatorlayout/widget/c;

    .line 39
    .line 40
    const/4 v7, -0x1

    .line 41
    invoke-direct {v6, v7, v7}, Landroidx/coordinatorlayout/widget/c;-><init>(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v3, v6}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v6, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    if-nez v6, :cond_1

    .line 50
    .line 51
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    sget v7, Lcom/supercell/titan/R$layout;->sc_info_box:I

    .line 56
    .line 57
    invoke-virtual {v6, v7, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Landroid/widget/LinearLayout;

    .line 62
    .line 63
    iput-object v6, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 64
    .line 65
    :cond_1
    iget-object v6, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual {v6, v7}, Landroid/view/View;->setId(I)V

    .line 72
    .line 73
    .line 74
    iget-object v6, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    sget v7, Lcom/supercell/titan/R$id;->infoBoxText:I

    .line 77
    .line 78
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    const/16 v8, 0x8

    .line 89
    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    iget-object v2, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 103
    .line 104
    sget v6, Lcom/supercell/titan/R$id;->infoBoxButton:I

    .line 105
    .line 106
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Landroid/widget/Button;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_3

    .line 117
    .line 118
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Lu1;

    .line 129
    .line 130
    const/16 v5, 0x9

    .line 131
    .line 132
    invoke-direct {v1, p0, v5}, Lu1;-><init>(Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    .line 137
    .line 138
    :goto_1
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const/4 v2, 0x1

    .line 147
    const/high16 v4, 0x41000000    # 8.0f

    .line 148
    .line 149
    invoke-static {v2, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    float-to-int v1, v1

    .line 154
    new-instance v2, Landroidx/coordinatorlayout/widget/c;

    .line 155
    .line 156
    const/4 v4, -0x2

    .line 157
    invoke-direct {v2, v4, v4}, Landroidx/coordinatorlayout/widget/c;-><init>(II)V

    .line 158
    .line 159
    .line 160
    const/16 v4, 0x51

    .line 161
    .line 162
    iput v4, v2, Landroidx/coordinatorlayout/widget/c;->c:I

    .line 163
    .line 164
    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 165
    .line 166
    .line 167
    new-instance v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 168
    .line 169
    invoke-direct {v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;-><init>()V

    .line 170
    .line 171
    .line 172
    const/4 v4, 0x2

    .line 173
    iput v4, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    .line 174
    .line 175
    const/4 v5, 0x0

    .line 176
    const v6, 0x3f19999a    # 0.6f

    .line 177
    .line 178
    .line 179
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    const/high16 v8, 0x3f800000    # 1.0f

    .line 184
    .line 185
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    iput v7, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->g:F

    .line 190
    .line 191
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    invoke-static {v6, v8}, Ljava/lang/Math;->min(FF)F

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    iput v6, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->e:F

    .line 200
    .line 201
    new-instance v6, Lfs0;

    .line 202
    .line 203
    const/16 v7, 0xb

    .line 204
    .line 205
    invoke-direct {v6, p0, v7}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    iput-object v6, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lfs0;

    .line 209
    .line 210
    invoke-virtual {v2, v1}, Landroidx/coordinatorlayout/widget/c;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;)V

    .line 211
    .line 212
    .line 213
    iget-object v1, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 214
    .line 215
    sget-object v6, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 216
    .line 217
    new-array v7, v4, [F

    .line 218
    .line 219
    fill-array-data v7, :array_0

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    const-wide/16 v7, 0x12c

    .line 227
    .line 228
    invoke-virtual {v1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 229
    .line 230
    .line 231
    iget-object v9, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 232
    .line 233
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    check-cast v9, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 238
    .line 239
    if-eqz v9, :cond_4

    .line 240
    .line 241
    return-void

    .line 242
    :cond_4
    iget-object v9, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 243
    .line 244
    invoke-virtual {v9, v5}, Landroid/view/View;->setAlpha(F)V

    .line 245
    .line 246
    .line 247
    iget-object v5, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 248
    .line 249
    invoke-virtual {v3, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 253
    .line 254
    .line 255
    iget-object v1, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 256
    .line 257
    new-array v2, v4, [F

    .line 258
    .line 259
    fill-array-data v2, :array_1

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v6, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 267
    .line 268
    .line 269
    iget v0, v0, Lcom/supercell/titan/ScInfoBox;->c:I

    .line 270
    .line 271
    int-to-long v2, v0

    .line 272
    invoke-virtual {v1, v2, v3}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 276
    .line 277
    .line 278
    new-instance v0, Lw1;

    .line 279
    .line 280
    const/4 v2, 0x7

    .line 281
    invoke-direct {v0, p0, v2}, Lw1;-><init>(Ljava/lang/Object;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    nop

    .line 289
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
