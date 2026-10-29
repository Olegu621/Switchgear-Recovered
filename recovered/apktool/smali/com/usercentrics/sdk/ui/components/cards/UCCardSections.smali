.class public final Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;",
        "Landroid/widget/LinearLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "a",
        "Lp51;",
        "getCardDefaultMargin",
        "()I",
        "cardDefaultMargin",
        "Lau1;",
        "b",
        "getAriaLabels",
        "()Lau1;",
        "ariaLabels",
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


# instance fields
.field public final a:Lhk2;

.field public final b:Lhk2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, v0}, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lf8;

    .line 8
    .line 9
    const/16 p2, 0xc

    .line 10
    .line 11
    invoke-direct {p1, p0, p2}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->a:Lhk2;

    .line 19
    .line 20
    sget-object p1, Lyh;->g0:Lyh;

    .line 21
    .line 22
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->b:Lhk2;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    .line 34
    const/4 p2, -0x1

    .line 35
    const/4 p3, -0x2

    .line 36
    invoke-direct {p1, p2, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private final getAriaLabels()Lau1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->b:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lau1;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCardDefaultMargin()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->a:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final a(Lew2;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Lew2;->a:Lwt2;

    .line 11
    .line 12
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_12

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lyt2;

    .line 33
    .line 34
    instance-of v6, v5, Lkw2;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/16 v9, 0x8

    .line 38
    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast v5, Lkw2;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->getAriaLabels()Lau1;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget v12, Lcom/usercentrics/sdk/ui/R$layout;->uc_card_section_toggle_entry:I

    .line 65
    .line 66
    invoke-virtual {v11, v12, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    sget v12, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionToggleEntrySwitch:I

    .line 71
    .line 72
    invoke-virtual {v11, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    check-cast v12, Lcom/usercentrics/sdk/ui/components/UCToggle;

    .line 77
    .line 78
    sget v13, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionToggleEntryText:I

    .line 79
    .line 80
    invoke-virtual {v11, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    check-cast v13, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 85
    .line 86
    sget v14, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionToggleEntryInfo:I

    .line 87
    .line 88
    invoke-virtual {v11, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    check-cast v14, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 93
    .line 94
    iget-object v15, v5, Lkw2;->c:Lfw2;

    .line 95
    .line 96
    iget-object v8, v5, Lkw2;->b:Ljava/lang/String;

    .line 97
    .line 98
    if-eqz v15, :cond_0

    .line 99
    .line 100
    invoke-virtual {v12, v1}, Lcom/usercentrics/sdk/ui/components/UCToggle;->f(Lew2;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v15}, Lcom/usercentrics/sdk/ui/components/UCToggle;->e(Lfw2;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v7}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_0
    invoke-virtual {v12, v9}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    :goto_1
    invoke-virtual {v13, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14}, Landroid/view/View;->getId()I

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    invoke-virtual {v13, v15}, Landroid/view/View;->setLabelFor(I)V

    .line 127
    .line 128
    .line 129
    const/16 v15, 0x1e

    .line 130
    .line 131
    invoke-static {v13, v1, v15}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 132
    .line 133
    .line 134
    if-eqz v2, :cond_1

    .line 135
    .line 136
    move v9, v7

    .line 137
    :cond_1
    invoke-static {v14}, Lxe2;->c(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v14, v9}, Landroid/view/View;->setVisibility(I)V

    .line 141
    .line 142
    .line 143
    iget-object v9, v10, Lau1;->f:Ljava/lang/String;

    .line 144
    .line 145
    new-instance v10, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v8, " "

    .line 154
    .line 155
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-virtual {v14, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    new-instance v8, Lrp2;

    .line 169
    .line 170
    invoke-direct {v8, v7, v2, v5}, Lrp2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v14, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    .line 175
    .line 176
    sget v5, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_info:I

    .line 177
    .line 178
    invoke-static {v6, v5}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    if-eqz v5, :cond_3

    .line 183
    .line 184
    iget-object v6, v3, Lwt2;->b:Ljava/lang/Integer;

    .line 185
    .line 186
    if-eqz v6, :cond_2

    .line 187
    .line 188
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    new-instance v7, Landroid/graphics/PorterDuffColorFilter;

    .line 193
    .line 194
    sget-object v8, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 195
    .line 196
    invoke-direct {v7, v6, v8}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 200
    .line 201
    .line 202
    :cond_2
    move-object v8, v5

    .line 203
    goto :goto_2

    .line 204
    :cond_3
    const/4 v8, 0x0

    .line 205
    :goto_2
    invoke-virtual {v14, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v12}, Lxe2;->c(Landroid/view/View;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_b

    .line 215
    .line 216
    :cond_4
    instance-of v6, v5, Lzt2;

    .line 217
    .line 218
    const/16 v8, 0xe

    .line 219
    .line 220
    const/high16 v10, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v11, 0x40000000    # 2.0f

    .line 223
    .line 224
    if-eqz v6, :cond_c

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    check-cast v5, Lzt2;

    .line 234
    .line 235
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    sget v13, Lcom/usercentrics/sdk/ui/R$layout;->uc_card_section_entry:I

    .line 243
    .line 244
    invoke-virtual {v12, v13, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    sget v13, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionEntryTitle:I

    .line 249
    .line 250
    invoke-virtual {v12, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    check-cast v13, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 255
    .line 256
    iget-object v14, v5, Lzt2;->a:Ljava/lang/String;

    .line 257
    .line 258
    iget-object v15, v5, Lzt2;->b:Ljava/lang/String;

    .line 259
    .line 260
    if-eqz v14, :cond_6

    .line 261
    .line 262
    invoke-static {v14}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result v16

    .line 266
    if-eqz v16, :cond_5

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_5
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    const/4 v14, 0x6

    .line 273
    invoke-static {v13, v1, v14}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_6
    :goto_3
    invoke-virtual {v13, v9}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    :goto_4
    sget v13, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionEntryDescription:I

    .line 281
    .line 282
    invoke-virtual {v12, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    check-cast v13, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 287
    .line 288
    if-eqz v15, :cond_8

    .line 289
    .line 290
    invoke-static {v15}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 291
    .line 292
    .line 293
    move-result v14

    .line 294
    if-eqz v14, :cond_7

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_7
    invoke-virtual {v13, v7}, Landroid/view/View;->setVisibility(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v13, v1, v8}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_8
    :goto_5
    invoke-virtual {v13, v9}, Landroid/view/View;->setVisibility(I)V

    .line 308
    .line 309
    .line 310
    :goto_6
    sget v9, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionEntryFlexbox:I

    .line 311
    .line 312
    invoke-virtual {v12, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    check-cast v9, Lcom/google/android/flexbox/FlexboxLayout;

    .line 317
    .line 318
    iget-object v13, v5, Lzt2;->c:Lwe2;

    .line 319
    .line 320
    if-eqz v13, :cond_9

    .line 321
    .line 322
    new-instance v14, Lcom/usercentrics/sdk/ui/components/links/UCLink;

    .line 323
    .line 324
    const/4 v15, 0x0

    .line 325
    invoke-direct {v14, v6, v15}, Lcom/usercentrics/sdk/ui/components/links/UCLink;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v14, v1}, Lcom/usercentrics/sdk/ui/components/links/UCLink;->k(Lew2;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v14, v13}, Lcom/usercentrics/sdk/ui/components/links/UCLink;->j(Lwe2;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v9, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v14}, Lxe2;->k(Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    :cond_9
    iget-object v5, v5, Lzt2;->d:Ljava/util/List;

    .line 341
    .line 342
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v13

    .line 350
    if-eqz v13, :cond_b

    .line 351
    .line 352
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v13

    .line 356
    check-cast v13, Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    sget v15, Lcom/usercentrics/sdk/ui/R$layout;->uc_tag:I

    .line 366
    .line 367
    invoke-virtual {v14, v15, v9, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    check-cast v14, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 375
    .line 376
    invoke-virtual {v14, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    .line 378
    .line 379
    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    .line 380
    .line 381
    invoke-direct {v13}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v13, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 385
    .line 386
    .line 387
    invoke-static {v11, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 388
    .line 389
    .line 390
    move-result v15

    .line 391
    float-to-int v15, v15

    .line 392
    int-to-float v15, v15

    .line 393
    invoke-virtual {v13, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 394
    .line 395
    .line 396
    invoke-static {v10, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 397
    .line 398
    .line 399
    move-result v15

    .line 400
    float-to-int v15, v15

    .line 401
    iget v10, v3, Lwt2;->j:I

    .line 402
    .line 403
    invoke-virtual {v13, v15, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 404
    .line 405
    .line 406
    iget-object v10, v3, Lwt2;->e:Ljava/lang/Integer;

    .line 407
    .line 408
    if-eqz v10, :cond_a

    .line 409
    .line 410
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    invoke-virtual {v13, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 415
    .line 416
    .line 417
    :cond_a
    invoke-virtual {v14, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v14, v1, v8}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v9, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 424
    .line 425
    .line 426
    const/high16 v10, 0x3f800000    # 1.0f

    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_b
    :goto_8
    move-object v11, v12

    .line 430
    goto/16 :goto_b

    .line 431
    .line 432
    :cond_c
    instance-of v6, v5, Lxt2;

    .line 433
    .line 434
    if-eqz v6, :cond_11

    .line 435
    .line 436
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    check-cast v5, Lxt2;

    .line 444
    .line 445
    iget v10, v3, Lwt2;->j:I

    .line 446
    .line 447
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    sget v13, Lcom/usercentrics/sdk/ui/R$layout;->uc_card_section_entry:I

    .line 455
    .line 456
    invoke-virtual {v12, v13, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 457
    .line 458
    .line 459
    move-result-object v12

    .line 460
    sget v13, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionEntryTitle:I

    .line 461
    .line 462
    invoke-virtual {v12, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v13

    .line 466
    check-cast v13, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 467
    .line 468
    iget-object v14, v5, Lxt2;->a:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    const/16 v14, 0x16

    .line 474
    .line 475
    invoke-static {v13, v1, v14}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 476
    .line 477
    .line 478
    sget v13, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionEntryDescription:I

    .line 479
    .line 480
    invoke-virtual {v12, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 481
    .line 482
    .line 483
    move-result-object v13

    .line 484
    check-cast v13, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 485
    .line 486
    invoke-virtual {v13, v9}, Landroid/view/View;->setVisibility(I)V

    .line 487
    .line 488
    .line 489
    sget v9, Lcom/usercentrics/sdk/ui/R$id;->ucCardSectionEntryFlexbox:I

    .line 490
    .line 491
    invoke-virtual {v12, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    check-cast v9, Lcom/google/android/flexbox/FlexboxLayout;

    .line 496
    .line 497
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 498
    .line 499
    .line 500
    move-result-object v13

    .line 501
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    sget v14, Lcom/usercentrics/sdk/ui/R$layout;->uc_history_table:I

    .line 505
    .line 506
    invoke-virtual {v13, v14, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 507
    .line 508
    .line 509
    move-result-object v13

    .line 510
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    check-cast v13, Landroid/widget/TableLayout;

    .line 514
    .line 515
    sget v14, Lcom/usercentrics/sdk/ui/R$id;->ucTableHeaderRow:I

    .line 516
    .line 517
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 518
    .line 519
    .line 520
    move-result-object v14

    .line 521
    sget v15, Lcom/usercentrics/sdk/ui/R$id;->ucTableDecisionHeader:I

    .line 522
    .line 523
    invoke-virtual {v13, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 524
    .line 525
    .line 526
    move-result-object v15

    .line 527
    check-cast v15, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 528
    .line 529
    sget v8, Lcom/usercentrics/sdk/ui/R$id;->ucTableDateHeader:I

    .line 530
    .line 531
    invoke-virtual {v13, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    check-cast v8, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 536
    .line 537
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 538
    .line 539
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v11, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 543
    .line 544
    .line 545
    const/high16 v7, 0x40000000    # 2.0f

    .line 546
    .line 547
    invoke-static {v7, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    float-to-int v2, v2

    .line 552
    int-to-float v2, v2

    .line 553
    invoke-virtual {v11, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x3f800000    # 1.0f

    .line 557
    .line 558
    invoke-static {v2, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    float-to-int v2, v7

    .line 563
    invoke-virtual {v11, v2, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 564
    .line 565
    .line 566
    iget-object v2, v3, Lwt2;->e:Ljava/lang/Integer;

    .line 567
    .line 568
    if-eqz v2, :cond_d

    .line 569
    .line 570
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    invoke-virtual {v11, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 575
    .line 576
    .line 577
    :cond_d
    invoke-virtual {v14, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 578
    .line 579
    .line 580
    iget-object v2, v5, Lxt2;->c:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    .line 584
    .line 585
    iget-object v2, v5, Lxt2;->d:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 588
    .line 589
    .line 590
    const/16 v2, 0xe

    .line 591
    .line 592
    invoke-static {v15, v1, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 593
    .line 594
    .line 595
    invoke-static {v8, v1, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 596
    .line 597
    .line 598
    iget-object v2, v5, Lxt2;->b:Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    if-eqz v5, :cond_10

    .line 609
    .line 610
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    check-cast v5, Lrt2;

    .line 615
    .line 616
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    sget v8, Lcom/usercentrics/sdk/ui/R$layout;->uc_history_table_row:I

    .line 624
    .line 625
    const/4 v11, 0x0

    .line 626
    invoke-virtual {v7, v8, v13, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 631
    .line 632
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 639
    .line 640
    .line 641
    const/high16 v14, 0x40000000    # 2.0f

    .line 642
    .line 643
    invoke-static {v14, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 644
    .line 645
    .line 646
    move-result v15

    .line 647
    float-to-int v15, v15

    .line 648
    int-to-float v15, v15

    .line 649
    invoke-virtual {v8, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 650
    .line 651
    .line 652
    const/high16 v15, 0x3f800000    # 1.0f

    .line 653
    .line 654
    invoke-static {v15, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 655
    .line 656
    .line 657
    move-result v11

    .line 658
    float-to-int v11, v11

    .line 659
    invoke-virtual {v8, v11, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 660
    .line 661
    .line 662
    const/high16 v11, -0x40000000    # -2.0f

    .line 663
    .line 664
    invoke-static {v11, v6}, Lyy1;->n(FLandroid/content/Context;)F

    .line 665
    .line 666
    .line 667
    move-result v11

    .line 668
    float-to-int v11, v11

    .line 669
    new-instance v17, Landroid/graphics/drawable/InsetDrawable;

    .line 670
    .line 671
    const/16 v21, 0x0

    .line 672
    .line 673
    const/16 v22, 0x0

    .line 674
    .line 675
    const/16 v19, 0x0

    .line 676
    .line 677
    move-object/from16 v18, v8

    .line 678
    .line 679
    move/from16 v20, v11

    .line 680
    .line 681
    invoke-direct/range {v17 .. v22}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 682
    .line 683
    .line 684
    move-object/from16 v8, v17

    .line 685
    .line 686
    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 687
    .line 688
    .line 689
    sget v8, Lcom/usercentrics/sdk/ui/R$id;->ucTableDecisionIcon:I

    .line 690
    .line 691
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    check-cast v8, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 696
    .line 697
    iget-boolean v11, v5, Lrt2;->a:Z

    .line 698
    .line 699
    if-eqz v11, :cond_e

    .line 700
    .line 701
    sget v11, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_yes:I

    .line 702
    .line 703
    invoke-static {v6, v11}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 704
    .line 705
    .line 706
    move-result-object v11

    .line 707
    goto :goto_a

    .line 708
    :cond_e
    sget v11, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_no:I

    .line 709
    .line 710
    invoke-static {v6, v11}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 711
    .line 712
    .line 713
    move-result-object v11

    .line 714
    :goto_a
    invoke-virtual {v8, v11}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 715
    .line 716
    .line 717
    iget-object v11, v3, Lwt2;->b:Ljava/lang/Integer;

    .line 718
    .line 719
    if-eqz v11, :cond_f

    .line 720
    .line 721
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 722
    .line 723
    .line 724
    move-result v11

    .line 725
    sget-object v14, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 726
    .line 727
    invoke-virtual {v8, v11, v14}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 728
    .line 729
    .line 730
    :cond_f
    sget v8, Lcom/usercentrics/sdk/ui/R$id;->ucTableDecisionText:I

    .line 731
    .line 732
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 733
    .line 734
    .line 735
    move-result-object v8

    .line 736
    check-cast v8, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 737
    .line 738
    iget-object v11, v5, Lrt2;->c:Ljava/lang/String;

    .line 739
    .line 740
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 741
    .line 742
    .line 743
    const/16 v11, 0xe

    .line 744
    .line 745
    invoke-static {v8, v1, v11}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 746
    .line 747
    .line 748
    sget v8, Lcom/usercentrics/sdk/ui/R$id;->ucTableDate:I

    .line 749
    .line 750
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 751
    .line 752
    .line 753
    move-result-object v8

    .line 754
    check-cast v8, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 755
    .line 756
    iget-object v5, v5, Lrt2;->b:Ljava/lang/String;

    .line 757
    .line 758
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 759
    .line 760
    .line 761
    invoke-static {v8, v1, v11}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v13, v7}, Landroid/widget/TableLayout;->addView(Landroid/view/View;)V

    .line 765
    .line 766
    .line 767
    goto/16 :goto_9

    .line 768
    .line 769
    :cond_10
    invoke-virtual {v9, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 770
    .line 771
    .line 772
    goto/16 :goto_8

    .line 773
    .line 774
    :goto_b
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 782
    .line 783
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->getCardDefaultMargin()I

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 788
    .line 789
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->getCardDefaultMargin()I

    .line 790
    .line 791
    .line 792
    move-result v5

    .line 793
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 794
    .line 795
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;->getCardDefaultMargin()I

    .line 796
    .line 797
    .line 798
    move-result v5

    .line 799
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 800
    .line 801
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 802
    .line 803
    .line 804
    move-object/from16 v2, p3

    .line 805
    .line 806
    goto/16 :goto_0

    .line 807
    .line 808
    :cond_11
    invoke-static {}, Lds0;->b()V

    .line 809
    .line 810
    .line 811
    :cond_12
    return-void
.end method
