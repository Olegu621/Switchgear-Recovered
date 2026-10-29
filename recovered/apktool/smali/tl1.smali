.class public abstract Ltl1;
.super Landroid/view/ViewGroup;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lhh1;


# static fields
.field public static final q0:[I

.field public static final r0:[I


# instance fields
.field public U:I

.field public V:Landroid/content/res/ColorStateList;

.field public final W:Landroid/content/res/ColorStateList;

.field public final a:Landroidx/transition/AutoTransition;

.field public a0:I

.field public final b:Lu1;

.field public b0:I

.field public final c:Lot1;

.field public c0:Landroid/graphics/drawable/Drawable;

.field public final d:Landroid/util/SparseArray;

.field public d0:I

.field public e:I

.field public final e0:Landroid/util/SparseArray;

.field public f:[Lrl1;

.field public f0:I

.field public g0:I

.field public h0:Z

.field public i:I

.field public i0:I

.field public j0:I

.field public k0:I

.field public l0:Ltc2;

.field public m0:Z

.field public n0:Landroid/content/res/ColorStateList;

.field public o0:Lcom/google/android/material/navigation/b;

.field public p0:Ljg1;

.field public v:I

.field public w:Landroid/content/res/ColorStateList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Ltl1;->q0:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ltl1;->r0:[I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lot1;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-direct {p1, v0}, Lot1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ltl1;->c:Lot1;

    .line 11
    .line 12
    new-instance p1, Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ltl1;->d:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Ltl1;->i:I

    .line 21
    .line 22
    iput p1, p0, Ltl1;->v:I

    .line 23
    .line 24
    new-instance v1, Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ltl1;->e0:Landroid/util/SparseArray;

    .line 30
    .line 31
    const/4 v0, -0x1

    .line 32
    iput v0, p0, Ltl1;->f0:I

    .line 33
    .line 34
    iput v0, p0, Ltl1;->g0:I

    .line 35
    .line 36
    iput-boolean p1, p0, Ltl1;->m0:Z

    .line 37
    .line 38
    invoke-virtual {p0}, Ltl1;->c()Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ltl1;->W:Landroid/content/res/ColorStateList;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Ltl1;->a:Landroidx/transition/AutoTransition;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Landroidx/transition/AutoTransition;

    .line 55
    .line 56
    invoke-direct {v0}, Landroidx/transition/AutoTransition;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Ltl1;->a:Landroidx/transition/AutoTransition;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->K(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget v1, Lcom/google/android/material/R$attr;->motionDurationLong1:I

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget v3, Lcom/google/android/material/R$integer;->material_motion_duration_long_1:I

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-static {p1, v1}, Lyy1;->C(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    iget v1, p1, Landroid/util/TypedValue;->type:I

    .line 87
    .line 88
    const/16 v3, 0x10

    .line 89
    .line 90
    if-ne v1, v3, :cond_1

    .line 91
    .line 92
    iget v2, p1, Landroid/util/TypedValue;->data:I

    .line 93
    .line 94
    :cond_1
    int-to-long v1, v2

    .line 95
    invoke-virtual {v0, v1, v2}, Landroidx/transition/TransitionSet;->I(J)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sget v1, Lcom/google/android/material/R$attr;->motionEasingStandard:I

    .line 103
    .line 104
    sget-object v2, Lu8;->b:Lxg0;

    .line 105
    .line 106
    invoke-static {p1, v1, v2}, Lhu0;->y0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->J(Landroid/animation/TimeInterpolator;)V

    .line 111
    .line 112
    .line 113
    new-instance p1, Ljn2;

    .line 114
    .line 115
    invoke-direct {p1}, Landroidx/transition/Transition;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->H(Landroidx/transition/Transition;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    new-instance p1, Lu1;

    .line 122
    .line 123
    const/4 v0, 0x6

    .line 124
    invoke-direct {p1, p0, v0}, Lu1;-><init>(Ljava/lang/Object;I)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Ltl1;->b:Lu1;

    .line 128
    .line 129
    sget-object p1, Le33;->a:Ljava/util/WeakHashMap;

    .line 130
    .line 131
    const/4 p1, 0x1

    .line 132
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public static f(II)Z
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x3

    .line 5
    if-le p1, p0, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-nez p0, :cond_1

    .line 9
    .line 10
    :goto_0
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_1
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method private getNewItem()Lrl1;
    .locals 1

    .line 1
    iget-object v0, p0, Ltl1;->c:Lot1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lot1;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lrl1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Ltl1;->e(Landroid/content/Context;)Lrl1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    return-object v0
.end method

.method private setBadgeIfNeeded(Lrl1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Ltl1;->e0:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lmh;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lrl1;->setBadge(Lmh;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltl1;->f:[Lrl1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    array-length v4, v0

    .line 12
    move v5, v3

    .line 13
    :goto_0
    if-ge v5, v4, :cond_7

    .line 14
    .line 15
    aget-object v6, v0, v5

    .line 16
    .line 17
    if-eqz v6, :cond_6

    .line 18
    .line 19
    iget-object v7, p0, Ltl1;->c:Lot1;

    .line 20
    .line 21
    invoke-virtual {v7, v6}, Lot1;->c(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v7, v6, Lrl1;->V:Landroid/widget/ImageView;

    .line 25
    .line 26
    iget-object v8, v6, Lrl1;->p0:Lmh;

    .line 27
    .line 28
    if-eqz v8, :cond_5

    .line 29
    .line 30
    if-eqz v7, :cond_4

    .line 31
    .line 32
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v8, v6, Lrl1;->p0:Lmh;

    .line 39
    .line 40
    if-nez v8, :cond_0

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_0
    iget-object v9, v8, Lmh;->X:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    if-eqz v9, :cond_1

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    check-cast v9, Landroid/widget/FrameLayout;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v9, v1

    .line 55
    :goto_1
    if-eqz v9, :cond_3

    .line 56
    .line 57
    iget-object v7, v8, Lmh;->X:Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    if-eqz v7, :cond_2

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Landroid/widget/FrameLayout;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move-object v7, v1

    .line 69
    :goto_2
    invoke-virtual {v7, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v7}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7, v8}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_3
    iput-object v1, v6, Lrl1;->p0:Lmh;

    .line 81
    .line 82
    :cond_5
    iput-object v1, v6, Lrl1;->d0:Lsg1;

    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    iput v7, v6, Lrl1;->j0:F

    .line 86
    .line 87
    iput-boolean v3, v6, Lrl1;->a:Z

    .line 88
    .line 89
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_7
    iget-object v0, p0, Ltl1;->p0:Ljg1;

    .line 93
    .line 94
    iget-object v0, v0, Ljg1;->f:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_8

    .line 101
    .line 102
    iput v3, p0, Ltl1;->i:I

    .line 103
    .line 104
    iput v3, p0, Ltl1;->v:I

    .line 105
    .line 106
    iput-object v1, p0, Ltl1;->f:[Lrl1;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_8
    new-instance v0, Ljava/util/HashSet;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    move v1, v3

    .line 115
    :goto_4
    iget-object v4, p0, Ltl1;->p0:Ljg1;

    .line 116
    .line 117
    iget-object v4, v4, Ljg1;->f:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-ge v1, v4, :cond_9

    .line 124
    .line 125
    iget-object v4, p0, Ltl1;->p0:Ljg1;

    .line 126
    .line 127
    invoke-virtual {v4, v1}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    add-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    move v1, v3

    .line 146
    :goto_5
    iget-object v4, p0, Ltl1;->e0:Landroid/util/SparseArray;

    .line 147
    .line 148
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-ge v1, v5, :cond_b

    .line 153
    .line 154
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-nez v6, :cond_a

    .line 167
    .line 168
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->delete(I)V

    .line 169
    .line 170
    .line 171
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_b
    iget-object v0, p0, Ltl1;->p0:Ljg1;

    .line 175
    .line 176
    iget-object v0, v0, Ljg1;->f:Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    new-array v0, v0, [Lrl1;

    .line 183
    .line 184
    iput-object v0, p0, Ltl1;->f:[Lrl1;

    .line 185
    .line 186
    iget v0, p0, Ltl1;->e:I

    .line 187
    .line 188
    iget-object v1, p0, Ltl1;->p0:Ljg1;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljg1;->l()Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-static {v0, v1}, Ltl1;->f(II)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    move v1, v3

    .line 203
    :goto_6
    iget-object v4, p0, Ltl1;->p0:Ljg1;

    .line 204
    .line 205
    iget-object v4, v4, Ljg1;->f:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-ge v1, v4, :cond_10

    .line 212
    .line 213
    iget-object v4, p0, Ltl1;->o0:Lcom/google/android/material/navigation/b;

    .line 214
    .line 215
    iput-boolean v2, v4, Lcom/google/android/material/navigation/b;->b:Z

    .line 216
    .line 217
    iget-object v4, p0, Ltl1;->p0:Ljg1;

    .line 218
    .line 219
    invoke-virtual {v4, v1}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 224
    .line 225
    .line 226
    iget-object v4, p0, Ltl1;->o0:Lcom/google/android/material/navigation/b;

    .line 227
    .line 228
    iput-boolean v3, v4, Lcom/google/android/material/navigation/b;->b:Z

    .line 229
    .line 230
    invoke-direct {p0}, Ltl1;->getNewItem()Lrl1;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    iget-object v5, p0, Ltl1;->f:[Lrl1;

    .line 235
    .line 236
    aput-object v4, v5, v1

    .line 237
    .line 238
    iget-object v5, p0, Ltl1;->w:Landroid/content/res/ColorStateList;

    .line 239
    .line 240
    invoke-virtual {v4, v5}, Lrl1;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 241
    .line 242
    .line 243
    iget v5, p0, Ltl1;->U:I

    .line 244
    .line 245
    invoke-virtual {v4, v5}, Lrl1;->setIconSize(I)V

    .line 246
    .line 247
    .line 248
    iget-object v5, p0, Ltl1;->W:Landroid/content/res/ColorStateList;

    .line 249
    .line 250
    invoke-virtual {v4, v5}, Lrl1;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 251
    .line 252
    .line 253
    iget v5, p0, Ltl1;->a0:I

    .line 254
    .line 255
    invoke-virtual {v4, v5}, Lrl1;->setTextAppearanceInactive(I)V

    .line 256
    .line 257
    .line 258
    iget v5, p0, Ltl1;->b0:I

    .line 259
    .line 260
    invoke-virtual {v4, v5}, Lrl1;->setTextAppearanceActive(I)V

    .line 261
    .line 262
    .line 263
    iget-object v5, p0, Ltl1;->V:Landroid/content/res/ColorStateList;

    .line 264
    .line 265
    invoke-virtual {v4, v5}, Lrl1;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 266
    .line 267
    .line 268
    iget v5, p0, Ltl1;->f0:I

    .line 269
    .line 270
    const/4 v6, -0x1

    .line 271
    if-eq v5, v6, :cond_c

    .line 272
    .line 273
    invoke-virtual {v4, v5}, Lrl1;->setItemPaddingTop(I)V

    .line 274
    .line 275
    .line 276
    :cond_c
    iget v5, p0, Ltl1;->g0:I

    .line 277
    .line 278
    if-eq v5, v6, :cond_d

    .line 279
    .line 280
    invoke-virtual {v4, v5}, Lrl1;->setItemPaddingBottom(I)V

    .line 281
    .line 282
    .line 283
    :cond_d
    iget v5, p0, Ltl1;->i0:I

    .line 284
    .line 285
    invoke-virtual {v4, v5}, Lrl1;->setActiveIndicatorWidth(I)V

    .line 286
    .line 287
    .line 288
    iget v5, p0, Ltl1;->j0:I

    .line 289
    .line 290
    invoke-virtual {v4, v5}, Lrl1;->setActiveIndicatorHeight(I)V

    .line 291
    .line 292
    .line 293
    iget v5, p0, Ltl1;->k0:I

    .line 294
    .line 295
    invoke-virtual {v4, v5}, Lrl1;->setActiveIndicatorMarginHorizontal(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Ltl1;->d()Lfd1;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-virtual {v4, v5}, Lrl1;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 303
    .line 304
    .line 305
    iget-boolean v5, p0, Ltl1;->m0:Z

    .line 306
    .line 307
    invoke-virtual {v4, v5}, Lrl1;->setActiveIndicatorResizeable(Z)V

    .line 308
    .line 309
    .line 310
    iget-boolean v5, p0, Ltl1;->h0:Z

    .line 311
    .line 312
    invoke-virtual {v4, v5}, Lrl1;->setActiveIndicatorEnabled(Z)V

    .line 313
    .line 314
    .line 315
    iget-object v5, p0, Ltl1;->c0:Landroid/graphics/drawable/Drawable;

    .line 316
    .line 317
    if-eqz v5, :cond_e

    .line 318
    .line 319
    invoke-virtual {v4, v5}, Lrl1;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_e
    iget v5, p0, Ltl1;->d0:I

    .line 324
    .line 325
    invoke-virtual {v4, v5}, Lrl1;->setItemBackground(I)V

    .line 326
    .line 327
    .line 328
    :goto_7
    invoke-virtual {v4, v0}, Lrl1;->setShifting(Z)V

    .line 329
    .line 330
    .line 331
    iget v5, p0, Ltl1;->e:I

    .line 332
    .line 333
    invoke-virtual {v4, v5}, Lrl1;->setLabelVisibilityMode(I)V

    .line 334
    .line 335
    .line 336
    iget-object v5, p0, Ltl1;->p0:Ljg1;

    .line 337
    .line 338
    invoke-virtual {v5, v1}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Lsg1;

    .line 343
    .line 344
    invoke-virtual {v4, v5}, Lrl1;->c(Lsg1;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4, v1}, Lrl1;->setItemPosition(I)V

    .line 348
    .line 349
    .line 350
    iget v5, v5, Lsg1;->a:I

    .line 351
    .line 352
    iget-object v6, p0, Ltl1;->d:Landroid/util/SparseArray;

    .line 353
    .line 354
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    check-cast v6, Landroid/view/View$OnTouchListener;

    .line 359
    .line 360
    invoke-virtual {v4, v6}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 361
    .line 362
    .line 363
    iget-object v6, p0, Ltl1;->b:Lu1;

    .line 364
    .line 365
    invoke-virtual {v4, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 366
    .line 367
    .line 368
    iget v6, p0, Ltl1;->i:I

    .line 369
    .line 370
    if-eqz v6, :cond_f

    .line 371
    .line 372
    if-ne v5, v6, :cond_f

    .line 373
    .line 374
    iput v1, p0, Ltl1;->v:I

    .line 375
    .line 376
    :cond_f
    invoke-direct {p0, v4}, Ltl1;->setBadgeIfNeeded(Lrl1;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 380
    .line 381
    .line 382
    add-int/lit8 v1, v1, 0x1

    .line 383
    .line 384
    goto/16 :goto_6

    .line 385
    .line 386
    :cond_10
    iget-object v0, p0, Ltl1;->p0:Ljg1;

    .line 387
    .line 388
    iget-object v0, v0, Ljg1;->f:Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    sub-int/2addr v0, v2

    .line 395
    iget v1, p0, Ltl1;->v:I

    .line 396
    .line 397
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    iput v0, p0, Ltl1;->v:I

    .line 402
    .line 403
    iget-object p0, p0, Ltl1;->p0:Ljg1;

    .line 404
    .line 405
    invoke-virtual {p0, v0}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    invoke-interface {p0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 410
    .line 411
    .line 412
    return-void
.end method

.method public final b(Ljg1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltl1;->p0:Ljg1;

    .line 2
    .line 3
    return-void
.end method

.method public final c()Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x1010038

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 30
    .line 31
    invoke-static {v1, v2}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget v2, Landroidx/appcompat/R$attr;->colorPrimary:I

    .line 44
    .line 45
    invoke-virtual {p0, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_1
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 60
    .line 61
    sget-object v3, Ltl1;->q0:[I

    .line 62
    .line 63
    sget-object v4, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 64
    .line 65
    sget-object v5, Ltl1;->r0:[I

    .line 66
    .line 67
    filled-new-array {v5, v3, v4}, [[I

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v1, v5, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    filled-new-array {v1, p0, v0}, [I

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-direct {v2, v3, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 80
    .line 81
    .line 82
    return-object v2
.end method

.method public final d()Lfd1;
    .locals 2

    .line 1
    iget-object v0, p0, Ltl1;->l0:Ltc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ltl1;->n0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lfd1;

    .line 10
    .line 11
    iget-object v1, p0, Ltl1;->l0:Ltc2;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lfd1;-><init>(Ltc2;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ltl1;->n0:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public abstract e(Landroid/content/Context;)Lrl1;
.end method

.method public getBadgeDrawables()Landroid/util/SparseArray;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lmh;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltl1;->e0:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ltl1;->w:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ltl1;->n0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemActiveIndicatorEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ltl1;->h0:Z

    .line 2
    .line 3
    return p0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->j0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->k0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemActiveIndicatorShapeAppearance()Ltc2;
    .locals 0

    .line 1
    iget-object p0, p0, Ltl1;->l0:Ltc2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->i0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Ltl1;->f:[Lrl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    aget-object p0, v0, p0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Ltl1;->c0:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    return-object p0
.end method

.method public getItemBackgroundRes()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Ltl1;->d0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemIconSize()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->U:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemPaddingBottom()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->g0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemPaddingTop()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->f0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemTextAppearanceActive()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->b0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->a0:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ltl1;->V:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLabelVisibilityMode()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public getMenu()Ljg1;
    .locals 0

    .line 1
    iget-object p0, p0, Ltl1;->p0:Ljg1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelectedItemId()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public getSelectedItemPosition()I
    .locals 0

    .line 1
    iget p0, p0, Ltl1;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public getWindowAnimations()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ltl1;->p0:Ljg1;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljg1;->l()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {v0, p0, v0}, Ld1;->b(III)Ld1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Ld1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ltl1;->w:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ltl1;->n0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p1, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Ltl1;->d()Lfd1;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Lrl1;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Ltl1;->h0:Z

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setActiveIndicatorEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->j0:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setActiveIndicatorHeight(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->k0:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setActiveIndicatorMarginHorizontal(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorResizeable(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Ltl1;->m0:Z

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setActiveIndicatorResizeable(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Ltc2;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ltl1;->l0:Ltc2;

    .line 2
    .line 3
    iget-object p1, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Ltl1;->d()Lfd1;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Lrl1;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->i0:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setActiveIndicatorWidth(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ltl1;->c0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackgroundRes(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->d0:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setItemBackground(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->U:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setIconSize(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->g0:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setItemPaddingBottom(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 3

    .line 1
    iput p1, p0, Ltl1;->f0:I

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setItemPaddingTop(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 5

    .line 1
    iput p1, p0, Ltl1;->b0:I

    .line 2
    .line 3
    iget-object v0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Lrl1;->setTextAppearanceActive(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ltl1;->V:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Lrl1;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 5

    .line 1
    iput p1, p0, Ltl1;->a0:I

    .line 2
    .line 3
    iget-object v0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Lrl1;->setTextAppearanceInactive(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ltl1;->V:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Lrl1;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ltl1;->V:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lrl1;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltl1;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setPresenter(Lcom/google/android/material/navigation/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltl1;->o0:Lcom/google/android/material/navigation/b;

    .line 2
    .line 3
    return-void
.end method
