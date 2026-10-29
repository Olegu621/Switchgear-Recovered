.class public abstract Loi;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:I

.field public b:I

.field public c:[I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Loi;->c:[I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_progress_track_thickness:I

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    sget-object v4, Lcom/google/android/material/R$styleable;->BaseProgressIndicator:[I

    .line 20
    .line 21
    new-array v7, v0, [I

    .line 22
    .line 23
    invoke-static {p1, p2, p3, p4}, Lrn2;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 24
    .line 25
    .line 26
    move-object v2, p1

    .line 27
    move-object v3, p2

    .line 28
    move v5, p3

    .line 29
    move v6, p4

    .line 30
    invoke-static/range {v2 .. v7}, Lrn2;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_trackThickness:I

    .line 38
    .line 39
    invoke-static {v2, p1, p2, v1}, Lde3;->p(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iput p2, p0, Loi;->a:I

    .line 44
    .line 45
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_trackCornerRadius:I

    .line 46
    .line 47
    invoke-static {v2, p1, p2, v0}, Lde3;->p(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget p3, p0, Loi;->a:I

    .line 52
    .line 53
    div-int/lit8 p3, p3, 0x2

    .line 54
    .line 55
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iput p2, p0, Loi;->b:I

    .line 60
    .line 61
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_showAnimationBehavior:I

    .line 62
    .line 63
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iput p2, p0, Loi;->e:I

    .line 68
    .line 69
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_hideAnimationBehavior:I

    .line 70
    .line 71
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput p2, p0, Loi;->f:I

    .line 76
    .line 77
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_indicatorColor:I

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    const/4 p3, -0x1

    .line 84
    if-nez p2, :cond_0

    .line 85
    .line 86
    sget p2, Lcom/google/android/material/R$attr;->colorPrimary:I

    .line 87
    .line 88
    invoke-static {v2, p2, p3}, Lxe2;->r(Landroid/content/Context;II)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    filled-new-array {p2}, [I

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iput-object p2, p0, Loi;->c:[I

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_indicatorColor:I

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    iget p2, p2, Landroid/util/TypedValue;->type:I

    .line 106
    .line 107
    const/4 p4, 0x1

    .line 108
    if-eq p2, p4, :cond_1

    .line 109
    .line 110
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_indicatorColor:I

    .line 111
    .line 112
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    filled-new-array {p2}, [I

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iput-object p2, p0, Loi;->c:[I

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    sget p4, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_indicatorColor:I

    .line 128
    .line 129
    invoke-virtual {p1, p4, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 130
    .line 131
    .line 132
    move-result p4

    .line 133
    invoke-virtual {p2, p4}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    iput-object p2, p0, Loi;->c:[I

    .line 138
    .line 139
    array-length p2, p2

    .line 140
    if-eqz p2, :cond_3

    .line 141
    .line 142
    :goto_0
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_trackColor:I

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_2

    .line 149
    .line 150
    sget p2, Lcom/google/android/material/R$styleable;->BaseProgressIndicator_trackColor:I

    .line 151
    .line 152
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    iput p2, p0, Loi;->d:I

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    iget-object p2, p0, Loi;->c:[I

    .line 160
    .line 161
    aget p2, p2, v0

    .line 162
    .line 163
    iput p2, p0, Loi;->d:I

    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const p3, 0x1010033

    .line 170
    .line 171
    .line 172
    filled-new-array {p3}, [I

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-virtual {p2, p3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    const p3, 0x3e4ccccd    # 0.2f

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 188
    .line 189
    .line 190
    const/high16 p2, 0x437f0000    # 255.0f

    .line 191
    .line 192
    mul-float/2addr p3, p2

    .line 193
    float-to-int p2, p3

    .line 194
    iget p3, p0, Loi;->d:I

    .line 195
    .line 196
    invoke-static {p3, p2}, Lxe2;->j(II)I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    iput p2, p0, Loi;->d:I

    .line 201
    .line 202
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_3
    const-string p0, "indicatorColors cannot be empty when indicatorColor is not used."

    .line 207
    .line 208
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const/4 p0, 0x0

    .line 212
    throw p0
.end method


# virtual methods
.method public abstract a()V
.end method
