.class public Lxs0;
.super Landroidx/fragment/app/Fragment;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public a:Lcom/helpshift/views/HSWebView;

.field public b:Landroid/view/View;

.field public c:Landroid/view/View;

.field public d:Landroid/widget/LinearLayout;

.field public e:Lcom/helpshift/activities/HSMainActivity;

.field public f:Lra2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static h(Landroid/os/Bundle;)Lwe2;
    .locals 5

    .line 1
    const-string v0, "HELPCENTER_MODE"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, "FAQ_SECTION"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const-string v1, "SINGLE_FAQ"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    move-object p0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, "SINGLE_FAQ_PUBLISH_ID"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    move-object v4, v2

    .line 37
    move-object v2, p0

    .line 38
    move-object p0, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-string v0, "FAQ_SECTION_ID"

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    new-instance v0, Lwe2;

    .line 47
    .line 48
    const/16 v1, 0x9

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v0, v2, p0, v1, v3}, Lwe2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method


# virtual methods
.method public final g(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lrs0;->y:Lrs0;

    .line 2
    .line 3
    iget-object v0, v0, Lrs0;->p:Lra2;

    .line 4
    .line 5
    new-instance v1, Ldp0;

    .line 6
    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2, v3}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    sget-object v0, Lrs0;->y:Lrs0;

    .line 2
    .line 3
    iget-object v0, v0, Lrs0;->f:Lnm;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnm;->i()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "push_unread_count"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-gtz v1, :cond_1

    .line 27
    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    :goto_0
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "Helpcenter(JSON.stringify({ \"eventType\": \"showNotifBadge\", \"config\": { \"notifCount\": %count } }));"

    .line 41
    .line 42
    const-string v2, "%count"

    .line 43
    .line 44
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0, v0}, Lxs0;->g(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final j(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxs0;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "Helpcenter( JSON.stringify({ \"eventType\": \"sdkxIsInForeground\", \"config\": %foreground }));"

    .line 24
    .line 25
    const-string v1, "%foreground"

    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lxs0;->g(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final k(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "HelpCenter"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string v5, "Bundle received in Helpcenter fragment is null."

    .line 12
    .line 13
    invoke-static {v4, v5, v3}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lxs0;->c:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Lxs0;->b:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static/range {p1 .. p1}, Lxs0;->h(Landroid/os/Bundle;)Lwe2;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    sget-object v6, Lrs0;->y:Lrs0;

    .line 32
    .line 33
    iget-object v6, v6, Lrs0;->t:Lec;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    iget-object v8, v5, Lwe2;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v8, Ljava/lang/String;

    .line 42
    .line 43
    iget-object v5, v5, Lwe2;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v9, v6, Lec;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v9, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v9}, Lb40;->p(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    const-string v9, "helpshift/Helpcenter.js"

    .line 58
    .line 59
    invoke-static {v7, v9}, Lyy1;->A(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Lb40;->p(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_1

    .line 68
    .line 69
    const-string v5, ""

    .line 70
    .line 71
    :goto_0
    move-object v8, v5

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const-string v9, "%cdn"

    .line 74
    .line 75
    const-string v10, "https://d2duuy9yo5pldo.cloudfront.net/android/helpcenter.js"

    .line 76
    .line 77
    invoke-virtual {v7, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    iput-object v7, v6, Lec;->c:Ljava/lang/Object;

    .line 82
    .line 83
    :cond_2
    iget-object v7, v6, Lec;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v7, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v6, v6, Lec;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, Liy;

    .line 90
    .line 91
    sget-object v9, Lrs0;->y:Lrs0;

    .line 92
    .line 93
    iget-boolean v9, v9, Lrs0;->a:Z

    .line 94
    .line 95
    invoke-virtual {v6, v8, v5, v9}, Liy;->l(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const-string v6, "%config"

    .line 100
    .line 101
    invoke-virtual {v7, v6, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    goto :goto_0

    .line 106
    :goto_1
    invoke-static {v8}, Lb40;->p(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_3

    .line 111
    .line 112
    const-string v5, "Error in reading the source code from assets folder."

    .line 113
    .line 114
    invoke-static {v4, v5, v3}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    iget-object v3, v0, Lxs0;->c:Landroid/view/View;

    .line 118
    .line 119
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v0, Lxs0;->b:Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_3
    iget-object v5, v0, Lxs0;->b:Landroid/view/View;

    .line 129
    .line 130
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    iget-object v2, v0, Lxs0;->c:Landroid/view/View;

    .line 134
    .line 135
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    const-string v1, "Webview is launched"

    .line 139
    .line 140
    invoke-static {v4, v1, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 141
    .line 142
    .line 143
    sget-object v1, Lrs0;->y:Lrs0;

    .line 144
    .line 145
    iget-object v2, v1, Lrs0;->l:Lnm;

    .line 146
    .line 147
    iget-object v3, v1, Lrs0;->x:Landroid/content/Context;

    .line 148
    .line 149
    if-nez v2, :cond_4

    .line 150
    .line 151
    new-instance v10, Ler0;

    .line 152
    .line 153
    const-string v2, "__hs_helpcenter_resource_cache"

    .line 154
    .line 155
    invoke-direct {v10, v3, v2}, Ler0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v12, Lec0;

    .line 159
    .line 160
    const/16 v2, 0xa

    .line 161
    .line 162
    invoke-direct {v12, v2}, Lec0;-><init>(I)V

    .line 163
    .line 164
    .line 165
    new-instance v11, Lzb0;

    .line 166
    .line 167
    new-instance v2, Lp62;

    .line 168
    .line 169
    const/4 v4, 0x7

    .line 170
    invoke-direct {v2, v4}, Lp62;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const/16 v4, 0xc

    .line 174
    .line 175
    invoke-direct {v11, v2, v4}, Lzb0;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    new-instance v9, Lnm;

    .line 179
    .line 180
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    const-string v14, "https://d2duuy9yo5pldo.cloudfront.net/hc-android-mapping.json"

    .line 189
    .line 190
    const-string v15, "helpcenter_cacheURLs"

    .line 191
    .line 192
    const-string v16, "helpcenter"

    .line 193
    .line 194
    invoke-direct/range {v9 .. v16}, Lnm;-><init>(Ler0;Lzb0;Lv32;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iput-object v9, v1, Lrs0;->l:Lnm;

    .line 198
    .line 199
    :cond_4
    iget-object v2, v1, Lrs0;->l:Lnm;

    .line 200
    .line 201
    new-instance v3, Lra2;

    .line 202
    .line 203
    iget-object v4, v1, Lrs0;->e:Liy;

    .line 204
    .line 205
    iget-object v1, v1, Lrs0;->p:Lra2;

    .line 206
    .line 207
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 208
    .line 209
    .line 210
    iput-object v4, v3, Lra2;->b:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v1, v3, Lra2;->c:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v2, v3, Lra2;->d:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v3, v0, Lxs0;->f:Lra2;

    .line 217
    .line 218
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 219
    .line 220
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iput-object v1, v3, Lra2;->a:Ljava/lang/Object;

    .line 224
    .line 225
    iget-object v1, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 226
    .line 227
    new-instance v3, Lzs0;

    .line 228
    .line 229
    invoke-direct {v3}, Landroid/webkit/WebViewClient;-><init>()V

    .line 230
    .line 231
    .line 232
    iput-object v2, v3, Lzs0;->a:Lnm;

    .line 233
    .line 234
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 235
    .line 236
    .line 237
    iget-object v1, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 238
    .line 239
    new-instance v2, Lys0;

    .line 240
    .line 241
    iget-object v3, v0, Lxs0;->f:Lra2;

    .line 242
    .line 243
    invoke-direct {v2}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 244
    .line 245
    .line 246
    iput-object v3, v2, Lys0;->a:Lra2;

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 249
    .line 250
    .line 251
    iget-object v1, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 252
    .line 253
    new-instance v2, Lau0;

    .line 254
    .line 255
    iget-object v3, v0, Lxs0;->f:Lra2;

    .line 256
    .line 257
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 258
    .line 259
    .line 260
    iput-object v3, v2, Lau0;->a:Lra2;

    .line 261
    .line 262
    const-string v3, "HCInterface"

    .line 263
    .line 264
    invoke-virtual {v1, v2, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-object v6, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 268
    .line 269
    const-string v10, "utf-8"

    .line 270
    .line 271
    const/4 v11, 0x0

    .line 272
    const-string v7, "https://localhost"

    .line 273
    .line 274
    const-string v9, "text/html"

    .line 275
    .line 276
    invoke-virtual/range {v6 .. v11}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/helpshift/R$id;->hs__loading_view_close_btn:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    sget v0, Lcom/helpshift/R$id;->hs__retry_view_close_btn:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget v0, Lcom/helpshift/R$id;->hs__retry_button:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lxs0;->k(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    :goto_0
    iget-object p0, p0, Lxs0;->e:Lcom/helpshift/activities/HSMainActivity;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->onBackPressed()V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "onCreateView - "

    .line 4
    .line 5
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p3, 0x0

    .line 20
    const-string v0, "HelpCenter"

    .line 21
    .line 22
    invoke-static {v0, p0, p3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    sget p0, Lcom/helpshift/R$layout;->hs__helpcenter_layout:I

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    invoke-virtual {p1, p0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "onDestroy - "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "HelpCenter"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v1, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lrs0;->y:Lrs0;

    .line 29
    .line 30
    iget-object v0, v0, Lrs0;->h:Lb5;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lb5;->e:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v0, p0, Lxs0;->f:Lra2;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, v0, Lra2;->a:Ljava/lang/Object;

    .line 52
    .line 53
    :cond_0
    sget-object v0, Lrs0;->y:Lrs0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iput-boolean v1, v0, Lrs0;->c:Z

    .line 57
    .line 58
    iget-object v0, p0, Lxs0;->d:Landroid/widget/LinearLayout;

    .line 59
    .line 60
    iget-object v1, p0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 74
    .line 75
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "onStart - "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const-string v2, "HelpCenter"

    .line 24
    .line 25
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lrs0;->y:Lrs0;

    .line 29
    .line 30
    iget-object v0, v0, Lrs0;->h:Lb5;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lb5;->e:Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Lxs0;->j(Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lxs0;->j(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v0, "onViewCreated - "

    .line 7
    .line 8
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x0

    .line 23
    const-string v1, "HelpCenter"

    .line 24
    .line 25
    invoke-static {v1, p2, v0}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget v0, Lcom/helpshift/R$id;->hs__helpcenter_view:I

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/helpshift/views/HSWebView;

    .line 39
    .line 40
    iput-object v0, p0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 41
    .line 42
    sget v0, Lcom/helpshift/R$id;->hs__loading_view:I

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lxs0;->b:Landroid/view/View;

    .line 49
    .line 50
    sget v0, Lcom/helpshift/R$id;->hs__chat_image:I

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/widget/ImageView;

    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    sget v0, Lcom/helpshift/R$id;->hs__retry_view:I

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lxs0;->c:Landroid/view/View;

    .line 70
    .line 71
    sget v0, Lcom/helpshift/R$id;->hs__helpcenter_layout:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroid/widget/LinearLayout;

    .line 78
    .line 79
    iput-object v0, p0, Lxs0;->d:Landroid/widget/LinearLayout;

    .line 80
    .line 81
    sget v0, Lcom/helpshift/R$id;->hs__retry_view_close_btn:I

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    sget v0, Lcom/helpshift/R$id;->hs__loading_view_close_btn:I

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    .line 98
    .line 99
    sget v0, Lcom/helpshift/R$id;->hs__retry_button:I

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p2}, Lxs0;->k(Landroid/os/Bundle;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method
