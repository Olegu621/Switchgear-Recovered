.class public final synthetic Lhp2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/TitanWebView;

.field public final synthetic b:Lcom/supercell/titan/GameApp;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic i:F


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/TitanWebView;Lcom/supercell/titan/GameApp;IIIIF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhp2;->a:Lcom/supercell/titan/TitanWebView;

    .line 5
    .line 6
    iput-object p2, p0, Lhp2;->b:Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    iput p3, p0, Lhp2;->c:I

    .line 9
    .line 10
    iput p4, p0, Lhp2;->d:I

    .line 11
    .line 12
    iput p5, p0, Lhp2;->e:I

    .line 13
    .line 14
    iput p6, p0, Lhp2;->f:I

    .line 15
    .line 16
    iput p7, p0, Lhp2;->i:F

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lhp2;->a:Lcom/supercell/titan/TitanWebView;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v2, p0, Lhp2;->b:Lcom/supercell/titan/GameApp;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 19
    .line 20
    iput v3, v0, Lcom/supercell/titan/TitanWebView;->A:I

    .line 21
    .line 22
    iget-boolean v4, v0, Lcom/supercell/titan/TitanWebView;->b:Z

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    and-int/lit16 v3, v3, -0xf1

    .line 27
    .line 28
    or-int/lit8 v3, v3, 0x20

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iget v4, p0, Lhp2;->i:F

    .line 39
    .line 40
    cmpl-float v3, v4, v3

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x4

    .line 44
    if-lez v3, :cond_2

    .line 45
    .line 46
    move v6, v4

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v6, v5

    .line 49
    :goto_0
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget-object v6, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 53
    .line 54
    if-lez v3, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v4, v5

    .line 58
    :goto_1
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    instance-of v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 68
    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    :goto_2
    return-void

    .line 72
    :cond_4
    iget-object v3, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, Lcom/supercell/titan/GL2JNISurfaceView;->getScaleX()F

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-virtual {v2}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Lcom/supercell/titan/GL2JNISurfaceView;->getScaleY()F

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    iget-boolean v7, v0, Lcom/supercell/titan/TitanWebView;->s:Z

    .line 97
    .line 98
    iget v8, p0, Lhp2;->c:I

    .line 99
    .line 100
    iget v9, p0, Lhp2;->d:I

    .line 101
    .line 102
    iget v10, p0, Lhp2;->e:I

    .line 103
    .line 104
    iget p0, p0, Lhp2;->f:I

    .line 105
    .line 106
    if-eqz v7, :cond_6

    .line 107
    .line 108
    iget-boolean v7, v0, Lcom/supercell/titan/TitanWebView;->t:Z

    .line 109
    .line 110
    if-eqz v7, :cond_6

    .line 111
    .line 112
    const/4 v7, 0x7

    .line 113
    invoke-virtual {v2, v7}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget v7, Lcom/supercell/titan/R$id;->stage:I

    .line 125
    .line 126
    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-eqz v2, :cond_5

    .line 131
    .line 132
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    :cond_5
    const/16 v2, 0x1706

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 138
    .line 139
    .line 140
    int-to-float p0, p0

    .line 141
    div-float/2addr p0, v6

    .line 142
    float-to-int p0, p0

    .line 143
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 144
    .line 145
    int-to-float p0, v10

    .line 146
    div-float/2addr p0, v4

    .line 147
    float-to-int p0, p0

    .line 148
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 149
    .line 150
    int-to-float p0, v9

    .line 151
    div-float/2addr p0, v6

    .line 152
    float-to-int p0, p0

    .line 153
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 154
    .line 155
    int-to-float p0, v8

    .line 156
    div-float/2addr p0, v4

    .line 157
    float-to-int p0, p0

    .line 158
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    int-to-float v1, v10

    .line 162
    div-float/2addr v1, v4

    .line 163
    float-to-int v1, v1

    .line 164
    iput v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 165
    .line 166
    int-to-float p0, p0

    .line 167
    div-float/2addr p0, v6

    .line 168
    float-to-int p0, p0

    .line 169
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 170
    .line 171
    int-to-float p0, v8

    .line 172
    div-float/2addr p0, v4

    .line 173
    float-to-int p0, p0

    .line 174
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 175
    .line 176
    int-to-float p0, v9

    .line 177
    div-float/2addr p0, v6

    .line 178
    float-to-int p0, p0

    .line 179
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 180
    .line 181
    :goto_3
    iput-object v3, v0, Lcom/supercell/titan/TitanWebView;->l:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 182
    .line 183
    iget-object p0, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 184
    .line 185
    invoke-virtual {p0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method
