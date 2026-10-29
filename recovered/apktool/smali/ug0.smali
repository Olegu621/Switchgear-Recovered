.class public final Lug0;
.super Lpg3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final U:Ljava/lang/Object;

.field public final synthetic i:I

.field public final v:Ljava/lang/Object;

.field public final w:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILdc0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lug0;->i:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Lug0;->v:Ljava/lang/Object;

    .line 129
    iput p2, p0, Lug0;->w:I

    .line 130
    iput-object p3, p0, Lug0;->U:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 p0, 0x0

    .line 131
    throw p0
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ldc0;I)V
    .locals 3

    .line 1
    const/4 p3, 0x0

    .line 2
    iput p3, p0, Lug0;->i:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p4, :cond_6

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lug0;->v:Ljava/lang/Object;

    .line 14
    .line 15
    iput p4, p0, Lug0;->w:I

    .line 16
    .line 17
    new-instance p4, Llp;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p2, " value: "

    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p2, 0x5

    .line 40
    invoke-direct {p4, p1, p2}, Llp;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    array-length p2, p1

    .line 51
    add-int/lit8 p2, p2, -0x2

    .line 52
    .line 53
    if-gez p2, :cond_0

    .line 54
    .line 55
    move p2, p3

    .line 56
    :cond_0
    if-ltz p2, :cond_5

    .line 57
    .line 58
    if-nez p2, :cond_1

    .line 59
    .line 60
    sget-object p1, Lnd0;->a:Lnd0;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    array-length v0, p1

    .line 64
    if-lt p2, v0, :cond_2

    .line 65
    .line 66
    invoke-static {p1}, Lqd;->n([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const/4 v1, 0x1

    .line 72
    if-ne p2, v1, :cond_3

    .line 73
    .line 74
    sub-int/2addr v0, v1

    .line 75
    aget-object p1, p1, v0

    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    sub-int p2, v0, p2

    .line 88
    .line 89
    :goto_0
    if-ge p2, v0, :cond_4

    .line 90
    .line 91
    aget-object v2, p1, p2

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    add-int/lit8 p2, p2, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    move-object p1, v1

    .line 100
    :goto_1
    new-array p2, p3, [Ljava/lang/StackTraceElement;

    .line 101
    .line 102
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, [Ljava/lang/StackTraceElement;

    .line 107
    .line 108
    invoke-virtual {p4, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 109
    .line 110
    .line 111
    iput-object p4, p0, Lug0;->U:Ljava/lang/Object;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    const-string p0, "Requested element count "

    .line 115
    .line 116
    const-string p1, " is less than zero."

    .line 117
    .line 118
    invoke-static {p2, p0, p1}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lds0;->q(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_6
    throw v0
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lug0;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lug0;->v:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object v1

    .line 9
    :pswitch_0
    iget v0, p0, Lug0;->w:I

    .line 10
    .line 11
    invoke-static {v0}, Len;->y(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    if-eq v0, p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    if-ne v0, p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Lds0;->b()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_2
    iget-object p0, p0, Lug0;->U:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Llp;

    .line 39
    .line 40
    throw p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final v(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lpg3;
    .locals 2

    .line 1
    iget v0, p0, Lug0;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lug0;->v:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p2, Lug0;

    .line 22
    .line 23
    iget-object v1, p0, Lug0;->U:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ldc0;

    .line 26
    .line 27
    iget p0, p0, Lug0;->w:I

    .line 28
    .line 29
    invoke-direct {p2, v0, p1, v1, p0}, Lug0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ldc0;I)V

    .line 30
    .line 31
    .line 32
    move-object p0, p2

    .line 33
    :goto_0
    :pswitch_0
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
