.class public final synthetic Lbn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcn;

.field public final synthetic c:Lum;


# direct methods
.method public synthetic constructor <init>(Lcn;Lum;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbn;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbn;->b:Lcn;

    .line 4
    .line 5
    iput-object p2, p0, Lbn;->c:Lum;

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
    .locals 6

    .line 1
    iget v0, p0, Lbn;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Camera2CameraControl was updated with new options."

    .line 5
    .line 6
    iget-object v3, p0, Lbn;->c:Lum;

    .line 7
    .line 8
    iget-object p0, p0, Lbn;->b:Lcn;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iput-boolean v5, p0, Lcn;->b:Z

    .line 16
    .line 17
    new-instance v0, Llp;

    .line 18
    .line 19
    invoke-direct {v0, v2, v4}, Llp;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcn;->g:Lum;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcn;->g:Lum;

    .line 30
    .line 31
    :cond_0
    iput-object v3, p0, Lcn;->g:Lum;

    .line 32
    .line 33
    iget-boolean v0, p0, Lcn;->a:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lcn;->c:Ljn;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljn;->o()Ls81;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Ls2;

    .line 44
    .line 45
    invoke-direct {v1, p0, v5}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcn;->d:Ly92;

    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 51
    .line 52
    .line 53
    iput-boolean v4, p0, Lcn;->b:Z

    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_0
    iput-boolean v5, p0, Lcn;->b:Z

    .line 57
    .line 58
    new-instance v0, Llp;

    .line 59
    .line 60
    invoke-direct {v0, v2, v4}, Llp;-><init>(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lcn;->g:Lum;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lcn;->g:Lum;

    .line 71
    .line 72
    :cond_2
    iput-object v3, p0, Lcn;->g:Lum;

    .line 73
    .line 74
    iget-boolean v0, p0, Lcn;->a:Z

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    iget-object v0, p0, Lcn;->c:Ljn;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljn;->o()Ls81;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Ls2;

    .line 85
    .line 86
    invoke-direct {v1, p0, v5}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Lcn;->d:Ly92;

    .line 90
    .line 91
    invoke-interface {v0, v1, v2}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 92
    .line 93
    .line 94
    iput-boolean v4, p0, Lcn;->b:Z

    .line 95
    .line 96
    :cond_3
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
