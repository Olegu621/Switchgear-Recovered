.class public final Lcom/quago/mobile/sdk/k;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/quago/mobile/sdk/j0;

.field public final b:Ljava/lang/String;

.field public c:I

.field public final d:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;I)V
    .locals 2

    .line 1
    const-string v0, "Class isn\'t define in DataPointContainer: "

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "DataPointContainer"

    .line 7
    .line 8
    invoke-static {v1}, Lcom/quago/mobile/sdk/k0;->a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lcom/quago/mobile/sdk/k;->a:Lcom/quago/mobile/sdk/j0;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, p0, Lcom/quago/mobile/sdk/k;->c:I

    .line 16
    .line 17
    iput-object p1, p0, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p2, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, [Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 26
    .line 27
    const-class p1, Lcom/quago/mobile/sdk/o;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    :goto_0
    if-ge v1, p3, :cond_6

    .line 37
    .line 38
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 39
    .line 40
    new-instance p2, Lcom/quago/mobile/sdk/o;

    .line 41
    .line 42
    invoke-direct {p2}, Lcom/quago/mobile/sdk/o;-><init>()V

    .line 43
    .line 44
    .line 45
    aput-object p2, p1, v1

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_0
    const-class p1, Lcom/quago/mobile/sdk/p;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    :goto_1
    if-ge v1, p3, :cond_6

    .line 62
    .line 63
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p2, Lcom/quago/mobile/sdk/p;

    .line 66
    .line 67
    invoke-direct {p2}, Lcom/quago/mobile/sdk/p;-><init>()V

    .line 68
    .line 69
    .line 70
    aput-object p2, p1, v1

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const-class p1, Lcom/quago/mobile/sdk/x;

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    :goto_2
    if-ge v1, p3, :cond_6

    .line 84
    .line 85
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 86
    .line 87
    new-instance p2, Lcom/quago/mobile/sdk/x;

    .line 88
    .line 89
    invoke-direct {p2}, Lcom/quago/mobile/sdk/x;-><init>()V

    .line 90
    .line 91
    .line 92
    aput-object p2, p1, v1

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    const-class p1, Lcom/quago/mobile/sdk/v;

    .line 98
    .line 99
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    :goto_3
    if-ge v1, p3, :cond_6

    .line 106
    .line 107
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 108
    .line 109
    new-instance p2, Lcom/quago/mobile/sdk/v;

    .line 110
    .line 111
    invoke-direct {p2}, Lcom/quago/mobile/sdk/v;-><init>()V

    .line 112
    .line 113
    .line 114
    aput-object p2, p1, v1

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const-class p1, Lcom/quago/mobile/sdk/w;

    .line 120
    .line 121
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    :goto_4
    if-ge v1, p3, :cond_6

    .line 128
    .line 129
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 130
    .line 131
    new-instance p2, Lcom/quago/mobile/sdk/w;

    .line 132
    .line 133
    invoke-direct {p2}, Lcom/quago/mobile/sdk/w;-><init>()V

    .line 134
    .line 135
    .line 136
    aput-object p2, p1, v1

    .line 137
    .line 138
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_4
    const-class p1, Lcom/quago/mobile/sdk/g1;

    .line 142
    .line 143
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    :goto_5
    if-ge v1, p3, :cond_6

    .line 150
    .line 151
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 152
    .line 153
    new-instance p2, Lcom/quago/mobile/sdk/g1;

    .line 154
    .line 155
    invoke-direct {p2}, Lcom/quago/mobile/sdk/g1;-><init>()V

    .line 156
    .line 157
    .line 158
    aput-object p2, p1, v1

    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_5
    const-class p1, Lcom/quago/mobile/sdk/k1;

    .line 164
    .line 165
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_7

    .line 170
    .line 171
    :goto_6
    if-ge v1, p3, :cond_6

    .line 172
    .line 173
    iget-object p1, p0, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    .line 174
    .line 175
    new-instance p2, Lcom/quago/mobile/sdk/k1;

    .line 176
    .line 177
    invoke-direct {p2}, Lcom/quago/mobile/sdk/k1;-><init>()V

    .line 178
    .line 179
    .line 180
    aput-object p2, p1, v1

    .line 181
    .line 182
    add-int/lit8 v1, v1, 0x1

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_6
    return-void

    .line 186
    :cond_7
    new-instance p1, Ljava/lang/ClassNotFoundException;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-direct {p1, p2}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    :goto_7
    iget-object p0, p0, Lcom/quago/mobile/sdk/k;->a:Lcom/quago/mobile/sdk/j0;

    .line 201
    .line 202
    const-string p2, "construct"

    .line 203
    .line 204
    invoke-virtual {p0, p2, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    return-void
.end method
