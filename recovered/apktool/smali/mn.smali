.class public final synthetic Lmn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lvm;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxn;


# direct methods
.method public synthetic constructor <init>(Lxn;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmn;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmn;->b:Lxn;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public w(Lum;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lmn;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lmn;->b:Lxn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lxn;->a:Lfs0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lfs0;->m()Leb2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Leb2;->b()Lfb2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v0, v0, Lfb2;->c:Ljava/util/List;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lxn;->i0:Lqi1;

    .line 26
    .line 27
    iget-object v0, v0, Lqi1;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lrp;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    new-instance v0, Lqn;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1}, Lqn;-><init>(Lxn;Lum;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lxn;->b:Lcq;

    .line 43
    .line 44
    iget-object v2, p0, Lxn;->w:Lzn;

    .line 45
    .line 46
    iget-object v2, v2, Lzn;->a:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p0, Lxn;->c:Ly92;

    .line 49
    .line 50
    invoke-static {v1}, Lkb1;->s(Ljava/util/ArrayList;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v0, v0, Lcq;->a:Lcb;

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3, v1}, Lcb;->E(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto :goto_0

    .line 62
    :catch_1
    move-exception v0

    .line 63
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v2, "Unable to open camera for configAndClose: "

    .line 66
    .line 67
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 85
    .line 86
    .line 87
    :goto_1
    const-string p0, "configAndCloseTask"

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lxn;->c:Ly92;

    .line 91
    .line 92
    new-instance v1, Lj8;

    .line 93
    .line 94
    const/4 v2, 0x7

    .line 95
    invoke-direct {v1, v2, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ly92;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_2

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catch_2
    new-instance p0, Ljava/lang/RuntimeException;

    .line 103
    .line 104
    const-string v0, "Unable to check if MeteringRepeating is attached. Camera executor shut down."

    .line 105
    .line 106
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 110
    .line 111
    .line 112
    :goto_2
    const-string p0, "isMeteringRepeatingAttached"

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
