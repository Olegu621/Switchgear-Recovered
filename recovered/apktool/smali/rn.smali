.class public final Lrn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lxo0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lrr;

.field public final synthetic c:Lxn;


# direct methods
.method public synthetic constructor <init>(Lxn;Lrr;I)V
    .locals 0

    .line 1
    iput p3, p0, Lrn;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lrn;->c:Lxn;

    .line 4
    .line 5
    iput-object p2, p0, Lrn;->b:Lrr;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget v0, p0, Lrn;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lc70;

    .line 7
    .line 8
    iget-object v1, p0, Lrn;->c:Lxn;

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p1, Lc70;

    .line 15
    .line 16
    iget-object p1, p1, Lc70;->a:Ld70;

    .line 17
    .line 18
    iget-object v0, v1, Lxn;->a:Lfs0;

    .line 19
    .line 20
    invoke-virtual {v0}, Lfs0;->n()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lfb2;

    .line 39
    .line 40
    invoke-virtual {v1}, Lfb2;->b()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :goto_0
    if-eqz v1, :cond_5

    .line 53
    .line 54
    iget-object p0, p0, Lrn;->c:Lxn;

    .line 55
    .line 56
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, v1, Lfb2;->f:Ldb2;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    new-instance v3, Ljava/lang/Throwable;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v3, "Posting surface closed"

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Lxn;->s(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, Lj8;

    .line 75
    .line 76
    invoke-direct {p0, v2, v0, v1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p0}, Lnt0;->execute(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    const-string p0, "Unable to configure camera cancelled"

    .line 88
    .line 89
    invoke-virtual {v1, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget v0, v1, Lxn;->s0:I

    .line 94
    .line 95
    if-ne v0, v2, :cond_4

    .line 96
    .line 97
    iget-object v0, p0, Lrn;->c:Lxn;

    .line 98
    .line 99
    new-instance v1, Lff;

    .line 100
    .line 101
    const/4 v3, 0x4

    .line 102
    invoke-direct {v1, v3, p1}, Lff;-><init>(ILjava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    const/4 v3, 0x1

    .line 106
    invoke-virtual {v0, v2, v1, v3}, Lxn;->D(ILff;Z)V

    .line 107
    .line 108
    .line 109
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, "Unable to configure camera "

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lrn;->c:Lxn;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v1, "Camera2CameraImpl"

    .line 126
    .line 127
    invoke-static {v1, v0, p1}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 131
    .line 132
    iget-object v0, p1, Lxn;->W:Lrr;

    .line 133
    .line 134
    iget-object p0, p0, Lrn;->b:Lrr;

    .line 135
    .line 136
    if-ne v0, p0, :cond_5

    .line 137
    .line 138
    invoke-virtual {p1}, Lxn;->C()V

    .line 139
    .line 140
    .line 141
    :cond_5
    :goto_1
    :pswitch_0
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lrn;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Void;

    .line 7
    .line 8
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 9
    .line 10
    iget-object v0, p1, Lxn;->a0:Lkn;

    .line 11
    .line 12
    iget v0, v0, Lkn;->b:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget p1, p1, Lxn;->s0:I

    .line 18
    .line 19
    const/16 v0, 0x9

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lrn;->c:Lxn;

    .line 24
    .line 25
    const/16 p1, 0xa

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lxn;->E(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Void;

    .line 32
    .line 33
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 34
    .line 35
    iget-object p1, p1, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    iget-object v0, p0, Lrn;->b:Lrr;

    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 43
    .line 44
    iget p1, p1, Lxn;->s0:I

    .line 45
    .line 46
    invoke-static {p1}, Len;->y(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x1

    .line 51
    if-eq p1, v0, :cond_3

    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    if-eq p1, v0, :cond_3

    .line 55
    .line 56
    const/4 v0, 0x5

    .line 57
    if-eq p1, v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x6

    .line 60
    if-eq p1, v0, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 64
    .line 65
    iget p1, p1, Lxn;->V:I

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 71
    .line 72
    const-string v0, "Camera reopen required. Checking if the current camera can be closed safely."

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 78
    .line 79
    iget-object p1, p1, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 88
    .line 89
    iget-object v0, p1, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    const-string v0, "closing camera"

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lrn;->c:Lxn;

    .line 99
    .line 100
    iget-object p1, p1, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lrn;->c:Lxn;

    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    iput-object p1, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 109
    .line 110
    :cond_4
    :goto_0
    return-void

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
