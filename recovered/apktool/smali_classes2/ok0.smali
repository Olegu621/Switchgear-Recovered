.class public final Lok0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lhk0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ltj2;


# direct methods
.method public constructor <init>(Le22;Lhk0;Lqh;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lok0;->a:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lok0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lok0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lok0;->d:Ltj2;

    return-void
.end method

.method public constructor <init>(Lhk0;Lkotlin/coroutines/CoroutineContext;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lok0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lok0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Lco2;->b(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lok0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Ltm;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-direct {p2, p1, v0, v1}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lok0;->d:Ltj2;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lok0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lok0;->d:Ltj2;

    .line 4
    .line 5
    iget-object v2, p0, Lok0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lok0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    .line 13
    .line 14
    check-cast v1, Ltm;

    .line 15
    .line 16
    invoke-static {v3, p1, v2, v1, p2}, Lk50;->M(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, Lz10;->a:Lz10;

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    :goto_0
    return-object p0

    .line 28
    :pswitch_0
    instance-of v0, p2, Lnk0;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Lnk0;

    .line 34
    .line 35
    iget v4, v0, Lnk0;->e:I

    .line 36
    .line 37
    const/high16 v5, -0x80000000

    .line 38
    .line 39
    and-int v6, v4, v5

    .line 40
    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    sub-int/2addr v4, v5

    .line 44
    iput v4, v0, Lnk0;->e:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v0, Lnk0;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Lnk0;-><init>(Lok0;Lc10;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object p2, v0, Lnk0;->c:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v4, Lz10;->a:Lz10;

    .line 55
    .line 56
    iget v5, v0, Lnk0;->e:I

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x3

    .line 60
    const/4 v8, 0x2

    .line 61
    const/4 v9, 0x1

    .line 62
    if-eqz v5, :cond_5

    .line 63
    .line 64
    if-eq v5, v9, :cond_4

    .line 65
    .line 66
    if-eq v5, v8, :cond_3

    .line 67
    .line 68
    if-ne v5, v7, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    move-object v4, v6

    .line 77
    goto :goto_5

    .line 78
    :cond_3
    iget-object p1, v0, Lnk0;->b:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object p0, v0, Lnk0;->a:Lok0;

    .line 81
    .line 82
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    :goto_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    check-cast v3, Le22;

    .line 94
    .line 95
    iget-boolean p2, v3, Le22;->a:Z

    .line 96
    .line 97
    if-eqz p2, :cond_7

    .line 98
    .line 99
    check-cast v2, Lhk0;

    .line 100
    .line 101
    iput v9, v0, Lnk0;->e:I

    .line 102
    .line 103
    invoke-interface {v2, p1, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, v4, :cond_6

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_7
    check-cast v1, Lqh;

    .line 114
    .line 115
    iput-object p0, v0, Lnk0;->a:Lok0;

    .line 116
    .line 117
    iput-object p1, v0, Lnk0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    iput v8, v0, Lnk0;->e:I

    .line 120
    .line 121
    invoke-virtual {v1, p1, v0}, Lqh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    if-ne p2, v4, :cond_8

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_6

    .line 135
    .line 136
    iget-object p2, p0, Lok0;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p2, Le22;

    .line 139
    .line 140
    iput-boolean v9, p2, Le22;->a:Z

    .line 141
    .line 142
    iget-object p0, p0, Lok0;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Lhk0;

    .line 145
    .line 146
    iput-object v6, v0, Lnk0;->a:Lok0;

    .line 147
    .line 148
    iput-object v6, v0, Lnk0;->b:Ljava/lang/Object;

    .line 149
    .line 150
    iput v7, v0, Lnk0;->e:I

    .line 151
    .line 152
    invoke-interface {p0, p1, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-ne p0, v4, :cond_6

    .line 157
    .line 158
    :goto_5
    return-object v4

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
