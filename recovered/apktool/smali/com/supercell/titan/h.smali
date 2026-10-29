.class public final Lcom/supercell/titan/h;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lcom/supercell/titan/PurchaseManagerGoogle;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/PurchaseManagerGoogle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lkj;Ljava/util/List;)V
    .locals 13

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v2, p1, Lkj;->a:I

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lve2;

    .line 25
    .line 26
    iget-object v2, p2, Lve2;->b:Lorg/json/JSONObject;

    .line 27
    .line 28
    const v0, 0x196

    const-string v3, "title"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, p2, Lve2;->b:Lorg/json/JSONObject;

    .line 35
    .line 36
    const v0, 0x197

    const-string v4, "title"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const v0, 0x198

    const-string v4, "("

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    new-instance v5, Lcom/supercell/titan/PurchaseManager$ProductInfo;

    .line 54
    .line 55
    iget-object v2, p2, Lve2;->b:Lorg/json/JSONObject;

    .line 56
    .line 57
    const v0, 0x199

    const-string v3, "description"

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {p2}, Lve2;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {p2}, Lve2;->b()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    iget-object v2, p2, Lve2;->b:Lorg/json/JSONObject;

    .line 72
    .line 73
    const v0, 0x19a

    const-string v3, "title"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    iget-object v2, p2, Lve2;->b:Lorg/json/JSONObject;

    .line 80
    .line 81
    const v0, 0x19b

    const-string v3, "price"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v2, p2, Lve2;->b:Lorg/json/JSONObject;

    .line 88
    .line 89
    const v0, 0x19c

    const-string v3, "price_currency_code"

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    invoke-direct/range {v5 .. v12}, Lcom/supercell/titan/PurchaseManager$ProductInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 99
    .line 100
    iget-object v2, v2, Lcom/supercell/titan/PurchaseManagerGoogle;->q:Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {p2}, Lve2;->a()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    iget-object v2, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 110
    .line 111
    iget-object v2, v2, Lcom/supercell/titan/PurchaseManagerGoogle;->s:Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-virtual {p2}, Lve2;->a()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    :cond_0
    iget-object p2, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 125
    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const v0, 0x19d

    const-string v3, "Google BillingClient querySkuDetailsAsync failed with responseCode:"

    .line 129
    .line 130
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget v3, p1, Lkj;->a:I

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x19e

    const-string v3, " message:"

    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    iget-object p1, p1, Lkj;->b:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput-object p1, p2, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 153
    .line 154
    const/16 p1, 0x64

    .line 155
    .line 156
    sget-object p2, Lcom/supercell/titan/SentryTitan;->a:Ljava/util/Random;

    .line 157
    .line 158
    invoke-virtual {p2, p1}, Ljava/util/Random;->nextInt(I)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-gtz p1, :cond_1

    .line 163
    .line 164
    iget-object p1, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 165
    .line 166
    iget-object p1, p1, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {p1}, Lcom/supercell/titan/SentryTitan;->b(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_1
    iget-object p1, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 172
    .line 173
    iget-object p1, p1, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 174
    .line 175
    monitor-enter p1

    .line 176
    :try_start_0
    iget-object p2, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 177
    .line 178
    iget-object p2, p2, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 181
    .line 182
    .line 183
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    iget-object p0, p0, Lcom/supercell/titan/h;->a:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 185
    .line 186
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :catchall_0
    move-exception v1

    .line 193
    move-object p0, v1

    .line 194
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    throw p0
.end method
