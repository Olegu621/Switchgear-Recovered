.class public final Lo7;
.super Ldy;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Lca;


# instance fields
.field public d:Lwa;

.field public final e:Lxa;

.field public final f:Lm7;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lo7;->e(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroid/util/TypedValue;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget v3, Landroidx/appcompat/R$attr;->dialogTheme:I

    .line 18
    .line 19
    invoke-virtual {v2, v3, v1, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 20
    .line 21
    .line 22
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, p2

    .line 26
    :goto_0
    invoke-direct {p0, p1, v1}, Ldy;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lxa;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lxa;-><init>(Lo7;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lo7;->e:Lxa;

    .line 35
    .line 36
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    new-instance p2, Landroid/util/TypedValue;

    .line 43
    .line 44
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget v2, Landroidx/appcompat/R$attr;->dialogTheme:I

    .line 52
    .line 53
    invoke-virtual {p1, v2, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 54
    .line 55
    .line 56
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 57
    .line 58
    :cond_1
    move-object p1, v1

    .line 59
    check-cast p1, Lwa;

    .line 60
    .line 61
    iput p2, p1, Lwa;->E0:I

    .line 62
    .line 63
    invoke-virtual {v1}, Lia;->d()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lm7;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p1, p2, p0, v0}, Lm7;-><init>(Landroid/content/Context;Lo7;Landroid/view/Window;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lo7;->f:Lm7;

    .line 80
    .line 81
    return-void
.end method

.method public static e(Landroid/content/Context;I)I
    .locals 2

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget v0, Landroidx/appcompat/R$attr;->alertDialogTheme:I

    .line 19
    .line 20
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    return p0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldy;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwa;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwa;->w()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwa;->l0:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v1, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lwa;->X:Lqa;

    .line 28
    .line 29
    iget-object p0, p0, Lwa;->W:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Lqa;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c()Lia;
    .locals 3

    .line 1
    iget-object v0, p0, Lo7;->d:Lwa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lia;->a:Lha;

    .line 6
    .line 7
    new-instance v0, Lwa;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, Lwa;-><init>(Landroid/content/Context;Landroid/view/Window;Lca;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lo7;->d:Lwa;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Lo7;->d:Lwa;

    .line 23
    .line 24
    return-object p0
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lwa;

    .line 6
    .line 7
    iget-object v1, v0, Lwa;->V:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-super {p0, p1}, Ldy;->onCreate(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lia;->d()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final dismiss()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lia;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lo7;->e:Lxa;

    .line 10
    .line 11
    invoke-static {v1, v0, p0, p1}, Lhe3;->f(Ll31;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final f(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lia;->k(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwa;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwa;->w()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwa;->W:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final g(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final invalidateOptionsMenu()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lia;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p1}, Lo7;->d(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v0, v0, Lo7;->f:Lm7;

    .line 7
    .line 8
    iget v1, v0, Lm7;->z:I

    .line 9
    .line 10
    iget-object v2, v0, Lm7;->b:Lo7;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lo7;->setContentView(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lm7;->a:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v2, v0, Lm7;->c:Landroid/view/Window;

    .line 18
    .line 19
    sget v3, Landroidx/appcompat/R$id;->parentPanel:I

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Landroidx/appcompat/R$id;->topPanel:I

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget v5, Landroidx/appcompat/R$id;->contentPanel:I

    .line 32
    .line 33
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sget v6, Landroidx/appcompat/R$id;->buttonPanel:I

    .line 38
    .line 39
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    sget v7, Landroidx/appcompat/R$id;->customPanel:I

    .line 44
    .line 45
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Landroid/view/ViewGroup;

    .line 50
    .line 51
    iget-object v7, v0, Lm7;->g:Landroid/view/View;

    .line 52
    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v7, 0x0

    .line 57
    :goto_0
    const/4 v9, 0x1

    .line 58
    const/4 v10, 0x0

    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    move v11, v9

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v11, v10

    .line 64
    :goto_1
    if-eqz v11, :cond_2

    .line 65
    .line 66
    invoke-static {v7}, Lm7;->a(Landroid/view/View;)Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-nez v12, :cond_3

    .line 71
    .line 72
    :cond_2
    const/high16 v12, 0x20000

    .line 73
    .line 74
    invoke-virtual {v2, v12, v12}, Landroid/view/Window;->setFlags(II)V

    .line 75
    .line 76
    .line 77
    :cond_3
    const/16 v12, 0x8

    .line 78
    .line 79
    const/4 v13, -0x1

    .line 80
    if-eqz v11, :cond_5

    .line 81
    .line 82
    sget v11, Landroidx/appcompat/R$id;->custom:I

    .line 83
    .line 84
    invoke-virtual {v2, v11}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    check-cast v11, Landroid/widget/FrameLayout;

    .line 89
    .line 90
    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    .line 91
    .line 92
    invoke-direct {v14, v13, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11, v7, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    iget-boolean v7, v0, Lm7;->h:Z

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    invoke-virtual {v11, v10, v10, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 103
    .line 104
    .line 105
    :cond_4
    iget-object v7, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 106
    .line 107
    if-eqz v7, :cond_6

    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 114
    .line 115
    const/4 v11, 0x0

    .line 116
    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    :cond_6
    :goto_2
    sget v7, Landroidx/appcompat/R$id;->topPanel:I

    .line 123
    .line 124
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    sget v11, Landroidx/appcompat/R$id;->contentPanel:I

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    sget v14, Landroidx/appcompat/R$id;->buttonPanel:I

    .line 135
    .line 136
    invoke-virtual {v3, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    invoke-static {v7, v4}, Lm7;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v11, v5}, Lm7;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v14, v6}, Lm7;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    sget v7, Landroidx/appcompat/R$id;->scrollView:I

    .line 153
    .line 154
    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    check-cast v7, Landroidx/core/widget/NestedScrollView;

    .line 159
    .line 160
    iput-object v7, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 161
    .line 162
    invoke-virtual {v7, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 163
    .line 164
    .line 165
    iget-object v7, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 166
    .line 167
    invoke-virtual {v7, v10}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 168
    .line 169
    .line 170
    const v7, 0x102000b

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    check-cast v7, Landroid/widget/TextView;

    .line 178
    .line 179
    iput-object v7, v0, Lm7;->v:Landroid/widget/TextView;

    .line 180
    .line 181
    if-nez v7, :cond_7

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    iget-object v11, v0, Lm7;->e:Ljava/lang/String;

    .line 185
    .line 186
    if-eqz v11, :cond_8

    .line 187
    .line 188
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    invoke-virtual {v7, v12}, Landroid/view/View;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    iget-object v7, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 196
    .line 197
    iget-object v11, v0, Lm7;->v:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    iget-object v7, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 203
    .line 204
    if-eqz v7, :cond_9

    .line 205
    .line 206
    iget-object v7, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 207
    .line 208
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    check-cast v7, Landroid/view/ViewGroup;

    .line 213
    .line 214
    iget-object v11, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 215
    .line 216
    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 221
    .line 222
    .line 223
    iget-object v14, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 224
    .line 225
    new-instance v15, Landroid/view/ViewGroup$LayoutParams;

    .line 226
    .line 227
    invoke-direct {v15, v13, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7, v14, v11, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_9
    invoke-virtual {v5, v12}, Landroid/view/View;->setVisibility(I)V

    .line 235
    .line 236
    .line 237
    :goto_3
    const v7, 0x1020019

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    check-cast v7, Landroid/widget/Button;

    .line 245
    .line 246
    iput-object v7, v0, Lm7;->i:Landroid/widget/Button;

    .line 247
    .line 248
    iget-object v11, v0, Lm7;->F:Lu1;

    .line 249
    .line 250
    invoke-virtual {v7, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    .line 252
    .line 253
    iget-object v7, v0, Lm7;->j:Ljava/lang/CharSequence;

    .line 254
    .line 255
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    iget-object v14, v0, Lm7;->i:Landroid/widget/Button;

    .line 260
    .line 261
    if-eqz v7, :cond_a

    .line 262
    .line 263
    invoke-virtual {v14, v12}, Landroid/view/View;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    move v7, v10

    .line 267
    goto :goto_4

    .line 268
    :cond_a
    iget-object v7, v0, Lm7;->j:Ljava/lang/CharSequence;

    .line 269
    .line 270
    invoke-virtual {v14, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    iget-object v7, v0, Lm7;->i:Landroid/widget/Button;

    .line 274
    .line 275
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 276
    .line 277
    .line 278
    move v7, v9

    .line 279
    :goto_4
    const v14, 0x102001a

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 283
    .line 284
    .line 285
    move-result-object v14

    .line 286
    check-cast v14, Landroid/widget/Button;

    .line 287
    .line 288
    iput-object v14, v0, Lm7;->l:Landroid/widget/Button;

    .line 289
    .line 290
    invoke-virtual {v14, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    .line 292
    .line 293
    iget-object v14, v0, Lm7;->m:Ljava/lang/CharSequence;

    .line 294
    .line 295
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    iget-object v15, v0, Lm7;->l:Landroid/widget/Button;

    .line 300
    .line 301
    if-eqz v14, :cond_b

    .line 302
    .line 303
    invoke-virtual {v15, v12}, Landroid/view/View;->setVisibility(I)V

    .line 304
    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_b
    iget-object v14, v0, Lm7;->m:Ljava/lang/CharSequence;

    .line 308
    .line 309
    invoke-virtual {v15, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 310
    .line 311
    .line 312
    iget-object v14, v0, Lm7;->l:Landroid/widget/Button;

    .line 313
    .line 314
    invoke-virtual {v14, v10}, Landroid/view/View;->setVisibility(I)V

    .line 315
    .line 316
    .line 317
    or-int/lit8 v7, v7, 0x2

    .line 318
    .line 319
    :goto_5
    const v14, 0x102001b

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v14

    .line 326
    check-cast v14, Landroid/widget/Button;

    .line 327
    .line 328
    iput-object v14, v0, Lm7;->o:Landroid/widget/Button;

    .line 329
    .line 330
    invoke-virtual {v14, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    .line 332
    .line 333
    iget-object v11, v0, Lm7;->p:Ljava/lang/CharSequence;

    .line 334
    .line 335
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    iget-object v14, v0, Lm7;->o:Landroid/widget/Button;

    .line 340
    .line 341
    if-eqz v11, :cond_c

    .line 342
    .line 343
    invoke-virtual {v14, v12}, Landroid/view/View;->setVisibility(I)V

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_c
    iget-object v11, v0, Lm7;->p:Ljava/lang/CharSequence;

    .line 348
    .line 349
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    .line 351
    .line 352
    iget-object v11, v0, Lm7;->o:Landroid/widget/Button;

    .line 353
    .line 354
    invoke-virtual {v11, v10}, Landroid/view/View;->setVisibility(I)V

    .line 355
    .line 356
    .line 357
    or-int/lit8 v7, v7, 0x4

    .line 358
    .line 359
    :goto_6
    new-instance v11, Landroid/util/TypedValue;

    .line 360
    .line 361
    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    sget v14, Landroidx/appcompat/R$attr;->alertDialogCenterButtons:I

    .line 369
    .line 370
    invoke-virtual {v1, v14, v11, v9}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 371
    .line 372
    .line 373
    iget v1, v11, Landroid/util/TypedValue;->data:I

    .line 374
    .line 375
    const/4 v11, 0x2

    .line 376
    if-eqz v1, :cond_f

    .line 377
    .line 378
    const/high16 v1, 0x3f000000    # 0.5f

    .line 379
    .line 380
    if-ne v7, v9, :cond_d

    .line 381
    .line 382
    iget-object v14, v0, Lm7;->i:Landroid/widget/Button;

    .line 383
    .line 384
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 385
    .line 386
    .line 387
    move-result-object v15

    .line 388
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 389
    .line 390
    iput v9, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 391
    .line 392
    iput v1, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 393
    .line 394
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 395
    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_d
    if-ne v7, v11, :cond_e

    .line 399
    .line 400
    iget-object v14, v0, Lm7;->l:Landroid/widget/Button;

    .line 401
    .line 402
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 403
    .line 404
    .line 405
    move-result-object v15

    .line 406
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 407
    .line 408
    iput v9, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 409
    .line 410
    iput v1, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 411
    .line 412
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 413
    .line 414
    .line 415
    goto :goto_7

    .line 416
    :cond_e
    const/4 v14, 0x4

    .line 417
    if-ne v7, v14, :cond_f

    .line 418
    .line 419
    iget-object v14, v0, Lm7;->o:Landroid/widget/Button;

    .line 420
    .line 421
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 422
    .line 423
    .line 424
    move-result-object v15

    .line 425
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 426
    .line 427
    iput v9, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 428
    .line 429
    iput v1, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 430
    .line 431
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 432
    .line 433
    .line 434
    :cond_f
    :goto_7
    if-eqz v7, :cond_10

    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_10
    invoke-virtual {v6, v12}, Landroid/view/View;->setVisibility(I)V

    .line 438
    .line 439
    .line 440
    :goto_8
    iget-object v1, v0, Lm7;->w:Landroid/view/View;

    .line 441
    .line 442
    if-eqz v1, :cond_11

    .line 443
    .line 444
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 445
    .line 446
    const/4 v7, -0x2

    .line 447
    invoke-direct {v1, v13, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 448
    .line 449
    .line 450
    iget-object v7, v0, Lm7;->w:Landroid/view/View;

    .line 451
    .line 452
    invoke-virtual {v4, v7, v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 453
    .line 454
    .line 455
    sget v1, Landroidx/appcompat/R$id;->title_template:I

    .line 456
    .line 457
    invoke-virtual {v2, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-virtual {v1, v12}, Landroid/view/View;->setVisibility(I)V

    .line 462
    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_11
    const v1, 0x1020006

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    check-cast v1, Landroid/widget/ImageView;

    .line 473
    .line 474
    iput-object v1, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 475
    .line 476
    iget-object v1, v0, Lm7;->d:Ljava/lang/CharSequence;

    .line 477
    .line 478
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-nez v1, :cond_13

    .line 483
    .line 484
    iget-boolean v1, v0, Lm7;->D:Z

    .line 485
    .line 486
    if-eqz v1, :cond_13

    .line 487
    .line 488
    sget v1, Landroidx/appcompat/R$id;->alertTitle:I

    .line 489
    .line 490
    invoke-virtual {v2, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    check-cast v1, Landroid/widget/TextView;

    .line 495
    .line 496
    iput-object v1, v0, Lm7;->u:Landroid/widget/TextView;

    .line 497
    .line 498
    iget-object v7, v0, Lm7;->d:Ljava/lang/CharSequence;

    .line 499
    .line 500
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    .line 502
    .line 503
    iget-object v1, v0, Lm7;->s:Landroid/graphics/drawable/Drawable;

    .line 504
    .line 505
    if-eqz v1, :cond_12

    .line 506
    .line 507
    iget-object v7, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 508
    .line 509
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 510
    .line 511
    .line 512
    goto :goto_9

    .line 513
    :cond_12
    iget-object v1, v0, Lm7;->u:Landroid/widget/TextView;

    .line 514
    .line 515
    iget-object v7, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 516
    .line 517
    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    .line 518
    .line 519
    .line 520
    move-result v7

    .line 521
    iget-object v14, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 522
    .line 523
    invoke-virtual {v14}, Landroid/view/View;->getPaddingTop()I

    .line 524
    .line 525
    .line 526
    move-result v14

    .line 527
    iget-object v15, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 528
    .line 529
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    .line 530
    .line 531
    .line 532
    move-result v15

    .line 533
    iget-object v8, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 534
    .line 535
    invoke-virtual {v8}, Landroid/view/View;->getPaddingBottom()I

    .line 536
    .line 537
    .line 538
    move-result v8

    .line 539
    invoke-virtual {v1, v7, v14, v15, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 543
    .line 544
    invoke-virtual {v1, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 545
    .line 546
    .line 547
    goto :goto_9

    .line 548
    :cond_13
    sget v1, Landroidx/appcompat/R$id;->title_template:I

    .line 549
    .line 550
    invoke-virtual {v2, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-virtual {v1, v12}, Landroid/view/View;->setVisibility(I)V

    .line 555
    .line 556
    .line 557
    iget-object v1, v0, Lm7;->t:Landroid/widget/ImageView;

    .line 558
    .line 559
    invoke-virtual {v1, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v4, v12}, Landroid/view/View;->setVisibility(I)V

    .line 563
    .line 564
    .line 565
    :goto_9
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-eq v1, v12, :cond_14

    .line 570
    .line 571
    move v1, v9

    .line 572
    goto :goto_a

    .line 573
    :cond_14
    move v1, v10

    .line 574
    :goto_a
    if-eqz v4, :cond_15

    .line 575
    .line 576
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    if-eq v3, v12, :cond_15

    .line 581
    .line 582
    move v3, v9

    .line 583
    goto :goto_b

    .line 584
    :cond_15
    move v3, v10

    .line 585
    :goto_b
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    if-eq v6, v12, :cond_16

    .line 590
    .line 591
    move v6, v9

    .line 592
    goto :goto_c

    .line 593
    :cond_16
    move v6, v10

    .line 594
    :goto_c
    if-nez v6, :cond_17

    .line 595
    .line 596
    sget v7, Landroidx/appcompat/R$id;->textSpacerNoButtons:I

    .line 597
    .line 598
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    if-eqz v7, :cond_17

    .line 603
    .line 604
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 605
    .line 606
    .line 607
    :cond_17
    if-eqz v3, :cond_1b

    .line 608
    .line 609
    iget-object v7, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 610
    .line 611
    if-eqz v7, :cond_18

    .line 612
    .line 613
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 614
    .line 615
    .line 616
    :cond_18
    iget-object v7, v0, Lm7;->e:Ljava/lang/String;

    .line 617
    .line 618
    if-nez v7, :cond_1a

    .line 619
    .line 620
    iget-object v7, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 621
    .line 622
    if-eqz v7, :cond_19

    .line 623
    .line 624
    goto :goto_d

    .line 625
    :cond_19
    const/4 v8, 0x0

    .line 626
    goto :goto_e

    .line 627
    :cond_1a
    :goto_d
    sget v7, Landroidx/appcompat/R$id;->titleDividerNoCustom:I

    .line 628
    .line 629
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    :goto_e
    if-eqz v8, :cond_1c

    .line 634
    .line 635
    invoke-virtual {v8, v10}, Landroid/view/View;->setVisibility(I)V

    .line 636
    .line 637
    .line 638
    goto :goto_f

    .line 639
    :cond_1b
    sget v4, Landroidx/appcompat/R$id;->textSpacerNoTitle:I

    .line 640
    .line 641
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    if-eqz v4, :cond_1c

    .line 646
    .line 647
    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 648
    .line 649
    .line 650
    :cond_1c
    :goto_f
    iget-object v4, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 651
    .line 652
    if-eqz v4, :cond_20

    .line 653
    .line 654
    if-eqz v6, :cond_1d

    .line 655
    .line 656
    if-nez v3, :cond_20

    .line 657
    .line 658
    :cond_1d
    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    .line 659
    .line 660
    .line 661
    move-result v7

    .line 662
    if-eqz v3, :cond_1e

    .line 663
    .line 664
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 665
    .line 666
    .line 667
    move-result v8

    .line 668
    goto :goto_10

    .line 669
    :cond_1e
    iget v8, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->a:I

    .line 670
    .line 671
    :goto_10
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    .line 672
    .line 673
    .line 674
    move-result v12

    .line 675
    if-eqz v6, :cond_1f

    .line 676
    .line 677
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 678
    .line 679
    .line 680
    move-result v14

    .line 681
    goto :goto_11

    .line 682
    :cond_1f
    iget v14, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I

    .line 683
    .line 684
    :goto_11
    invoke-virtual {v4, v7, v8, v12, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 685
    .line 686
    .line 687
    :cond_20
    if-nez v1, :cond_24

    .line 688
    .line 689
    iget-object v1, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 690
    .line 691
    if-eqz v1, :cond_21

    .line 692
    .line 693
    goto :goto_12

    .line 694
    :cond_21
    iget-object v1, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 695
    .line 696
    :goto_12
    if-eqz v1, :cond_24

    .line 697
    .line 698
    if-eqz v6, :cond_22

    .line 699
    .line 700
    move v10, v11

    .line 701
    :cond_22
    or-int/2addr v3, v10

    .line 702
    sget v4, Landroidx/appcompat/R$id;->scrollIndicatorUp:I

    .line 703
    .line 704
    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    sget v6, Landroidx/appcompat/R$id;->scrollIndicatorDown:I

    .line 709
    .line 710
    invoke-virtual {v2, v6}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    sget-object v6, Le33;->a:Ljava/util/WeakHashMap;

    .line 715
    .line 716
    const/4 v6, 0x3

    .line 717
    invoke-static {v1, v3, v6}, Lt23;->d(Landroid/view/View;II)V

    .line 718
    .line 719
    .line 720
    if-eqz v4, :cond_23

    .line 721
    .line 722
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 723
    .line 724
    .line 725
    :cond_23
    if-eqz v2, :cond_24

    .line 726
    .line 727
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 728
    .line 729
    .line 730
    :cond_24
    iget-object v1, v0, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 731
    .line 732
    if-eqz v1, :cond_25

    .line 733
    .line 734
    iget-object v2, v0, Lm7;->x:Landroid/widget/ListAdapter;

    .line 735
    .line 736
    if-eqz v2, :cond_25

    .line 737
    .line 738
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 739
    .line 740
    .line 741
    iget v0, v0, Lm7;->y:I

    .line 742
    .line 743
    if-le v0, v13, :cond_25

    .line 744
    .line 745
    invoke-virtual {v1, v0, v9}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V

    .line 749
    .line 750
    .line 751
    :cond_25
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo7;->f:Lm7;

    .line 2
    .line 3
    iget-object v0, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->c(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo7;->f:Lm7;

    .line 2
    .line 3
    iget-object v0, v0, Lm7;->r:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->c(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldy;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwa;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwa;->A()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwa;->Z:Ls1;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Ls1;->q(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onSupportActionModeFinished(Lj2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSupportActionModeStarted(Lj2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onWindowStartingSupportActionMode(Li2;)Lj2;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldy;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lia;->h(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Ldy;->b()V

    .line 13
    invoke-virtual {p0}, Lo7;->c()Lia;

    move-result-object p0

    invoke-virtual {p0, p1}, Lia;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Ldy;->b()V

    .line 15
    invoke-virtual {p0}, Lo7;->c()Lia;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lia;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lo7;->c()Lia;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lia;->k(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lo7;->f(Ljava/lang/CharSequence;)V

    .line 21
    iget-object p0, p0, Lo7;->f:Lm7;

    iput-object p1, p0, Lm7;->d:Ljava/lang/CharSequence;

    .line 22
    iget-object p0, p0, Lm7;->u:Landroid/widget/TextView;

    if-eqz p0, :cond_0

    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
