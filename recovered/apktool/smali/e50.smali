.class public final Le50;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/g;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le50;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le50;->c:Ljava/lang/Object;

    iput-wide p2, p0, Le50;->b:J

    return-void
.end method

.method public constructor <init>(Llm3;J)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le50;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Le50;->b:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Le50;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lof3;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Le50;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, Le50;->b:J

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Le50;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Le50;->a:I

    .line 2
    .line 3
    iget-wide v1, p0, Le50;->b:J

    .line 4
    .line 5
    iget-object p0, p0, Le50;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Llm3;

    .line 11
    .line 12
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lij3;

    .line 15
    .line 16
    iget-object v0, v0, Lij3;->Y:Lof3;

    .line 17
    .line 18
    invoke-static {v0}, Lij3;->i(Leg3;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lof3;->C(J)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Llm3;->e:Lbm3;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Lof3;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2}, Lof3;->F(J)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    check-cast p0, Lcom/google/android/material/datepicker/g;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/google/android/material/datepicker/g;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v2}, Lxe2;->s(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/g;->a()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
