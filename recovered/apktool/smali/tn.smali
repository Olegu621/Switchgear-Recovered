.class public final synthetic Ltn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lec;


# direct methods
.method public synthetic constructor <init>(Lec;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltn;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ltn;->b:Lec;

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
    .locals 3

    .line 1
    iget v0, p0, Ltn;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ltn;->b:Lec;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lec;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcb;

    .line 11
    .line 12
    iget-object v0, v0, Lcb;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lxn;

    .line 15
    .line 16
    iget v0, v0, Lxn;->s0:I

    .line 17
    .line 18
    iget-object v1, p0, Lec;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lcb;

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    iget-object p0, v1, Lcb;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lxn;

    .line 29
    .line 30
    iget v0, p0, Lxn;->s0:I

    .line 31
    .line 32
    invoke-static {v0}, Len;->A(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "Camera skip reopen at state: "

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, v1, Lcb;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lxn;

    .line 49
    .line 50
    const-string v1, "Camera onError timeout, reopen it."

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lec;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcb;

    .line 58
    .line 59
    iget-object v0, v0, Lcb;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lxn;

    .line 62
    .line 63
    const/4 v1, 0x7

    .line 64
    invoke-virtual {v0, v1}, Lxn;->E(I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lec;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lcb;

    .line 70
    .line 71
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lxn;

    .line 74
    .line 75
    iget-object p0, p0, Lxn;->v:Lwn;

    .line 76
    .line 77
    invoke-virtual {p0}, Lwn;->b()V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void

    .line 81
    :pswitch_0
    iget-object v0, p0, Lec;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v0, p0, Lec;->d:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lcb;

    .line 96
    .line 97
    iget-object v0, v0, Lcb;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lxn;

    .line 100
    .line 101
    iget-object v0, v0, Lxn;->c:Ly92;

    .line 102
    .line 103
    new-instance v2, Ltn;

    .line 104
    .line 105
    invoke-direct {v2, p0, v1}, Ltn;-><init>(Lec;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
