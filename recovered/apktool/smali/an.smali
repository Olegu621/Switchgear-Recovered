.class public final synthetic Lan;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lan;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lan;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p3, p0, Lan;->b:Z

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
    iget v0, p0, Lan;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lan;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/supercell/titan/TitanWebView;

    .line 11
    .line 12
    iget-boolean p0, p0, Lan;->b:Z

    .line 13
    .line 14
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz p0, :cond_1

    .line 20
    .line 21
    new-instance p0, Ljp2;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p0, Lan;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lxn;

    .line 37
    .line 38
    iget-boolean p0, p0, Lan;->b:Z

    .line 39
    .line 40
    iput-boolean p0, v0, Lxn;->n0:Z

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    iget p0, v0, Lxn;->s0:I

    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    if-ne p0, v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lxn;->H(Z)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_1
    iget-object v0, p0, Lan;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcn;

    .line 56
    .line 57
    iget-boolean p0, p0, Lan;->b:Z

    .line 58
    .line 59
    iget-boolean v3, v0, Lcn;->a:Z

    .line 60
    .line 61
    if-ne v3, p0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iput-boolean p0, v0, Lcn;->a:Z

    .line 65
    .line 66
    if-eqz p0, :cond_4

    .line 67
    .line 68
    iget-boolean p0, v0, Lcn;->b:Z

    .line 69
    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    iget-object p0, v0, Lcn;->c:Ljn;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljn;->o()Ls81;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v1, Ls2;

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    invoke-direct {v1, v0, v3}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    iget-object v3, v0, Lcn;->d:Ly92;

    .line 85
    .line 86
    invoke-interface {p0, v1, v3}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 87
    .line 88
    .line 89
    iput-boolean v2, v0, Lcn;->b:Z

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    new-instance p0, Llp;

    .line 93
    .line 94
    const-string v3, "The camera control has became inactive."

    .line 95
    .line 96
    invoke-direct {p0, v3, v2}, Llp;-><init>(Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    iget-object v2, v0, Lcn;->g:Lum;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-virtual {v2, p0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 104
    .line 105
    .line 106
    iput-object v1, v0, Lcn;->g:Lum;

    .line 107
    .line 108
    :cond_5
    :goto_1
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
