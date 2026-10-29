.class public final Lom2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ln;

.field public final synthetic c:Lkotlinx/serialization/KSerializer;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ln;Lkotlinx/serialization/KSerializer;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lom2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lom2;->b:Ln;

    .line 4
    .line 5
    iput-object p2, p0, Lom2;->c:Lkotlinx/serialization/KSerializer;

    .line 6
    .line 7
    iput-object p3, p0, Lom2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lom2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lom2;->c:Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    iget-object p0, p0, Lom2;->b:Ln;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ln;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Ln;->w()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ln;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    :goto_0
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
