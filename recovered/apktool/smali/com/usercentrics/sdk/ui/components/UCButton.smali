.class public final Lcom/usercentrics/sdk/ui/components/UCButton;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\r\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nR#\u0010\u0011\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/usercentrics/sdk/ui/components/UCButton;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lcom/usercentrics/sdk/ui/components/UCImageView;",
        "kotlin.jvm.PlatformType",
        "g0",
        "Lp51;",
        "getUcButtonBackground",
        "()Lcom/usercentrics/sdk/ui/components/UCImageView;",
        "ucButtonBackground",
        "Lcom/usercentrics/sdk/ui/components/UCTextView;",
        "h0",
        "getUcButtonText",
        "()Lcom/usercentrics/sdk/ui/components/UCTextView;",
        "ucButtonText",
        "",
        "value",
        "getText",
        "()Ljava/lang/CharSequence;",
        "setText",
        "(Ljava/lang/CharSequence;)V",
        "text",
        "usercentrics-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic i0:I


# instance fields
.field public final g0:Lhk2;

.field public final h0:Lhk2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, p2, v0}, Lcom/usercentrics/sdk/ui/components/UCButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lct2;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-direct {p1, p0, p2}, Lct2;-><init>(Lcom/usercentrics/sdk/ui/components/UCButton;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/UCButton;->g0:Lhk2;

    .line 18
    .line 19
    new-instance p1, Lct2;

    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    invoke-direct {p1, p0, p2}, Lct2;-><init>(Lcom/usercentrics/sdk/ui/components/UCButton;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/UCButton;->h0:Lhk2;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget p2, Lcom/usercentrics/sdk/ui/R$layout;->uc_button:I

    .line 40
    .line 41
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private final getUcButtonBackground()Lcom/usercentrics/sdk/ui/components/UCImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCButton;->g0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getUcButtonText()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCButton;->h0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method public static j(ILcom/usercentrics/sdk/ui/components/UCButton;ILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x8

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    new-instance p4, Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    invoke-direct {p4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 9
    .line 10
    .line 11
    int-to-float p0, p0

    .line 12
    invoke-virtual {p4, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p4, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 16
    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/high16 p2, 0x40800000    # 4.0f

    .line 32
    .line 33
    invoke-static {p2, p1}, Lyy1;->n(FLandroid/content/Context;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    float-to-int p1, p1

    .line 38
    invoke-virtual {p4, p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-object p4
.end method


# virtual methods
.method public final getText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCButton;->getUcButtonText()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final k(Lgt2;Lkotlin/jvm/functions/Function0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lgt2;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/usercentrics/sdk/ui/components/UCButton;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lh51;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    invoke-direct {v2, v4, v3}, Lh51;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/high16 v3, 0x42200000    # 40.0f

    .line 32
    .line 33
    invoke-static {v3, v2}, Lyy1;->n(FLandroid/content/Context;)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    float-to-int v2, v2

    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/UCButton;->getUcButtonText()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v1, Lgt2;->b:Ljava/lang/Integer;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    if-eqz v2, :cond_7

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget v4, v1, Lgt2;->c:I

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    int-to-float v4, v4

    .line 68
    invoke-static {v4, v5}, Lyy1;->n(FLandroid/content/Context;)F

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    float-to-int v4, v4

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    instance-of v6, v5, Landroid/view/ViewGroup;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    if-eqz v6, :cond_0

    .line 81
    .line 82
    check-cast v5, Landroid/view/ViewGroup;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move-object v5, v7

    .line 86
    :goto_0
    if-eqz v5, :cond_1

    .line 87
    .line 88
    invoke-virtual {v5}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-object v5, v7

    .line 94
    :goto_1
    instance-of v6, v5, Landroid/graphics/drawable/ColorDrawable;

    .line 95
    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    check-cast v5, Landroid/graphics/drawable/ColorDrawable;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    move-object v5, v7

    .line 102
    :goto_2
    if-eqz v5, :cond_3

    .line 103
    .line 104
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    goto :goto_3

    .line 109
    :cond_3
    const/4 v5, -0x1

    .line 110
    :goto_3
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    const/16 v8, 0xff

    .line 115
    .line 116
    if-ge v6, v8, :cond_4

    .line 117
    .line 118
    invoke-static {v2, v5}, Lbx;->d(II)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    :cond_4
    const/4 v6, 0x6

    .line 123
    new-array v8, v6, [I

    .line 124
    .line 125
    fill-array-data v8, :array_0

    .line 126
    .line 127
    .line 128
    aget v9, v8, v3

    .line 129
    .line 130
    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    .line 131
    .line 132
    move v12, v3

    .line 133
    :goto_4
    if-ge v12, v6, :cond_6

    .line 134
    .line 135
    aget v13, v8, v12

    .line 136
    .line 137
    invoke-static {v13, v2}, Lbx;->b(II)D

    .line 138
    .line 139
    .line 140
    move-result-wide v14

    .line 141
    move/from16 v16, v4

    .line 142
    .line 143
    invoke-static {v13, v5}, Lbx;->b(II)D

    .line 144
    .line 145
    .line 146
    move-result-wide v3

    .line 147
    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    cmpl-double v14, v3, v10

    .line 152
    .line 153
    if-lez v14, :cond_5

    .line 154
    .line 155
    move-wide v10, v3

    .line 156
    move v9, v13

    .line 157
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 158
    .line 159
    move/from16 v4, v16

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    goto :goto_4

    .line 163
    :cond_6
    move/from16 v16, v4

    .line 164
    .line 165
    const/16 v3, 0x18

    .line 166
    .line 167
    invoke-static {v4, v0, v2, v7, v3}, Lcom/usercentrics/sdk/ui/components/UCButton;->j(ILcom/usercentrics/sdk/ui/components/UCButton;ILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    const/16 v6, 0x10

    .line 176
    .line 177
    invoke-static {v4, v0, v2, v5, v6}, Lcom/usercentrics/sdk/ui/components/UCButton;->j(ILcom/usercentrics/sdk/ui/components/UCButton;ILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    new-instance v4, Landroid/graphics/drawable/StateListDrawable;

    .line 182
    .line 183
    invoke-direct {v4}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 184
    .line 185
    .line 186
    const v5, 0x101009c

    .line 187
    .line 188
    .line 189
    filled-new-array {v5}, [I

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {v4, v5, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 194
    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    new-array v5, v2, [I

    .line 198
    .line 199
    invoke-virtual {v4, v5, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_7
    move v2, v3

    .line 207
    :goto_5
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/UCButton;->getUcButtonText()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 212
    .line 213
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 214
    .line 215
    .line 216
    const/4 v3, 0x2

    .line 217
    iget v4, v1, Lgt2;->e:F

    .line 218
    .line 219
    invoke-virtual {v0, v3, v4}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setAllCaps(Z)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v1, Lgt2;->d:Ljava/lang/Integer;

    .line 226
    .line 227
    if-eqz v1, :cond_8

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 234
    .line 235
    .line 236
    :cond_8
    return-void

    .line 237
    :array_0
    .array-data 4
        -0x1
        -0x1000000
        -0x10000
        -0xff0100
        -0x100
        -0xffff01
    .end array-data
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCButton;->getUcButtonText()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
