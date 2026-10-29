.class public final Lzs;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb50;Lc10;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lzs;->a:I

    .line 15
    iput-object p1, p0, Lzs;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 14
    iput p4, p0, Lzs;->a:I

    iput-object p1, p0, Lzs;->d:Ljava/lang/Object;

    iput-object p2, p0, Lzs;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p5, p0, Lzs;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lzs;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lzs;->e:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 10

    .line 1
    iget v0, p0, Lzs;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lzs;->e:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lzs;

    .line 9
    .line 10
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lts0;

    .line 13
    .line 14
    check-cast v1, Landroid/app/Activity;

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    invoke-direct {v0, p0, v1, p2, v2}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lzs;->c:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v3, Lzs;

    .line 25
    .line 26
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p1

    .line 29
    check-cast v4, Ljc2;

    .line 30
    .line 31
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v5, p0

    .line 34
    check-cast v5, La13;

    .line 35
    .line 36
    move-object v6, v1

    .line 37
    check-cast v6, Ljava/lang/String;

    .line 38
    .line 39
    const/4 v8, 0x7

    .line 40
    move-object v7, p2

    .line 41
    invoke-direct/range {v3 .. v8}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :pswitch_1
    move-object v8, p2

    .line 46
    new-instance p1, Lzs;

    .line 47
    .line 48
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    const/4 p2, 0x6

    .line 55
    invoke-direct {p1, p0, v1, v8, p2}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_2
    move-object v8, p2

    .line 60
    new-instance v4, Lzs;

    .line 61
    .line 62
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v5, p1

    .line 65
    check-cast v5, Lpd1;

    .line 66
    .line 67
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v6, p0

    .line 70
    check-cast v6, Landroid/net/Uri;

    .line 71
    .line 72
    move-object v7, v1

    .line 73
    check-cast v7, Landroid/view/InputEvent;

    .line 74
    .line 75
    const/4 v9, 0x5

    .line 76
    invoke-direct/range {v4 .. v9}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 77
    .line 78
    .line 79
    return-object v4

    .line 80
    :pswitch_3
    move-object v8, p2

    .line 81
    new-instance v4, Lzs;

    .line 82
    .line 83
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v5, p1

    .line 86
    check-cast v5, Lx80;

    .line 87
    .line 88
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v6, p0

    .line 91
    check-cast v6, Ltm;

    .line 92
    .line 93
    move-object v7, v1

    .line 94
    check-cast v7, Lec;

    .line 95
    .line 96
    const/4 v9, 0x4

    .line 97
    invoke-direct/range {v4 .. v9}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 98
    .line 99
    .line 100
    return-object v4

    .line 101
    :pswitch_4
    move-object v8, p2

    .line 102
    new-instance v4, Lzs;

    .line 103
    .line 104
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v5, p1

    .line 107
    check-cast v5, Lx80;

    .line 108
    .line 109
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v6, p0

    .line 112
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 113
    .line 114
    move-object v7, v1

    .line 115
    check-cast v7, Lec;

    .line 116
    .line 117
    const/4 v9, 0x3

    .line 118
    invoke-direct/range {v4 .. v9}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 119
    .line 120
    .line 121
    return-object v4

    .line 122
    :pswitch_5
    move-object v8, p2

    .line 123
    new-instance p2, Lzs;

    .line 124
    .line 125
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Lb50;

    .line 128
    .line 129
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 130
    .line 131
    const/4 v0, 0x2

    .line 132
    invoke-direct {p2, p0, v1, v8, v0}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 133
    .line 134
    .line 135
    iput-object p1, p2, Lzs;->c:Ljava/lang/Object;

    .line 136
    .line 137
    return-object p2

    .line 138
    :pswitch_6
    move-object v8, p2

    .line 139
    new-instance p0, Lzs;

    .line 140
    .line 141
    check-cast v1, Lb50;

    .line 142
    .line 143
    invoke-direct {p0, v1, v8}, Lzs;-><init>(Lb50;Lc10;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_7
    move-object v8, p2

    .line 150
    new-instance p2, Lzs;

    .line 151
    .line 152
    iget-object p0, p0, Lzs;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Lhk0;

    .line 155
    .line 156
    check-cast v1, Lat;

    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    invoke-direct {p2, p0, v1, v8, v0}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 160
    .line 161
    .line 162
    iput-object p1, p2, Lzs;->c:Ljava/lang/Object;

    .line 163
    .line 164
    return-object p2

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lzs;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lxx1;

    .line 7
    .line 8
    check-cast p2, Lc10;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lzs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ly80;

    .line 24
    .line 25
    check-cast p2, Lc10;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lzs;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ly10;

    .line 41
    .line 42
    check-cast p2, Lc10;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lzs;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ly10;

    .line 58
    .line 59
    check-cast p2, Lc10;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lzs;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ly10;

    .line 75
    .line 76
    check-cast p2, Lc10;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lzs;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ly10;

    .line 92
    .line 93
    check-cast p2, Lc10;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lzs;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ly10;

    .line 109
    .line 110
    check-cast p2, Lc10;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lzs;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, Lhk0;

    .line 126
    .line 127
    check-cast p2, Lc10;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lzs;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, Ly10;

    .line 143
    .line 144
    check-cast p2, Lc10;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, Lzs;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lzs;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lzs;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    iget-object v4, p0, Lzs;->e:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lzs;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lts0;

    .line 18
    .line 19
    sget-object v1, Lz10;->a:Lz10;

    .line 20
    .line 21
    iget v2, p0, Lzs;->b:I

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    if-ne v2, v6, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lxx1;

    .line 41
    .line 42
    new-instance v2, Ldl0;

    .line 43
    .line 44
    invoke-direct {v2, p1, v3}, Ldl0;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v0, Lts0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lm73;

    .line 50
    .line 51
    check-cast v4, Landroid/app/Activity;

    .line 52
    .line 53
    new-instance v5, Lqd1;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v3, v4, v5, v2}, Lm73;->a(Landroid/content/Context;Lqd1;Ldl0;)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Llz;

    .line 62
    .line 63
    const/16 v4, 0x10

    .line 64
    .line 65
    invoke-direct {v3, v4, v0, v2}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput v6, p0, Lzs;->b:I

    .line 69
    .line 70
    invoke-static {p1, v3, p0}, Lb40;->d(Lxx1;Llz;Ld10;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v1, :cond_2

    .line 75
    .line 76
    move-object v7, v1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_1
    return-object v7

    .line 81
    :pswitch_0
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v0, p0, Lzs;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La13;

    .line 86
    .line 87
    sget-object v1, Lz10;->a:Lz10;

    .line 88
    .line 89
    iget v2, p0, Lzs;->b:I

    .line 90
    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    if-eq v2, v6, :cond_4

    .line 94
    .line 95
    if-ne v2, v3, :cond_3

    .line 96
    .line 97
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    check-cast p1, Lo42;

    .line 101
    .line 102
    iget-object p0, p1, Lo42;->a:Ljava/lang/Object;

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_3
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    check-cast p1, Lo42;

    .line 113
    .line 114
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Ljc2;

    .line 123
    .line 124
    iget-object v2, v0, La13;->c:Ljava/lang/String;

    .line 125
    .line 126
    iput v6, p0, Lzs;->b:I

    .line 127
    .line 128
    invoke-virtual {p1, v2, v4, p0}, Ljc2;->h(Ljava/lang/String;Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v1, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    :goto_2
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-nez p1, :cond_8

    .line 140
    .line 141
    iput v3, p0, Lzs;->b:I

    .line 142
    .line 143
    invoke-static {v0, v4, p0}, La13;->e(La13;Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-ne p0, v1, :cond_7

    .line 148
    .line 149
    :goto_3
    move-object v7, v1

    .line 150
    goto :goto_5

    .line 151
    :cond_7
    :goto_4
    new-instance v7, Lo42;

    .line 152
    .line 153
    invoke-direct {v7, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :goto_5
    return-object v7

    .line 157
    :cond_8
    throw p1

    .line 158
    :pswitch_1
    iget-object v0, p0, Lzs;->d:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 161
    .line 162
    check-cast v4, Ljava/lang/String;

    .line 163
    .line 164
    sget-object v8, Lz10;->a:Lz10;

    .line 165
    .line 166
    iget v9, p0, Lzs;->b:I

    .line 167
    .line 168
    if-eqz v9, :cond_d

    .line 169
    .line 170
    if-eq v9, v6, :cond_c

    .line 171
    .line 172
    if-eq v9, v3, :cond_b

    .line 173
    .line 174
    if-eq v9, v2, :cond_a

    .line 175
    .line 176
    if-ne v9, v1, :cond_9

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_c

    .line 183
    .line 184
    :cond_a
    :goto_6
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_b

    .line 188
    .line 189
    :cond_b
    iget-object v3, p0, Lzs;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v3, Lev2;

    .line 192
    .line 193
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_c
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_d
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iput v6, p0, Lzs;->b:I

    .line 205
    .line 206
    invoke-static {v0, v4, p0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->d(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    if-ne p1, v8, :cond_e

    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_e
    :goto_7
    check-cast p1, Lev2;

    .line 214
    .line 215
    if-nez p1, :cond_f

    .line 216
    .line 217
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    goto :goto_c

    .line 220
    :cond_f
    iput-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 221
    .line 222
    iput v3, p0, Lzs;->b:I

    .line 223
    .line 224
    invoke-static {p0}, Lw11;->Y(Ld10;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    if-ne v3, v8, :cond_10

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_10
    move-object v3, p1

    .line 232
    :goto_8
    iget-object p1, v3, Lev2;->b:Ljava/util/Map;

    .line 233
    .line 234
    iget-object v3, v3, Lev2;->a:[B

    .line 235
    .line 236
    const-string v5, "content-type"

    .line 237
    .line 238
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Ljava/util/List;

    .line 243
    .line 244
    if-eqz p1, :cond_11

    .line 245
    .line 246
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    check-cast p1, Ljava/lang/String;

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_11
    move-object p1, v7

    .line 254
    :goto_9
    const-string v5, "image/svg+xml"

    .line 255
    .line 256
    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_12

    .line 261
    .line 262
    iput-object v7, p0, Lzs;->c:Ljava/lang/Object;

    .line 263
    .line 264
    iput v2, p0, Lzs;->b:I

    .line 265
    .line 266
    invoke-static {v0, v4, v3, p0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->f(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;[BLd10;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    if-ne p0, v8, :cond_13

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_12
    iput-object v7, p0, Lzs;->c:Ljava/lang/Object;

    .line 274
    .line 275
    iput v1, p0, Lzs;->b:I

    .line 276
    .line 277
    invoke-static {v0, v4, v3, p0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->e(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;[BLd10;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    if-ne p0, v8, :cond_13

    .line 282
    .line 283
    :goto_a
    move-object v7, v8

    .line 284
    goto :goto_c

    .line 285
    :cond_13
    :goto_b
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    :goto_c
    return-object v7

    .line 288
    :pswitch_2
    sget-object v0, Lz10;->a:Lz10;

    .line 289
    .line 290
    iget v1, p0, Lzs;->b:I

    .line 291
    .line 292
    if-eqz v1, :cond_15

    .line 293
    .line 294
    if-ne v1, v6, :cond_14

    .line 295
    .line 296
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto :goto_d

    .line 300
    :cond_14
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto :goto_e

    .line 304
    :cond_15
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast p1, Lpd1;

    .line 310
    .line 311
    iget-object p1, p1, Lpd1;->a:Lrd1;

    .line 312
    .line 313
    iget-object v1, p0, Lzs;->d:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v1, Landroid/net/Uri;

    .line 316
    .line 317
    check-cast v4, Landroid/view/InputEvent;

    .line 318
    .line 319
    iput v6, p0, Lzs;->b:I

    .line 320
    .line 321
    invoke-virtual {p1, v1, v4, p0}, Lrd1;->f(Landroid/net/Uri;Landroid/view/InputEvent;Lc10;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    if-ne p0, v0, :cond_16

    .line 326
    .line 327
    move-object v7, v0

    .line 328
    goto :goto_e

    .line 329
    :cond_16
    :goto_d
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    :goto_e
    return-object v7

    .line 332
    :pswitch_3
    sget-object v0, Lz10;->a:Lz10;

    .line 333
    .line 334
    iget v1, p0, Lzs;->b:I

    .line 335
    .line 336
    if-eqz v1, :cond_18

    .line 337
    .line 338
    if-ne v1, v6, :cond_17

    .line 339
    .line 340
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    goto :goto_f

    .line 344
    :cond_17
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto :goto_10

    .line 348
    :cond_18
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast p1, Lx80;

    .line 354
    .line 355
    iget-object v1, p0, Lzs;->d:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v1, Ltm;

    .line 358
    .line 359
    check-cast v4, Lec;

    .line 360
    .line 361
    iput v6, p0, Lzs;->b:I

    .line 362
    .line 363
    invoke-static {p1, v1, v4, p0}, Lx80;->a(Lx80;Lkotlin/jvm/functions/Function2;Lec;Ld10;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    if-ne p0, v0, :cond_19

    .line 368
    .line 369
    move-object v7, v0

    .line 370
    goto :goto_10

    .line 371
    :cond_19
    :goto_f
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    :goto_10
    return-object v7

    .line 374
    :pswitch_4
    sget-object v0, Lz10;->a:Lz10;

    .line 375
    .line 376
    iget v1, p0, Lzs;->b:I

    .line 377
    .line 378
    if-eqz v1, :cond_1b

    .line 379
    .line 380
    if-ne v1, v6, :cond_1a

    .line 381
    .line 382
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    goto :goto_11

    .line 386
    :cond_1a
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    goto :goto_12

    .line 390
    :cond_1b
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast p1, Lx80;

    .line 396
    .line 397
    iget-object v1, p0, Lzs;->d:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 400
    .line 401
    check-cast v4, Lec;

    .line 402
    .line 403
    iput v6, p0, Lzs;->b:I

    .line 404
    .line 405
    invoke-static {p1, v1, v4, p0}, Lx80;->a(Lx80;Lkotlin/jvm/functions/Function2;Lec;Ld10;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    if-ne p0, v0, :cond_1c

    .line 410
    .line 411
    move-object v7, v0

    .line 412
    goto :goto_12

    .line 413
    :cond_1c
    :goto_11
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    :goto_12
    return-object v7

    .line 416
    :pswitch_5
    iget-object v0, p0, Lzs;->d:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, Lb50;

    .line 419
    .line 420
    sget-object v1, Lz10;->a:Lz10;

    .line 421
    .line 422
    iget v3, p0, Lzs;->b:I

    .line 423
    .line 424
    if-eqz v3, :cond_1e

    .line 425
    .line 426
    if-ne v3, v6, :cond_1d

    .line 427
    .line 428
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_14

    .line 432
    .line 433
    :cond_1d
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    :goto_13
    move-object p1, v7

    .line 437
    goto :goto_14

    .line 438
    :cond_1e
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast p1, Ly10;

    .line 444
    .line 445
    new-instance v3, Lkx;

    .line 446
    .line 447
    invoke-direct {v3}, Lkx;-><init>()V

    .line 448
    .line 449
    .line 450
    iget-object v5, v0, Lb50;->h:Lgr0;

    .line 451
    .line 452
    invoke-virtual {v5}, Lgr0;->r()Log2;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    new-instance v8, Lkh1;

    .line 457
    .line 458
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 459
    .line 460
    invoke-interface {p1}, Ly10;->c()Lkotlin/coroutines/CoroutineContext;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    invoke-direct {v8, v4, v3, v5, p1}, Lkh1;-><init>(Lkotlin/jvm/functions/Function2;Lkx;Log2;Lkotlin/coroutines/CoroutineContext;)V

    .line 465
    .line 466
    .line 467
    iget-object p1, v0, Lb50;->l:Lra2;

    .line 468
    .line 469
    iget-object v0, p1, Lra2;->c:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v0, Lzk;

    .line 472
    .line 473
    invoke-interface {v0, v8}, Lm92;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    instance-of v4, v0, Ldt;

    .line 478
    .line 479
    if-eqz v4, :cond_20

    .line 480
    .line 481
    check-cast v0, Ldt;

    .line 482
    .line 483
    iget-object p0, v0, Ldt;->a:Ljava/lang/Throwable;

    .line 484
    .line 485
    if-nez p0, :cond_1f

    .line 486
    .line 487
    new-instance p0, Lcw;

    .line 488
    .line 489
    const-string p1, "Channel was closed normally"

    .line 490
    .line 491
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_1f
    throw p0

    .line 495
    :cond_20
    instance-of v0, v0, Let;

    .line 496
    .line 497
    if-nez v0, :cond_22

    .line 498
    .line 499
    iget-object v0, p1, Lra2;->d:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v0, Lqc3;

    .line 502
    .line 503
    iget-object v0, v0, Lqc3;->b:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-nez v0, :cond_21

    .line 512
    .line 513
    iget-object v0, p1, Lra2;->a:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v0, Ly10;

    .line 516
    .line 517
    new-instance v4, Ltm;

    .line 518
    .line 519
    const/16 v5, 0x9

    .line 520
    .line 521
    invoke-direct {v4, p1, v7, v5}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 522
    .line 523
    .line 524
    invoke-static {v0, v7, v4, v2}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 525
    .line 526
    .line 527
    :cond_21
    iput v6, p0, Lzs;->b:I

    .line 528
    .line 529
    invoke-virtual {v3, p0}, Lz01;->i(Lc10;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object p1

    .line 533
    if-ne p1, v1, :cond_23

    .line 534
    .line 535
    move-object p1, v1

    .line 536
    goto :goto_14

    .line 537
    :cond_22
    const-string p0, "Check failed."

    .line 538
    .line 539
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    goto :goto_13

    .line 543
    :cond_23
    :goto_14
    return-object p1

    .line 544
    :pswitch_6
    check-cast v4, Lb50;

    .line 545
    .line 546
    sget-object v0, Lz10;->a:Lz10;

    .line 547
    .line 548
    iget v8, p0, Lzs;->b:I

    .line 549
    .line 550
    if-eqz v8, :cond_27

    .line 551
    .line 552
    if-eq v8, v6, :cond_26

    .line 553
    .line 554
    if-eq v8, v3, :cond_25

    .line 555
    .line 556
    if-ne v8, v2, :cond_24

    .line 557
    .line 558
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    goto/16 :goto_19

    .line 562
    .line 563
    :cond_24
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    goto/16 :goto_1a

    .line 567
    .line 568
    :cond_25
    iget-object v5, p0, Lzs;->d:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v5, Lx30;

    .line 571
    .line 572
    iget-object v6, p0, Lzs;->c:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v6, Lhk0;

    .line 575
    .line 576
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    goto :goto_16

    .line 580
    :cond_26
    iget-object v5, p0, Lzs;->c:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v5, Lhk0;

    .line 583
    .line 584
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    move-object v6, v5

    .line 588
    goto :goto_15

    .line 589
    :cond_27
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast p1, Lhk0;

    .line 595
    .line 596
    iput-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 597
    .line 598
    iput v6, p0, Lzs;->b:I

    .line 599
    .line 600
    iget-object v5, v4, Lb50;->c:Ly10;

    .line 601
    .line 602
    invoke-interface {v5}, Ly10;->c()Lkotlin/coroutines/CoroutineContext;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    new-instance v6, Ln40;

    .line 607
    .line 608
    invoke-direct {v6, v4, v7, v3}, Ln40;-><init>(Lb50;Lc10;I)V

    .line 609
    .line 610
    .line 611
    invoke-static {v5, v6, p0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    if-ne v5, v0, :cond_28

    .line 616
    .line 617
    goto/16 :goto_18

    .line 618
    .line 619
    :cond_28
    move-object v6, p1

    .line 620
    move-object p1, v5

    .line 621
    :goto_15
    move-object v5, p1

    .line 622
    check-cast v5, Log2;

    .line 623
    .line 624
    instance-of p1, v5, Lx30;

    .line 625
    .line 626
    if-eqz p1, :cond_29

    .line 627
    .line 628
    move-object p1, v5

    .line 629
    check-cast p1, Lx30;

    .line 630
    .line 631
    iget-object v8, p1, Lx30;->b:Ljava/lang/Object;

    .line 632
    .line 633
    iput-object v6, p0, Lzs;->c:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object p1, p0, Lzs;->d:Ljava/lang/Object;

    .line 636
    .line 637
    iput v3, p0, Lzs;->b:I

    .line 638
    .line 639
    invoke-interface {v6, v8, p0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    if-ne p1, v0, :cond_2a

    .line 644
    .line 645
    goto :goto_18

    .line 646
    :cond_29
    instance-of p1, v5, Lhx2;

    .line 647
    .line 648
    if-nez p1, :cond_2f

    .line 649
    .line 650
    instance-of p1, v5, Lv02;

    .line 651
    .line 652
    if-nez p1, :cond_2e

    .line 653
    .line 654
    instance-of p1, v5, Lmi0;

    .line 655
    .line 656
    if-eqz p1, :cond_2a

    .line 657
    .line 658
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 659
    .line 660
    goto :goto_1a

    .line 661
    :cond_2a
    :goto_16
    iget-object p1, v4, Lb50;->h:Lgr0;

    .line 662
    .line 663
    iget-object p1, p1, Lgr0;->a:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast p1, Lrg2;

    .line 666
    .line 667
    new-instance v8, Ln40;

    .line 668
    .line 669
    const/4 v9, 0x0

    .line 670
    invoke-direct {v8, v4, v7, v9}, Ln40;-><init>(Lb50;Lc10;I)V

    .line 671
    .line 672
    .line 673
    new-instance v9, Lwc0;

    .line 674
    .line 675
    invoke-direct {v9, v1, v8, p1}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    new-instance p1, Lmj;

    .line 679
    .line 680
    invoke-direct {p1, v3, v7}, Lmj;-><init>(ILc10;)V

    .line 681
    .line 682
    .line 683
    new-instance v1, Lwc0;

    .line 684
    .line 685
    const/4 v3, 0x6

    .line 686
    invoke-direct {v1, v3, v9, p1}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    new-instance p1, Lqh;

    .line 690
    .line 691
    invoke-direct {p1, v5, v7, v2}, Lqh;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 692
    .line 693
    .line 694
    new-instance v3, Lwc0;

    .line 695
    .line 696
    const/4 v5, 0x5

    .line 697
    invoke-direct {v3, v5, v1, p1}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    new-instance p1, Ld52;

    .line 701
    .line 702
    invoke-direct {p1, v3}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    new-instance v1, Lo40;

    .line 706
    .line 707
    invoke-direct {v1, v4, v7}, Lo40;-><init>(Lb50;Lc10;)V

    .line 708
    .line 709
    .line 710
    new-instance v3, Llk0;

    .line 711
    .line 712
    invoke-direct {v3, p1, v1}, Llk0;-><init>(Ld52;Lo40;)V

    .line 713
    .line 714
    .line 715
    iput-object v7, p0, Lzs;->c:Ljava/lang/Object;

    .line 716
    .line 717
    iput-object v7, p0, Lzs;->d:Ljava/lang/Object;

    .line 718
    .line 719
    iput v2, p0, Lzs;->b:I

    .line 720
    .line 721
    instance-of p1, v6, Lgo2;

    .line 722
    .line 723
    if-nez p1, :cond_2d

    .line 724
    .line 725
    invoke-virtual {v3, v6, p0}, Llk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    if-ne p0, v0, :cond_2b

    .line 730
    .line 731
    goto :goto_17

    .line 732
    :cond_2b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 733
    .line 734
    :goto_17
    if-ne p0, v0, :cond_2c

    .line 735
    .line 736
    :goto_18
    move-object v7, v0

    .line 737
    goto :goto_1a

    .line 738
    :cond_2c
    :goto_19
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 739
    .line 740
    goto :goto_1a

    .line 741
    :cond_2d
    check-cast v6, Lgo2;

    .line 742
    .line 743
    iget-object p0, v6, Lgo2;->a:Ljava/lang/Throwable;

    .line 744
    .line 745
    throw p0

    .line 746
    :cond_2e
    check-cast v5, Lv02;

    .line 747
    .line 748
    iget-object p0, v5, Lv02;->b:Ljava/lang/Throwable;

    .line 749
    .line 750
    throw p0

    .line 751
    :cond_2f
    const-string p0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 752
    .line 753
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    :goto_1a
    return-object v7

    .line 757
    :pswitch_7
    sget-object v0, Lz10;->a:Lz10;

    .line 758
    .line 759
    iget v2, p0, Lzs;->b:I

    .line 760
    .line 761
    if-eqz v2, :cond_31

    .line 762
    .line 763
    if-ne v2, v6, :cond_30

    .line 764
    .line 765
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    goto :goto_1c

    .line 769
    :cond_30
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    goto :goto_1d

    .line 773
    :cond_31
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    iget-object p1, p0, Lzs;->c:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast p1, Ly10;

    .line 779
    .line 780
    iget-object v2, p0, Lzs;->d:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v2, Lhk0;

    .line 783
    .line 784
    check-cast v4, Lat;

    .line 785
    .line 786
    iget-object v3, v4, Lat;->a:Lkotlin/coroutines/CoroutineContext;

    .line 787
    .line 788
    iget v5, v4, Lat;->b:I

    .line 789
    .line 790
    const/4 v8, -0x3

    .line 791
    if-ne v5, v8, :cond_32

    .line 792
    .line 793
    const/4 v5, -0x2

    .line 794
    :cond_32
    iget-object v8, v4, Lat;->c:Lxk;

    .line 795
    .line 796
    sget-object v9, Lb20;->b:Lb20;

    .line 797
    .line 798
    new-instance v10, Ltm;

    .line 799
    .line 800
    invoke-direct {v10, v4, v7, v6}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 801
    .line 802
    .line 803
    invoke-static {v5, v8, v1}, Lhu0;->F(ILxk;I)Lzk;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-static {p1, v3}, Lj13;->o(Ly10;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 808
    .line 809
    .line 810
    move-result-object p1

    .line 811
    new-instance v3, Lxx1;

    .line 812
    .line 813
    invoke-direct {v3, p1, v1}, Lxx1;-><init>(Lkotlin/coroutines/CoroutineContext;Lzk;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v9, v3, v10}, Li;->W(Lb20;Li;Lkotlin/jvm/functions/Function2;)V

    .line 817
    .line 818
    .line 819
    iput v6, p0, Lzs;->b:I

    .line 820
    .line 821
    invoke-static {v2, v3, v6, p0}, Lqj3;->q(Lhk0;Lxx1;ZLd10;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object p0

    .line 825
    if-ne p0, v0, :cond_33

    .line 826
    .line 827
    goto :goto_1b

    .line 828
    :cond_33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 829
    .line 830
    :goto_1b
    if-ne p0, v0, :cond_34

    .line 831
    .line 832
    move-object v7, v0

    .line 833
    goto :goto_1d

    .line 834
    :cond_34
    :goto_1c
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 835
    .line 836
    :goto_1d
    return-object v7

    .line 837
    :pswitch_data_0
    .packed-switch 0x0
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
