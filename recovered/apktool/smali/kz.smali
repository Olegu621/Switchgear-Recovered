.class public final Lkz;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lmz;

.field public final synthetic c:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;


# direct methods
.method public synthetic constructor <init>(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;Lc10;I)V
    .locals 0

    .line 1
    iput p4, p0, Lkz;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lkz;->b:Lmz;

    .line 4
    .line 5
    iput-object p2, p0, Lkz;->c:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 2

    .line 1
    iget p1, p0, Lkz;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lkz;->c:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 4
    .line 5
    iget-object p0, p0, Lkz;->b:Lmz;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Lkz;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, Lkz;-><init>(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;Lc10;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lkz;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, Lkz;-><init>(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;Lc10;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lkz;->a:I

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
    invoke-virtual {p0, p1, p2}, Lkz;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lkz;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lkz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lkz;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lkz;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lkz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lkz;->a:I

    .line 2
    .line 3
    const-string v1, "consents_buffer"

    .line 4
    .line 5
    iget-object v2, p0, Lkz;->c:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 6
    .line 7
    iget-object p0, p0, Lkz;->b:Lmz;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lz10;->a:Lz10;

    .line 13
    .line 14
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lmz;->d:Lg80;

    .line 18
    .line 19
    move-object p1, p0

    .line 20
    check-cast p1, Lpz2;

    .line 21
    .line 22
    invoke-virtual {p1}, Lpz2;->c()Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;->a:Ljava/util/List;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v4, v3

    .line 48
    check-cast v4, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

    .line 49
    .line 50
    iget-wide v4, v4, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 51
    .line 52
    iget-object v6, v2, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 53
    .line 54
    iget-wide v6, v6, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->e:J

    .line 55
    .line 56
    cmp-long v4, v4, v6

    .line 57
    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    new-instance p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 65
    .line 66
    invoke-direct {p1, v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;-><init>(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    check-cast p0, Lpz2;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljb1;->h()V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 78
    .line 79
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 80
    .line 81
    sget-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer$Companion;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v2, Lb21;->a:Lr11;

    .line 88
    .line 89
    invoke-virtual {v2, v0, p1}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, v1, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 100
    .line 101
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, Lmz;->d:Lg80;

    .line 105
    .line 106
    move-object p1, p0

    .line 107
    check-cast p1, Lpz2;

    .line 108
    .line 109
    invoke-virtual {p1}, Lpz2;->c()Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

    .line 114
    .line 115
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 116
    .line 117
    iget-wide v3, v3, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->e:J

    .line 118
    .line 119
    invoke-direct {v0, v3, v4, v2}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;-><init>(JLcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;->a:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_2

    .line 129
    .line 130
    new-instance v2, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    new-instance p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 139
    .line 140
    invoke-direct {p1, v2}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;-><init>(Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    check-cast p0, Lpz2;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Ljb1;->h()V

    .line 149
    .line 150
    .line 151
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 152
    .line 153
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 154
    .line 155
    sget-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer$Companion;

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v2, Lb21;->a:Lr11;

    .line 162
    .line 163
    invoke-virtual {v2, v0, p1}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0, v1, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
