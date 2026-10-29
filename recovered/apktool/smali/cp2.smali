.class public final synthetic Lcp2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/titan/TitanWebView;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/TitanWebView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcp2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcp2;->b:Lcom/supercell/titan/TitanWebView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcp2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    iget-object p0, p0, Lcp2;->b:Lcom/supercell/titan/TitanWebView;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/supercell/titan/TitanWebView;->onCookiesDeleted()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Lcom/supercell/titan/TitanWebView;->hideNative()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget p0, p0, Lcom/supercell/titan/TitanWebView;->w:I

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_2
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/supercell/titan/TitanWebView;->hide()V

    .line 35
    .line 36
    .line 37
    const-string v1, "messageHandler"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 44
    .line 45
    .line 46
    const-string v1, "about:blank"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/webkit/WebView;->freeMemory()V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_3
    invoke-virtual {p0}, Lcom/supercell/titan/TitanWebView;->c()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 65
    .line 66
    if-nez p0, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 70
    .line 71
    .line 72
    :goto_1
    return-void

    .line 73
    :pswitch_5
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Lcp2;

    .line 88
    .line 89
    const/16 v2, 0x9

    .line 90
    .line 91
    invoke-direct {v1, p0, v2}, Lcp2;-><init>(Lcom/supercell/titan/TitanWebView;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_6
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->g:Landroid/widget/ImageView;

    .line 99
    .line 100
    if-nez v0, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    iget v3, p0, Lcom/supercell/titan/TitanWebView;->h:I

    .line 104
    .line 105
    if-nez v3, :cond_4

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView;->g:Landroid/widget/ImageView;

    .line 111
    .line 112
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->g:Landroid/widget/ImageView;

    .line 120
    .line 121
    iget-boolean p0, p0, Lcom/supercell/titan/TitanWebView;->j:Z

    .line 122
    .line 123
    if-eqz p0, :cond_5

    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    :cond_5
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    :goto_2
    return-void

    .line 130
    :pswitch_7
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 131
    .line 132
    if-nez p0, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    invoke-virtual {p0}, Landroid/webkit/WebView;->reload()V

    .line 136
    .line 137
    .line 138
    :goto_3
    return-void

    .line 139
    :pswitch_8
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 140
    .line 141
    if-nez v0, :cond_7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView;->d:Landroid/widget/FrameLayout;

    .line 145
    .line 146
    if-eqz p0, :cond_8

    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-eqz p0, :cond_8

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    iget p0, p0, Landroid/content/res/Configuration;->fontScale:F

    .line 167
    .line 168
    const/high16 v1, 0x42c80000    # 100.0f

    .line 169
    .line 170
    div-float/2addr v1, p0

    .line 171
    float-to-int p0, v1

    .line 172
    invoke-virtual {v0, p0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 173
    .line 174
    .line 175
    :cond_8
    :goto_4
    return-void

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
