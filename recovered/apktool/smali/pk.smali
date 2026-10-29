.class public final Lpk;
.super Ltl1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final s0:I

.field public final t0:I

.field public final u0:I

.field public final v0:I

.field public w0:Z

.field public final x0:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ltl1;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    .line 6
    const/4 v0, -0x2

    .line 7
    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x11

    .line 11
    .line 12
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget v0, Lcom/google/android/material/R$dimen;->design_bottom_navigation_item_max_width:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lpk;->s0:I

    .line 28
    .line 29
    sget v0, Lcom/google/android/material/R$dimen;->design_bottom_navigation_item_min_width:I

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lpk;->t0:I

    .line 36
    .line 37
    sget v0, Lcom/google/android/material/R$dimen;->design_bottom_navigation_active_item_max_width:I

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lpk;->u0:I

    .line 44
    .line 45
    sget v0, Lcom/google/android/material/R$dimen;->design_bottom_navigation_active_item_min_width:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p0, Lpk;->v0:I

    .line 52
    .line 53
    const/4 p1, 0x5

    .line 54
    new-array p1, p1, [I

    .line 55
    .line 56
    iput-object p1, p0, Lpk;->x0:[I

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final e(Landroid/content/Context;)Lrl1;
    .locals 0

    .line 1
    new-instance p0, Lok;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lrl1;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sub-int/2addr p4, p2

    .line 6
    sub-int/2addr p5, p3

    .line 7
    const/4 p2, 0x0

    .line 8
    move p3, p2

    .line 9
    move v0, p3

    .line 10
    :goto_0
    if-ge p3, p1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x1

    .line 32
    if-ne v2, v3, :cond_1

    .line 33
    .line 34
    sub-int v2, p4, v0

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int v3, v2, v3

    .line 41
    .line 42
    invoke-virtual {v1, v3, p2, v2, p5}, Landroid/view/View;->layout(IIII)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    invoke-virtual {v1, v0, p2, v2, p5}, Landroid/view/View;->layout(IIII)V

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v0, v1

    .line 59
    :goto_2
    add-int/lit8 p3, p3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ltl1;->getMenu()Ljg1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {v0}, Ljg1;->l()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/high16 v3, 0x40000000    # 2.0f

    .line 26
    .line 27
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {p0}, Ltl1;->getLabelVisibilityMode()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static {v5, v0}, Ltl1;->f(II)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget v6, p0, Lpk;->u0:I

    .line 40
    .line 41
    iget-object v7, p0, Lpk;->x0:[I

    .line 42
    .line 43
    const/16 v8, 0x8

    .line 44
    .line 45
    const/4 v9, 0x1

    .line 46
    const/4 v10, 0x0

    .line 47
    if-eqz v5, :cond_6

    .line 48
    .line 49
    iget-boolean v5, p0, Lpk;->w0:Z

    .line 50
    .line 51
    if-eqz v5, :cond_6

    .line 52
    .line 53
    invoke-virtual {p0}, Ltl1;->getSelectedItemPosition()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    iget v12, p0, Lpk;->v0:I

    .line 66
    .line 67
    if-eq v11, v8, :cond_0

    .line 68
    .line 69
    const/high16 v11, -0x80000000

    .line 70
    .line 71
    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-virtual {v5, v11, v4}, Landroid/view/View;->measure(II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    :cond_0
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eq v5, v8, :cond_1

    .line 91
    .line 92
    move v5, v9

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    move v5, v10

    .line 95
    :goto_0
    sub-int/2addr v0, v5

    .line 96
    iget v5, p0, Lpk;->t0:I

    .line 97
    .line 98
    mul-int/2addr v5, v0

    .line 99
    sub-int v5, p1, v5

    .line 100
    .line 101
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    sub-int/2addr p1, v5

    .line 110
    if-nez v0, :cond_2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    move v9, v0

    .line 114
    :goto_1
    div-int v6, p1, v9

    .line 115
    .line 116
    iget v9, p0, Lpk;->s0:I

    .line 117
    .line 118
    invoke-static {v6, v9}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    mul-int/2addr v0, v6

    .line 123
    sub-int/2addr p1, v0

    .line 124
    move v0, v10

    .line 125
    :goto_2
    if-ge v0, v1, :cond_a

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eq v9, v8, :cond_4

    .line 136
    .line 137
    invoke-virtual {p0}, Ltl1;->getSelectedItemPosition()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-ne v0, v9, :cond_3

    .line 142
    .line 143
    move v9, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_3
    move v9, v6

    .line 146
    :goto_3
    aput v9, v7, v0

    .line 147
    .line 148
    if-lez p1, :cond_5

    .line 149
    .line 150
    add-int/lit8 v9, v9, 0x1

    .line 151
    .line 152
    aput v9, v7, v0

    .line 153
    .line 154
    add-int/lit8 p1, p1, -0x1

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_4
    aput v10, v7, v0

    .line 158
    .line 159
    :cond_5
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    if-nez v0, :cond_7

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_7
    move v9, v0

    .line 166
    :goto_5
    div-int v5, p1, v9

    .line 167
    .line 168
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    mul-int/2addr v0, v5

    .line 173
    sub-int/2addr p1, v0

    .line 174
    move v0, v10

    .line 175
    :goto_6
    if-ge v0, v1, :cond_a

    .line 176
    .line 177
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eq v6, v8, :cond_8

    .line 186
    .line 187
    aput v5, v7, v0

    .line 188
    .line 189
    if-lez p1, :cond_9

    .line 190
    .line 191
    add-int/lit8 v6, v5, 0x1

    .line 192
    .line 193
    aput v6, v7, v0

    .line 194
    .line 195
    add-int/lit8 p1, p1, -0x1

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_8
    aput v10, v7, v0

    .line 199
    .line 200
    :cond_9
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_a
    move p1, v10

    .line 204
    move v0, p1

    .line 205
    :goto_8
    if-ge p1, v1, :cond_c

    .line 206
    .line 207
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-ne v6, v8, :cond_b

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_b
    aget v6, v7, p1

    .line 219
    .line 220
    invoke-static {v6, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    invoke-virtual {v5, v6, v4}, Landroid/view/View;->measure(II)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    iput v9, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 236
    .line 237
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    add-int/2addr v0, v5

    .line 242
    :goto_9
    add-int/lit8 p1, p1, 0x1

    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_c
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    invoke-static {v0, p1, v10}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    invoke-static {v2, p2, v10}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 258
    .line 259
    .line 260
    return-void
.end method

.method public setItemHorizontalTranslationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lpk;->w0:Z

    .line 2
    .line 3
    return-void
.end method
