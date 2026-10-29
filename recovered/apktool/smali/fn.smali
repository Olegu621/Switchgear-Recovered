.class public final synthetic Lfn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Lfn;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfn;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lfn;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lfn;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iget p0, p0, Lfn;->b:I

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->c0(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 19
    .line 20
    iget p0, p0, Lfn;->b:I

    .line 21
    .line 22
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->b:Lcom/supercell/titan/TitanWebView;

    .line 23
    .line 24
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->k:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    iget-object v2, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-object v1, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/supercell/titan/TitanWebView;->b()V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->l:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v2, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->k:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    iget-object v2, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lcom/supercell/titan/TitanWebView;

    .line 71
    .line 72
    iget p0, p0, Lfn;->b:I

    .line 73
    .line 74
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, p0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :pswitch_2
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lde3;

    .line 90
    .line 91
    iget p0, p0, Lfn;->b:I

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Lde3;->A(I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_3
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    iget p0, p0, Lfn;->b:I

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lgk2;

    .line 118
    .line 119
    const/4 v2, 0x5

    .line 120
    if-ne p0, v2, :cond_4

    .line 121
    .line 122
    iget-object v2, v1, Lgk2;->p:Ljava/lang/Object;

    .line 123
    .line 124
    monitor-enter v2

    .line 125
    :try_start_0
    invoke-virtual {v1}, Lgk2;->m()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_3

    .line 130
    .line 131
    iget-object v3, v1, Lgk2;->q:Ljava/util/ArrayList;

    .line 132
    .line 133
    if-eqz v3, :cond_3

    .line 134
    .line 135
    invoke-static {}, Lgk2;->l()V

    .line 136
    .line 137
    .line 138
    iget-object v1, v1, Lgk2;->q:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_3

    .line 149
    .line 150
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Ld70;

    .line 155
    .line 156
    invoke-virtual {v3}, Ld70;->a()V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_0
    move-exception p0

    .line 161
    goto :goto_3

    .line 162
    :cond_3
    monitor-exit v2

    .line 163
    goto :goto_1

    .line 164
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    throw p0

    .line 166
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    return-void

    .line 171
    :pswitch_4
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lmo;

    .line 174
    .line 175
    iget p0, p0, Lfn;->b:I

    .line 176
    .line 177
    invoke-virtual {v0, p0}, Lmo;->a(I)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
