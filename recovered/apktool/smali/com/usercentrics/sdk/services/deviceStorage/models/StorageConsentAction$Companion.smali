.class public final Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;",
        "serializer",
        "()Lkotlinx/serialization/KSerializer;",
        "usercentrics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lkz2;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lds0;->b()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->w:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_1
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->v:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_2
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->i:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_3
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_4
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->e:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_5
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->d:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_6
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_7
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->b:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
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


# virtual methods
.method public final serializer()Lkotlinx/serialization/KSerializer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->a:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    return-object p0
.end method
