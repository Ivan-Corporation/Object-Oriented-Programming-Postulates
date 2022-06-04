#![allow(unused_variables)]

fn main() {
    trait Quack {
        fn quack(&self);
    }

    struct Duck();

    impl Quack for Duck {
        fn quack(&self) {
            println!("quack!");
        }
    }

    struct RandomBird {
        is_a_parrot: bool,
    }

    impl Quack for RandomBird {
        fn quack(&self) {
            if !self.is_a_parrot {
                println!("quack!");
            } else {
                println!("squawk!");
            }
        }
    }

    let duck1 = Duck();
    let duck2 = RandomBird { is_a_parrot: false };
    let parrot = RandomBird { is_a_parrot: true };

    let ducks: Vec<&Quack> = vec![&duck1, &duck2, &parrot];

    for d in &ducks {
        d.quack();
    }
    // quack!
    // quack!
    // squawk!
}
