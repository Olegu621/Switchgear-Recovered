.class public final Lv7;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw7;Lez2;Ljava/lang/String;Ljava/lang/String;Lc10;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lv7;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lv7;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lv7;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lv7;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lv7;->c:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lxu0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lc10;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv7;->a:I

    .line 17
    iput-object p1, p0, Lv7;->d:Ljava/lang/Object;

    iput-object p2, p0, Lv7;->b:Ljava/lang/String;

    iput-object p3, p0, Lv7;->c:Ljava/lang/String;

    iput-object p4, p0, Lv7;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 9

    .line 1
    iget p1, p0, Lv7;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lv7;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lv7;->d:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, Lv7;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Lxu0;

    .line 14
    .line 15
    iget-object v5, p0, Lv7;->c:Ljava/lang/String;

    .line 16
    .line 17
    move-object v6, v0

    .line 18
    check-cast v6, Ljava/util/Map;

    .line 19
    .line 20
    iget-object v4, p0, Lv7;->b:Ljava/lang/String;

    .line 21
    .line 22
    move-object v7, p2

    .line 23
    invoke-direct/range {v2 .. v7}, Lv7;-><init>(Lxu0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lc10;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v7, p2

    .line 28
    new-instance v3, Lv7;

    .line 29
    .line 30
    move-object v4, v1

    .line 31
    check-cast v4, Lw7;

    .line 32
    .line 33
    move-object v5, v0

    .line 34
    check-cast v5, Lez2;

    .line 35
    .line 36
    iget-object v6, p0, Lv7;->b:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p0, p0, Lv7;->c:Ljava/lang/String;

    .line 39
    .line 40
    move-object v8, v7

    .line 41
    move-object v7, p0

    .line 42
    invoke-direct/range {v3 .. v8}, Lv7;-><init>(Lw7;Lez2;Ljava/lang/String;Ljava/lang/String;Lc10;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lv7;->a:I

    .line 2
    .line 3
    check-cast p1, Ly80;

    .line 4
    .line 5
    check-cast p2, Lc10;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lv7;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lv7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lv7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lv7;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lv7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lv7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lv7;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lv7;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lv7;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lv7;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lv7;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lz10;->a:Lz10;

    .line 15
    .line 16
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    check-cast p0, Lxu0;

    .line 20
    .line 21
    check-cast v1, Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p0, v3, v2, v1}, Lxu0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 29
    .line 30
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast p0, Lw7;

    .line 34
    .line 35
    iget-object p1, p0, Lw7;->b:Lpc2;

    .line 36
    .line 37
    iget-object p1, p1, Lpc2;->d:Lkn1;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 43
    .line 44
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    .line 45
    .line 46
    if-nez p1, :cond_0

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_0
    iget-object p0, p0, Lw7;->a:Lec;

    .line 53
    .line 54
    check-cast v1, Lez2;

    .line 55
    .line 56
    new-instance p1, Lh50;

    .line 57
    .line 58
    invoke-direct {p1}, Lh50;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lh50;->c()J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    sget-object p1, Ln02;->a:Lm02;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object p1, Ln02;->b:Lc0;

    .line 71
    .line 72
    invoke-virtual {p1}, Ln02;->c()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lec;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lhb1;

    .line 97
    .line 98
    iget-object v4, v0, Lhb1;->b:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/usercentrics/sdk/UsercentricsDomains;->a()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v6, 0x0

    .line 105
    if-eqz v5, :cond_1

    .line 106
    .line 107
    iget-object v0, v4, Lcom/usercentrics/sdk/UsercentricsDomains;->c:Ljava/lang/String;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    iget-object v0, v0, Lhb1;->a:Lbn1;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    const/4 v4, 0x1

    .line 119
    if-ne v0, v4, :cond_2

    .line 120
    .line 121
    const-string v0, "https://uct.eu.usercentrics.eu"

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    invoke-static {}, Lds0;->b()V

    .line 125
    .line 126
    .line 127
    move-object p0, v6

    .line 128
    goto :goto_1

    .line 129
    :cond_3
    const-string v0, "https://uct.service.usercentrics.eu"

    .line 130
    .line 131
    :goto_0
    iget v1, v1, Lez2;->a:I

    .line 132
    .line 133
    iget-object v4, p0, Lec;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v4, Ljava/lang/String;

    .line 136
    .line 137
    const-string v5, ""

    .line 138
    .line 139
    if-nez v2, :cond_4

    .line 140
    .line 141
    move-object v2, v5

    .line 142
    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v0, "/uct?v=1&sid="

    .line 151
    .line 152
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v0, "&t="

    .line 159
    .line 160
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v0, "&r="

    .line 167
    .line 168
    const-string v1, "&abv="

    .line 169
    .line 170
    invoke-static {v7, v0, v4, v1, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const-string v0, "&cb="

    .line 174
    .line 175
    invoke-static {v7, v0, p1}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object p0, p0, Lec;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Lxu0;

    .line 182
    .line 183
    invoke-virtual {p0, p1, v5, v6}, Lxu0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_1
    return-object p0

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
